package com.team.htli.model;

import java.sql.Timestamp;

/**
 * WpComments entity. @author MyEclipse Persistence Tools
 */

public class WpComments implements java.io.Serializable {

	// Fields

	private Long commentId;
	private Long commentPostId;
	private String commentAuthor;
	private String commentAuthorEmail;
	private String commentAuthorUrl;
	private String commentAuthorIp;
	private Timestamp commentDate;
	private Timestamp commentDateGmt;
	private String commentContent;
	private Integer commentKarma;
	private String commentApproved;
	private String commentAgent;
	private String commentType;
	private Long commentParent;
	private Long userId;

	// Constructors

	/** default constructor */
	public WpComments() {
	}

	/** full constructor */
	public WpComments(Long commentPostId, String commentAuthor,
			String commentAuthorEmail, String commentAuthorUrl,
			String commentAuthorIp, Timestamp commentDate,
			Timestamp commentDateGmt, String commentContent,
			Integer commentKarma, String commentApproved, String commentAgent,
			String commentType, Long commentParent, Long userId) {
		this.commentPostId = commentPostId;
		this.commentAuthor = commentAuthor;
		this.commentAuthorEmail = commentAuthorEmail;
		this.commentAuthorUrl = commentAuthorUrl;
		this.commentAuthorIp = commentAuthorIp;
		this.commentDate = commentDate;
		this.commentDateGmt = commentDateGmt;
		this.commentContent = commentContent;
		this.commentKarma = commentKarma;
		this.commentApproved = commentApproved;
		this.commentAgent = commentAgent;
		this.commentType = commentType;
		this.commentParent = commentParent;
		this.userId = userId;
	}

	// Property accessors

	public Long getCommentId() {
		return this.commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getCommentPostId() {
		return this.commentPostId;
	}

	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}

	public String getCommentAuthor() {
		return this.commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentAuthorEmail() {
		return this.commentAuthorEmail;
	}

	public void setCommentAuthorEmail(String commentAuthorEmail) {
		this.commentAuthorEmail = commentAuthorEmail;
	}

	public String getCommentAuthorUrl() {
		return this.commentAuthorUrl;
	}

	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}

	public String getCommentAuthorIp() {
		return this.commentAuthorIp;
	}

	public void setCommentAuthorIp(String commentAuthorIp) {
		this.commentAuthorIp = commentAuthorIp;
	}

	public Timestamp getCommentDate() {
		return this.commentDate;
	}

	public void setCommentDate(Timestamp commentDate) {
		this.commentDate = commentDate;
	}

	public Timestamp getCommentDateGmt() {
		return this.commentDateGmt;
	}

	public void setCommentDateGmt(Timestamp commentDateGmt) {
		this.commentDateGmt = commentDateGmt;
	}

	public String getCommentContent() {
		return this.commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Integer getCommentKarma() {
		return this.commentKarma;
	}

	public void setCommentKarma(Integer commentKarma) {
		this.commentKarma = commentKarma;
	}

	public String getCommentApproved() {
		return this.commentApproved;
	}

	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}

	public String getCommentAgent() {
		return this.commentAgent;
	}

	public void setCommentAgent(String commentAgent) {
		this.commentAgent = commentAgent;
	}

	public String getCommentType() {
		return this.commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public Long getCommentParent() {
		return this.commentParent;
	}

	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}