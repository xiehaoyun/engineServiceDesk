package com.serviceDesk.common.domain;

/**
 * TPdCompexinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdCompexinfo implements java.io.Serializable {

	// Fields

	private TPdCompexinfoId id;
	private String FCompexinfovalue;

	// Constructors

	/** default constructor */
	public TPdCompexinfo() {
	}

	/** minimal constructor */
	public TPdCompexinfo(TPdCompexinfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPdCompexinfo(TPdCompexinfoId id, String FCompexinfovalue) {
		this.id = id;
		this.FCompexinfovalue = FCompexinfovalue;
	}

	// Property accessors

	public TPdCompexinfoId getId() {
		return this.id;
	}

	public void setId(TPdCompexinfoId id) {
		this.id = id;
	}

	public String getFCompexinfovalue() {
		return this.FCompexinfovalue;
	}

	public void setFCompexinfovalue(String FCompexinfovalue) {
		this.FCompexinfovalue = FCompexinfovalue;
	}

}