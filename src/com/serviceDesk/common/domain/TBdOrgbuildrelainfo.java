package com.serviceDesk.common.domain;

/**
 * TBdOrgbuildrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TBdOrgbuildrelainfo implements java.io.Serializable {

	// Fields

	private TBdOrgbuildrelainfoId id;

	// Constructors

	/** default constructor */
	public TBdOrgbuildrelainfo() {
	}

	/** full constructor */
	public TBdOrgbuildrelainfo(TBdOrgbuildrelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TBdOrgbuildrelainfoId getId() {
		return this.id;
	}

	public void setId(TBdOrgbuildrelainfoId id) {
		this.id = id;
	}

}