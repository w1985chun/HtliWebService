/**
 * <p>Title: CommonController.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date May 29, 2014
 * @version 1.0
 */
package com.team.htli.controller;

import java.io.PrintWriter;
import java.io.Serializable;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team.htli.model.WpPosts;
import com.team.htli.service.iface.CommonService;
import com.team.htli.util.ConstConfig;
import com.team.htli.vo.CommonResultData;
import com.team.htli.vo.HomeData;
import com.team.htli.vo.PagingResultData;
import com.team.htli.vo.WpPostsVo;

/**
 * <p>
 * Title: CommonController
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date May 29, 2014
 */
@Controller
@RequestMapping("/services/common")
public class CommonController extends BaseController {

	static Logger logger = Logger.getLogger(CommonController.class.getName());

	@Autowired
	private CommonService commonService;
	
	/**
	 * 
	 * <p>Title: getPostListByPaging</p>
	 * <p>Description: </p>
	 * @param curPage  当前页
	 * @param pageNum  分页单位
	 * @param orderType 排序方式
	 * @param postType 查询类型（world:达观天下；estate:物业信息；product:群英汇；shop:认证商城）
	 * @return
	 */
	@RequestMapping(value = "/getPostListByPaging", method = RequestMethod.GET)
	@ResponseBody
	public CommonResultData<PagingResultData<WpPostsVo>> getPostListByPaging(
			@RequestParam("curPage")
			Integer curPage, @RequestParam("pageNum")
			Integer pageNum, @RequestParam("orderType")
			Integer orderType, @RequestParam("postType")
			String postType) {
		CommonResultData<PagingResultData<WpPostsVo>> result = new CommonResultData<PagingResultData<WpPostsVo>>(
				ConstConfig.GlobalResultCode.ERROR_SYS, null);
		try {
			result = commonService.getWpPostsListByPaging(curPage, pageNum ,orderType,postType);
		} catch (Exception e) {
			System.out.println("getPostListByPaging end "+e.getLocalizedMessage());
			logger.error("getPostListByPaging:", e);
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return result;
	}
	
	@RequestMapping(value = "/getHomeData", method = RequestMethod.GET)
	@ResponseBody
	public CommonResultData<HomeData> getHomeData() {
		CommonResultData<HomeData> result = new CommonResultData<HomeData>(
				ConstConfig.GlobalResultCode.ERROR_SYS, null);
		try {
			result = commonService.getHomeData();
		} catch (Exception e) {
			logger.error("getHomeData:", e);
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
		return result;
	}

}
