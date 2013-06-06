package com.serviceDesk.common.domain;

/**
 * TEcMeterecitemrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TEcMeterecitemrelainfo implements java.io.Serializable {

	// Fields

	private TEcMeterecitemrelainfoId id;

	// Constructors

	/** default constructor */
	public TEcMeterecitemrelainfo() {
	}

	/** full constructor */
	public TEcMeterecitemrelainfo(TEcMeterecitemrelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TEcMeterecitemrelainfoId getId() {
		return this.id;
	}

	public void setId(TEcMeterecitemrelainfoId id) {
		this.id = id;
	}

}