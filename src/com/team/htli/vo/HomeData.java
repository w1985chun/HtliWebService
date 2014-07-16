/**
 * <p>Title: HomeData.java</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2014</p>
 * @author wangchun
 * @date 2014-7-13
 * @version 1.0
 */
package com.team.htli.vo;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * Title: HomeData
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author wangchun
 * @date 2014-7-13
 */
public class HomeData implements Serializable {

	/** serialVersionUID */
	private static final long serialVersionUID = 2892353458864368491L;

	private List<WpPostsSimpleVo> commonTopList;
	private List<WpPostsSimpleVo> worldTopList;
	private List<WpPostsSimpleVo> estateTopList;
	private List<WpPostsSimpleVo> productTopList;
	private List<WpPostsSimpleVo> shopTopList;

	public HomeData() {
	}

	public HomeData(List<WpPostsSimpleVo> commonTopList,
			List<WpPostsSimpleVo> worldTopList,
			List<WpPostsSimpleVo> estateTopList,
			List<WpPostsSimpleVo> productTopList,
			List<WpPostsSimpleVo> shopTopList) {
		this.commonTopList = commonTopList;
		this.worldTopList = worldTopList;
		this.estateTopList = estateTopList;
		this.productTopList = productTopList;
		this.shopTopList = shopTopList;
	}

	public List<WpPostsSimpleVo> getCommonTopList() {
		return commonTopList;
	}

	public void setCommonTopList(List<WpPostsSimpleVo> commonTopList) {
		this.commonTopList = commonTopList;
	}

	public List<WpPostsSimpleVo> getWorldTopList() {
		return worldTopList;
	}

	public void setWorldTopList(List<WpPostsSimpleVo> worldTopList) {
		this.worldTopList = worldTopList;
	}

	public List<WpPostsSimpleVo> getEstateTopList() {
		return estateTopList;
	}

	public void setEstateTopList(List<WpPostsSimpleVo> estateTopList) {
		this.estateTopList = estateTopList;
	}

	public List<WpPostsSimpleVo> getProductTopList() {
		return productTopList;
	}

	public void setProductTopList(List<WpPostsSimpleVo> productTopList) {
		this.productTopList = productTopList;
	}

	public List<WpPostsSimpleVo> getShopTopList() {
		return shopTopList;
	}

	public void setShopTopList(List<WpPostsSimpleVo> shopTopList) {
		this.shopTopList = shopTopList;
	}

}
