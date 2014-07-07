package com.team.htli.model;

import java.sql.Timestamp;

/**
 * WpPosts entity. @author MyEclipse Persistence Tools
 */

public class WpPosts implements java.io.Serializable {

	// Fields

	private Long id;
	private Long postAuthor;
	private Timestamp postDate;
	private Timestamp postDateGmt;
	private String postContent;
	private String postTitle;
	private String postExcerpt;
	private String postStatus;
	private String commentStatus;
	private String pingStatus;
	private String postPassword;
	private String postName;
	private String toPing;
	private String pinged;
	private Timestamp postModified;
	private Timestamp postModifiedGmt;
	private String postContentFiltered;
	private Long postParent;
	private String guid;
	private Integer menuOrder;
	private String postType;
	private String postMimeType;
	private Long commentCount;

	// Constructors

	/** default constructor */
	public WpPosts() {
	}

	/** full constructor */
	public WpPosts(Long postAuthor, Timestamp postDate, Timestamp postDateGmt,
			String postContent, String postTitle, String postExcerpt,
			String postStatus, String commentStatus, String pingStatus,
			String postPassword, String postName, String toPing, String pinged,
			Timestamp postModified, Timestamp postModifiedGmt,
			String postContentFiltered, Long postParent, String guid,
			Integer menuOrder, String postType, String postMimeType,
			Long commentCount) {
		this.postAuthor = postAuthor;
		this.postDate = postDate;
		this.postDateGmt = postDateGmt;
		this.postContent = postContent;
		this.postTitle = postTitle;
		this.postExcerpt = postExcerpt;
		this.postStatus = postStatus;
		this.commentStatus = commentStatus;
		this.pingStatus = pingStatus;
		this.postPassword = postPassword;
		this.postName = postName;
		this.toPing = toPing;
		this.pinged = pinged;
		this.postModified = postModified;
		this.postModifiedGmt = postModifiedGmt;
		this.postContentFiltered = postContentFiltered;
		this.postParent = postParent;
		this.guid = guid;
		this.menuOrder = menuOrder;
		this.postType = postType;
		this.postMimeType = postMimeType;
		this.commentCount = commentCount;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostAuthor() {
		return this.postAuthor;
	}

	public void setPostAuthor(Long postAuthor) {
		this.postAuthor = postAuthor;
	}

	public Timestamp getPostDate() {
		return this.postDate;
	}

	public void setPostDate(Timestamp postDate) {
		this.postDate = postDate;
	}

	public Timestamp getPostDateGmt() {
		return this.postDateGmt;
	}

	public void setPostDateGmt(Timestamp postDateGmt) {
		this.postDateGmt = postDateGmt;
	}

	public String getPostContent() {
		return this.postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostTitle() {
		return this.postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostExcerpt() {
		return this.postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public String getPostStatus() {
		return this.postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getCommentStatus() {
		return this.commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getPingStatus() {
		return this.pingStatus;
	}

	public void setPingStatus(String pingStatus) {
		this.pingStatus = pingStatus;
	}

	public String getPostPassword() {
		return this.postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public String getPostName() {
		return this.postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getToPing() {
		return this.toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
	}

	public String getPinged() {
		return this.pinged;
	}

	public void setPinged(String pinged) {
		this.pinged = pinged;
	}

	public Timestamp getPostModified() {
		return this.postModified;
	}

	public void setPostModified(Timestamp postModified) {
		this.postModified = postModified;
	}

	public Timestamp getPostModifiedGmt() {
		return this.postModifiedGmt;
	}

	public void setPostModifiedGmt(Timestamp postModifiedGmt) {
		this.postModifiedGmt = postModifiedGmt;
	}

	public String getPostContentFiltered() {
		return this.postContentFiltered;
	}

	public void setPostContentFiltered(String postContentFiltered) {
		this.postContentFiltered = postContentFiltered;
	}

	public Long getPostParent() {
		return this.postParent;
	}

	public void setPostParent(Long postParent) {
		this.postParent = postParent;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getMenuOrder() {
		return this.menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getPostType() {
		return this.postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getPostMimeType() {
		return this.postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public Long getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

}