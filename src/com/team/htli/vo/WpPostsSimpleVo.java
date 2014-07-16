package com.team.htli.vo;


/**
 * WpPosts entity. @author MyEclipse Persistence Tools
 */

public class WpPostsSimpleVo implements java.io.Serializable {

	// Fields

	/** serialVersionUID*/
	private static final long serialVersionUID = 3250172380958788042L;
	private Long id;
	private String postTitle;
	private String postType;
	private String imgUrl;

	// Constructors

	/** default constructor */
	public WpPostsSimpleVo() {
	}

	public WpPostsSimpleVo(Long id,String imgUrl,String postTitle,String postType) {
		super();
		this.id = id;
		this.imgUrl = imgUrl;
		this.postTitle = postTitle;
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