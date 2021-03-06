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
	private String postType;
	private Date postDate;
	private String imgUrl;

	// Constructors

	/** default constructor */
	public WpPostsVo() {
	}

	public WpPostsVo(Long id,String imgUrl,String postTitle, String postExcerpt,String postType) {
		super();
		this.id = id;
		this.imgUrl = imgUrl;
		this.postTitle = postTitle;
		this.postExcerpt = postExcerpt;
		this.postType = postType;
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

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

}