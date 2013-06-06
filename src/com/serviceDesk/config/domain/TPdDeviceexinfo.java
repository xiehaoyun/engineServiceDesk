package com.serviceDesk.config.domain;

import com.serviceDesk.common.domain.TPdDeviceexinfoId;

/**
 * TPdDeviceexinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDeviceexinfo implements java.io.Serializable {

	// Fields

	private TPdDeviceexinfoId id;
	private String FDeviceexinfovalue;

	// Constructors

	/** default constructor */
	public TPdDeviceexinfo() {
	}

	/** minimal constructor */
	public TPdDeviceexinfo(TPdDeviceexinfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPdDeviceexinfo(TPdDeviceexinfoId id, String FDeviceexinfovalue) {
		this.id = id;
		this.FDeviceexinfovalue = FDeviceexinfovalue;
	}

	// Property accessors

	public TPdDeviceexinfoId getId() {
		return this.id;
	}

	public void setId(TPdDeviceexinfoId id) {
		this.id = id;
	}

	public String getFDeviceexinfovalue() {
		return this.FDeviceexinfovalue;
	}

	public void setFDeviceexinfovalue(String FDeviceexinfovalue) {
		this.FDeviceexinfovalue = FDeviceexinfovalue;
	}

}