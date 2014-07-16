/**
 * <p>Title: CommonServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 29, 2014
 * @version 1.0
 */
package com.team.htli.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.htli.dao.iface.WpPostsDao;
import com.team.htli.service.iface.CommonService;
import com.team.htli.util.ConstConfig;
import com.team.htli.util.Pager;
import com.team.htli.vo.CommonResultData;
import com.team.htli.vo.HomeData;
import com.team.htli.vo.PagingResultData;
import com.team.htli.vo.WpPostsSimpleVo;
import com.team.htli.vo.WpPostsVo;

@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private WpPostsDao wpPostsDao;

	public CommonResultData<PagingResultData<WpPostsVo>> getWpPostsListByPaging(
			Integer curPage, Integer pageNum, Integer orderType,
			String postType) throws Exception {
		if (pageNum == null || pageNum <= 0) {
			pageNum = CommonService.pageNum;
		}
		if (curPage <= 0) {
			curPage = 1;
		}
		String hqlCount = "select count(A) from WpPosts A where 1=1 ";
		String hqlData = "select new com.team.htli.vo.WpPostsVo(A.id,A.guid,A.postTitle,A.postExcerpt,A.postType) from WpPosts A where 1=1 ";

		Map<String, Object> paramMap = new HashMap<String, Object>();
		// 添加类型查询
		if (postType != null) {
				hqlCount += " and A.postType=:postType ";
				hqlData += " and A.postType=:postType ";
				paramMap.put("postType", postType.trim());
		}

		hqlData += " order by id desc";

		int count = wpPostsDao.queryTotalCountByHql(hqlCount, paramMap);
		Pager pager = new Pager(curPage, pageNum, count);
		List dataList = wpPostsDao.findPageByHql(hqlData,
				pager.getCurrent_page(), pageNum, paramMap);
		return new CommonResultData<PagingResultData<WpPostsVo>>(
				ConstConfig.GlobalResultCode.SUC,
				new PagingResultData<WpPostsVo>(count, dataList));
	}

	public CommonResultData<HomeData> getHomeData() throws Exception {
		List<WpPostsSimpleVo> tempList = new ArrayList<WpPostsSimpleVo>();
		tempList.add(new WpPostsSimpleVo(1L,"http://g.hiphotos.baidu.com/image/pic/item/d62a6059252dd42a46d8d6aa013b5bb5c8eab8da.jpg","达观天下室内景色1","world"));
		tempList.add(new WpPostsSimpleVo(2L,"http://b.hiphotos.baidu.com/image/pic/item/f9dcd100baa1cd118bb78d97bb12c8fcc3ce2d00.jpg","物业信息","estate"));
		tempList.add(new WpPostsSimpleVo(3L,"http://e.hiphotos.baidu.com/image/pic/item/b999a9014c086e0659cdd34200087bf40ad1cb56.jpg","群英汇","product"));
		tempList.add(new WpPostsSimpleVo(4L,"http://c.hiphotos.baidu.com/image/pic/item/cdbf6c81800a19d81e08b90c31fa828ba61e46ab.jpg","认证商城","shop"));
		tempList.add(new WpPostsSimpleVo(5L,"http://e.hiphotos.baidu.com/image/pic/item/3812b31bb051f8195a711b17d8b44aed2e73e713.jpg","达观天下室内景色2","world"));
		
		List<WpPostsSimpleVo> tempList2 = new ArrayList<WpPostsSimpleVo>();
		tempList2.add(new WpPostsSimpleVo(1L,"http://g.hiphotos.baidu.com/image/pic/item/d62a6059252dd42a46d8d6aa013b5bb5c8eab8da.jpg","达观天下室内景色1","world"));
		tempList2.add(new WpPostsSimpleVo(2L,"http://b.hiphotos.baidu.com/image/pic/item/f9dcd100baa1cd118bb78d97bb12c8fcc3ce2d00.jpg","达观天下室内景色2","world"));
		tempList2.add(new WpPostsSimpleVo(3L,"http://e.hiphotos.baidu.com/image/pic/item/b999a9014c086e0659cdd34200087bf40ad1cb56.jpg","达观天下室内景色3","world"));
		
		List<WpPostsSimpleVo> tempList3 = new ArrayList<WpPostsSimpleVo>();
		tempList3.add(new WpPostsSimpleVo(1L,"http://g.hiphotos.baidu.com/image/pic/item/d62a6059252dd42a46d8d6aa013b5bb5c8eab8da.jpg","物业信息1","estate"));
		tempList3.add(new WpPostsSimpleVo(2L,"http://b.hiphotos.baidu.com/image/pic/item/f9dcd100baa1cd118bb78d97bb12c8fcc3ce2d00.jpg","物业信息2","estate"));
		tempList3.add(new WpPostsSimpleVo(3L,"http://e.hiphotos.baidu.com/image/pic/item/b999a9014c086e0659cdd34200087bf40ad1cb56.jpg","物业信息3","estate"));
		
		return new CommonResultData<HomeData>(ConstConfig.GlobalResultCode.SUC, new HomeData(tempList,tempList2,tempList3,tempList,tempList));
	}
	
	

}
