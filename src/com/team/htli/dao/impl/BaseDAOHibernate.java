/**
 * <p>Title: BaseDAOHibernate.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
package com.team.htli.dao.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.team.htli.dao.iface.BaseDao;

/**
 * <p>
 * Title: BaseDAOHibernate
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @param <T>
 * @param <T>
 * @date Mar 18, 2014
 */

@Repository("baseDao")
public class BaseDAOHibernate<T> extends HibernateDaoSupport implements
		BaseDao<T> {

	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	public void deleteObject(T obj) throws Exception {
		getHibernateTemplate().delete(obj);
	}

	@SuppressWarnings("unchecked")
	public List findPageByHql(String hql, long page, long pageSize,
			Map<String, Object> paramMap) throws Exception {
		Session session = getSession();
		List dataList = new ArrayList();
		try {
			Query query = session.createQuery(hql);
			Set<String> keySet = paramMap.keySet();
			for (String key : keySet) {
				Object object = paramMap.get(key);
				query.setParameter(key, object);
			}
			if (0 < pageSize) {
				query.setFirstResult((int) ((page - 1) * pageSize));
				query.setMaxResults((int) pageSize);
				dataList = query.list();
			}
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return dataList;
	}

	@SuppressWarnings("unchecked")
	public int getCountByHql(String hql) throws Exception {
		int count = 0;
		Session session = getSession();
		try {
			SQLQuery query = session.createSQLQuery(hql);
			List list = query.list();
			count = list.size();
		} catch (Exception e) {
			throw e;
		} finally {
			session.close();
		}
		return count;
	}

	@SuppressWarnings("unchecked")
	public T getObject(Class<T> clazz, Serializable id) throws Exception {
		return (T) getHibernateTemplate().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> getObjects(Class<T> clazz) throws Exception {
		return getHibernateTemplate().loadAll(clazz);
	}

	@SuppressWarnings("unchecked")
	public List<T> queryListByHql(String hql) throws Exception {
		return getHibernateTemplate().find(hql);
	}

	public void removeObject(Class<T> clazz, Serializable id) throws Exception {
		getHibernateTemplate().delete(getObject(clazz, id));
	}

	public Serializable saveObject(T o) throws Exception {
		return getHibernateTemplate().save(o);
	}

	public void saveOrUpdate(T o) throws Exception {
		getHibernateTemplate().saveOrUpdate(o);
	}

	public void updateObject(T o) throws Exception {
		getHibernateTemplate().update(o);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByExample(T o) throws Exception {
		return getHibernateTemplate().findByExample(o);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: queryListByHql
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param hql
	 * @param vluses
	 * @return
	 * @see com.teleframe.egov.dao.iface.BaseDao#queryListByHql(java.lang.String,
	 *      java.lang.Object[])
	 */
	@SuppressWarnings("unchecked")
	public List queryListByHql(String hql, Object... values) throws Exception {
		return getHibernateTemplate().find(hql, values);
	}

	@SuppressWarnings("unchecked")
	public int queryTotalCountByHql(String hql, Map<String, Object> paramMap)
			throws Exception {
		List count = getHibernateTemplate().findByNamedParam(hql,
				paramMap.keySet().toArray(new String[] {}),
				paramMap.values().toArray());
		return (Integer) (count != null && count.size() > 0 ? count.get(0) : 0);
	}

	public List queryDataByNamed(String hql, Map<String, Object> paramMap)
			throws Exception {
		return getHibernateTemplate().findByNamedParam(hql,
				paramMap.keySet().toArray(new String[] {}),
				paramMap.values().toArray());
	}

}
