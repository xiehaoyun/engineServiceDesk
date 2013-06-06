package com.serviceDesk.config.form;

import com.serviceDesk.common.domain.TPdDeviceexinfoId;

/**
 * TPdDeviceexinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDeviceexinfoForm implements java.io.Serializable {

	// Fields

	private TPdDeviceexinfoId id;
	private String FDeviceexinfovalue;

	// Constructors

	/** default constructor */
	public TPdDeviceexinfoForm() {
	}

	/** minimal constructor */
	public TPdDeviceexinfoForm(TPdDeviceexinfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPdDeviceexinfoForm(TPdDeviceexinfoId id, String FDeviceexinfovalue) {
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