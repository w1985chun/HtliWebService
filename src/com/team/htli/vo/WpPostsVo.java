package com.team.htli.vo;

import java.sql.Timestamp;
import java.util.Date;

/**
 * WpPosts entity. @author MyEclipse Persistence Tools
 */

public class WpPostsVo implements java.io.Serializable {

	// Fields

	private Long id;
	private String postTitle;
	private String postExcerpt;
	private Date postDate;
	private String imgUrl = "http://img2.imgtn.bdimg.com/it/u=663958932,132632&fm=21&gp=0.jpg";;

	// Constructors

	/** default constructor */
	public WpPostsVo() {
	}

	public WpPostsVo(Long id, String postTitle, String postExcerpt) {
		super();
		this.id = id;
		this.postTitle = postTitle;
		this.postExcerpt = postExcerpt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostExcerpt() {
		return postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

}