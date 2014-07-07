package com.team.htli.model;

/**
 * WpTerms entity. @author MyEclipse Persistence Tools
 */

public class WpTerms implements java.io.Serializable {

	// Fields

	private Long termId;
	private String name;
	private String slug;
	private Long termGroup;

	// Constructors

	/** default constructor */
	public WpTerms() {
	}

	/** full constructor */
	public WpTerms(String name, String slug, Long termGroup) {
		this.name = name;
		this.slug = slug;
		this.termGroup = termGroup;
	}

	// Property accessors

	public Long getTermId() {
		return this.termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Long getTermGroup() {
		return this.termGroup;
	}

	public void setTermGroup(Long termGroup) {
		this.termGroup = termGroup;
	}

}