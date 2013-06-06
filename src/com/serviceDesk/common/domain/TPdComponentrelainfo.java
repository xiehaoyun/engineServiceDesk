package com.serviceDesk.common.domain;

/**
 * TPdComponentrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdComponentrelainfo implements java.io.Serializable {

	// Fields

	private TPdComponentrelainfoId id;
	private String FComponentreladesc;

	// Constructors

	/** default constructor */
	public TPdComponentrelainfo() {
	}

	/** minimal constructor */
	public TPdComponentrelainfo(TPdComponentrelainfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPdComponentrelainfo(TPdComponentrelainfoId id,
			String FComponentreladesc) {
		this.id = id;
		this.FComponentreladesc = FComponentreladesc;
	}

	// Property accessors

	public TPdComponentrelainfoId getId() {
		return this.id;
	}

	public void setId(TPdComponentrelainfoId id) {
		this.id = id;
	}

	public String getFComponentreladesc() {
		return this.FComponentreladesc;
	}

	public void setFComponentreladesc(String FComponentreladesc) {
		this.FComponentreladesc = FComponentreladesc;
	}

}