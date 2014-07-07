/**
 * <p>Title: UserinfoDaoImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 27, 2014
 * @version 1.0
 */
package com.team.htli.dao.impl;

import org.springframework.stereotype.Repository;

import com.team.htli.dao.iface.WpPostsDao;
import com.team.htli.model.WpPosts;

/**
 * <p>
 * Title: WpPostsDaoImpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date May 27, 2014
 */
@Repository
public class WpPostsDaoImpl extends BaseDAOHibernate<WpPosts> implements
		WpPostsDao {
}
