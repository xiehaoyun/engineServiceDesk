package com.serviceDesk.common.domain;

/**
 * TPdMaintapgrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdMaintapgrelainfo implements java.io.Serializable {

	// Fields

	private TPdMaintapgrelainfoId id;

	// Constructors

	/** default constructor */
	public TPdMaintapgrelainfo() {
	}

	/** full constructor */
	public TPdMaintapgrelainfo(TPdMaintapgrelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TPdMaintapgrelainfoId getId() {
		return this.id;
	}

	public void setId(TPdMaintapgrelainfoId id) {
		this.id = id;
	}

}