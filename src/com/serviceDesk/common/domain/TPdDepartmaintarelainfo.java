package com.serviceDesk.common.domain;

/**
 * TPdDepartmaintarelainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDepartmaintarelainfo implements java.io.Serializable {

	// Fields

	private TPdDepartmaintarelainfoId id;

	// Constructors

	/** default constructor */
	public TPdDepartmaintarelainfo() {
	}

	/** full constructor */
	public TPdDepartmaintarelainfo(TPdDepartmaintarelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TPdDepartmaintarelainfoId getId() {
		return this.id;
	}

	public void setId(TPdDepartmaintarelainfoId id) {
		this.id = id;
	}

}