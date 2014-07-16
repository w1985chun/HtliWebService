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
import com.team.htli.vo.HomeData;
import com.team.htli.vo.PagingResultData;
import com.team.htli.vo.WpPostsVo;


public interface CommonService {

	public static final int pageNum = 15;

	/**
	 * 
	 * <p>Title: getWpPostsListByPaging</p>
	 * <p>Description: 获取post列表</p>
	 * @param curPage
	 * @param pageNum
	 * @param orderType
	 * @param postType 
	 * @return
	 * @throws Exception
	 */
	public CommonResultData<PagingResultData<WpPostsVo>> getWpPostsListByPaging(
			Integer curPage, Integer pageNum, Integer orderType, String postType) throws Exception;

	public CommonResultData<HomeData> getHomeData() throws Exception;

}
