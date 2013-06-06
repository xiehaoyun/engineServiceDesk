package com.serviceDesk.common.domain;

/**
 * TBdBuildgrouprelainfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildgrouprelainfo implements java.io.Serializable {

	// Fields

	private TBdBuildgrouprelainfoId id;

	// Constructors

	/** default constructor */
	public TBdBuildgrouprelainfo() {
	}

	/** full constructor */
	public TBdBuildgrouprelainfo(TBdBuildgrouprelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TBdBuildgrouprelainfoId getId() {
		return this.id;
	}

	public void setId(TBdBuildgrouprelainfoId id) {
		this.id = id;
	}

}