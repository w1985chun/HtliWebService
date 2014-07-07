/**
 * <p>Title: BaseService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date Mar 18, 2014
 * @version 1.0
 */
package com.team.htli.service.iface;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: BaseService
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date Mar 18, 2014
 */
public interface BaseService<T> {

	public List<T> getObjects(Class<T> clazz) throws Exception;

	public T getObject(Class<T> clazz, Serializable id) throws Exception;

	public Serializable saveObject(T o) throws Exception;

	public void removeObject(Class<T> clazz, Serializable id) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: queryListByHql
	 * </p>
	 * <p>
	 * Description:用标准sql语言查询List
	 * </p>
	 * 
	 * @param hql
	 * @return
	 */
	public List<T> queryListByHql(String hql) throws Exception;

	/**
	 * 
	 * <p>
	 * Title: getCountByHql
	 * </p>
	 * <p>
	 * Description:得到记录数
	 * </p>
	 * 
	 * @param hql
	 * @return
	 */
	public int getCountByHql(String hql) throws Exception;

}
