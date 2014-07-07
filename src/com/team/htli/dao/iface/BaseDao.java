/**
 * <p>Title: BaseDao.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
package com.team.htli.dao.iface;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * Title: BaseDao
 * </p>
 * <p>
 * Description:基础Dao
 * </p>
 * 
 * @author wangchun
 * @date Mar 18, 2014
 */
public interface BaseDao<T> {

	/**
	 * 
	 * <p>
	 * Title: getObjects
	 * </p>
	 * <p>
	 * Description:获取对象列表
	 * </p>
	 * 
	 * @param clazz
	 * @return
	 */
	public List<T> getObjects(Class<T> clazz) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: getObject
	 * </p>
	 * <p>
	 * Description:根据对象ID获取单个对象
	 * </p>
	 * 
	 * @param clazz
	 * @param id
	 * @return
	 */
	public T getObject(Class<T> clazz, Serializable id) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: saveObject
	 * </p>
	 * <p>
	 * Description:保存一个对象
	 * </p>
	 * 
	 * @param o
	 */
	public Serializable saveObject(T o) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: updateObject
	 * </p>
	 * <p>
	 * Description:修改一个对象
	 * </p>
	 * 
	 * @param o
	 */
	public void updateObject(T o) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: saveOrUpdate
	 * </p>
	 * <p>
	 * Description:修改或保存一个对象
	 * </p>
	 * 
	 * @param o
	 */
	public void saveOrUpdate(T o) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: removeObject
	 * </p>
	 * <p>
	 * Description:根据ID删除一个对象
	 * </p>
	 * 
	 * @param clazz
	 * @param id
	 */
	public void removeObject(Class<T> clazz, Serializable id) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: deleteObject
	 * </p>
	 * <p>
	 * Description:删除一个对象
	 * </p>
	 * 
	 * @param obj
	 */
	public void deleteObject(T obj) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: queryListByHql
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param hql
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> queryListByHql(String hql) throws Exception;

	/**
	 * 
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
	 */
	@SuppressWarnings("unchecked")
	public List queryListByHql(String hql, Object... values) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: findPageByHql
	 * </p>
	 * <p>
	 * Description:查询分页记录数据
	 * </p>
	 * 
	 * @param hql
	 * @param page
	 * @param pageSize
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List findPageByHql(final String hql, final long page,
			final long pageSize, Map<String, Object> paramMap) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: getCountByHql
	 * </p>
	 * <p>
	 * Description:获取总记录数
	 * </p>
	 * 
	 * @param sql
	 * @return
	 */
	public int getCountByHql(String hql) throws Exception;

	/**
	 * 
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
	 */
	public int queryTotalCountByHql(String hql, Map<String, Object> paramMap)
			throws Exception;

	/**
	 * 
	 * @param o
	 * @return
	 */
	public List<T> findByExample(T o) throws Exception;

	public List queryDataByNamed(String hql, Map<String, Object> paramMap)
			throws Exception;
}
