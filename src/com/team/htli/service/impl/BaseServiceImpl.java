/**
 * <p>Title: BaseServiceImp.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * <p>Company: www.teleframe.cn</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
package com.team.htli.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.team.htli.dao.iface.BaseDao;
import com.team.htli.service.iface.BaseService;

/**
 * <p>
 * Title: BaseServiceImp
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date Mar 18, 2014
 */
public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	@Qualifier("baseDao")
	private BaseDao<T> baseDao;

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: getCountByHql
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param hql
	 * @return
	 * @see com.teleframe.egov.service.iface.BaseService#getCountByHql(java.lang.String)
	 */
	public int getCountByHql(String hql) throws Exception {
		return baseDao.getCountByHql(hql);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: getObject
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 * @see com.teleframe.egov.service.iface.BaseService#getObject(java.lang.Class,
	 *      java.io.Serializable)
	 */
	public T getObject(Class<T> clazz, Serializable id) throws Exception {
		return baseDao.getObject(clazz, id);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: getObjects
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param clazz
	 * @return
	 * @see com.teleframe.egov.service.iface.BaseService#getObjects(java.lang.Class)
	 */
	public List<T> getObjects(Class<T> clazz) throws Exception {
		return baseDao.getObjects(clazz);
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
	 * @return
	 * @see com.teleframe.egov.service.iface.BaseService#queryListByHql(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	public List queryListByHql(String hql) throws Exception {
		return baseDao.queryListByHql(hql);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: removeObject
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param clazz
	 * @param id
	 * @see com.teleframe.egov.service.iface.BaseService#removeObject(java.lang.Class,
	 *      java.io.Serializable)
	 */
	public void removeObject(Class<T> clazz, Serializable id) throws Exception {
		baseDao.removeObject(clazz, id);
	}

	/**
	 * （非 Javadoc）
	 * <p>
	 * Title: saveObject
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param o
	 * @see com.teleframe.egov.service.iface.BaseService#saveObject(java.lang.Object)
	 */
	public Serializable saveObject(T o) throws Exception {
		return baseDao.saveObject(o);
	}

}
