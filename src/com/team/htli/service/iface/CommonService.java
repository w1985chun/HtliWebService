/**
 * <p>Title: CommonService.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 29, 2014
 * @version 1.0
 */
package com.team.htli.service.iface;

import com.team.htli.model.WpPosts;
import com.team.htli.vo.CommonResultData;
import com.team.htli.vo.PagingResultData;
import com.team.htli.vo.WpPostsVo;


public interface CommonService {

	public static final int pageUtil = 15;

	/**
	 * 
	 * <p>Title: getWpPostsListByPaging</p>
	 * <p>Description: 获取post列表</p>
	 * @param curPage
	 * @param pageUtil
	 * @param orderType
	 * @return
	 * @throws Exception
	 */
	public CommonResultData<PagingResultData<WpPostsVo>> getWpPostsListByPaging(
			Integer curPage, Integer pageUtil, Integer orderType) throws Exception;

}
