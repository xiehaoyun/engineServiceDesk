package com.serviceDesk.config.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdDevicestate entity. @author MyEclipse Persistence Tools
 */

public class TPdDevicestate implements java.io.Serializable {

	// Fields

	private BigDecimal FDevicestateid;
	private String FDevicestatename;
	private String FDevicestatedesc;
	private Set TPdDevstateresults = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdDevicestate() {
	}

	/** full constructor */
	public TPdDevicestate(String FDevicestatename, String FDevicestatedesc,
			Set TPdDevstateresults) {
		this.FDevicestatename = FDevicestatename;
		this.FDevicestatedesc = FDevicestatedesc;
		this.TPdDevstateresults = TPdDevstateresults;
	}

	// Property accessors

	public BigDecimal getFDevicestateid() {
		return this.FDevicestateid;
	}

	public void setFDevicestateid(BigDecimal FDevicestateid) {
		this.FDevicestateid = FDevicestateid;
	}

	public String getFDevicestatename() {
		return this.FDevicestatename;
	}

	public void setFDevicestatename(String FDevicestatename) {
		this.FDevicestatename = FDevicestatename;
	}

	public String getFDevicestatedesc() {
		return this.FDevicestatedesc;
	}

	public void setFDevicestatedesc(String FDevicestatedesc) {
		this.FDevicestatedesc = FDevicestatedesc;
	}

	public Set getTPdDevstateresults() {
		return this.TPdDevstateresults;
	}

	public void setTPdDevstateresults(Set TPdDevstateresults) {
		this.TPdDevstateresults = TPdDevstateresults;
	}

}