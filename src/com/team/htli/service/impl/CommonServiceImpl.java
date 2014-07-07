/**
 * <p>Title: CommonServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 29, 2014
 * @version 1.0
 */
package com.team.htli.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.htli.dao.iface.WpPostsDao;
import com.team.htli.model.WpPosts;
import com.team.htli.service.iface.CommonService;
import com.team.htli.util.ConstConfig;
import com.team.htli.util.Pager;
import com.team.htli.vo.CommonResultData;
import com.team.htli.vo.PagingResultData;
import com.team.htli.vo.WpPostsVo;


@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private WpPostsDao wpPostsDao;
	
	public CommonResultData<PagingResultData<WpPostsVo>> getWpPostsListByPaging(
			Integer curPage, Integer pageUtil, Integer orderType)
			throws Exception {
		if (pageUtil == null || pageUtil <= 0) {
			pageUtil = CommonService.pageUtil;
		}
		if (curPage <= 0) {
			curPage = 1;
		}
		String hqlCount = "select count(A) from WpPosts A where 1=1 ";
		String hqlData = "select new com.team.htli.vo.WpPostsVo(A.id,A.postTitle,A.postExcerpt) from WpPosts A where 1=1 order by id desc";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		
		int count = wpPostsDao.queryTotalCountByHql(hqlCount, paramMap);
		Pager pager = new Pager(curPage, pageUtil, count);
		List dataList = wpPostsDao.findPageByHql(hqlData, pager
				.getCurrent_page(), pageUtil, paramMap);
		return new CommonResultData<PagingResultData<WpPostsVo>>(
				ConstConfig.GlobalResultCode.SUC,
				new PagingResultData<WpPostsVo>(count, dataList));
	}


}
