package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.serviceDesk.config.domain.TPdDevicestate;

/**
 * TPdDevstateresult entity. @author MyEclipse Persistence Tools
 */

public class TPdDevstateresult implements java.io.Serializable {

	// Fields

	private BigDecimal FDevstateresultid;
	private TPdDevicestate TPdDevicestate;
	private TPdDevassetsinfo TPdDevassetsinfo;
	private Double FDevstatevalue;
	private String FDevstatedesc;
	private Timestamp FCreatetime;
	private String FCreateuser;

	// Constructors

	/** default constructor */
	public TPdDevstateresult() {
	}

	/** minimal constructor */
	public TPdDevstateresult(TPdDevicestate TPdDevicestate) {
		this.TPdDevicestate = TPdDevicestate;
	}

	/** full constructor */
	public TPdDevstateresult(TPdDevicestate TPdDevicestate,
			TPdDevassetsinfo TPdDevassetsinfo, Double FDevstatevalue,
			String FDevstatedesc, Timestamp FCreatetime, String FCreateuser) {
		this.TPdDevicestate = TPdDevicestate;
		this.TPdDevassetsinfo = TPdDevassetsinfo;
		this.FDevstatevalue = FDevstatevalue;
		this.FDevstatedesc = FDevstatedesc;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
	}

	// Property accessors

	public BigDecimal getFDevstateresultid() {
		return this.FDevstateresultid;
	}

	public void setFDevstateresultid(BigDecimal FDevstateresultid) {
		this.FDevstateresultid = FDevstateresultid;
	}

	public TPdDevicestate getTPdDevicestate() {
		return this.TPdDevicestate;
	}

	public void setTPdDevicestate(TPdDevicestate TPdDevicestate) {
		this.TPdDevicestate = TPdDevicestate;
	}

	public TPdDevassetsinfo getTPdDevassetsinfo() {
		return this.TPdDevassetsinfo;
	}

	public void setTPdDevassetsinfo(TPdDevassetsinfo TPdDevassetsinfo) {
		this.TPdDevassetsinfo = TPdDevassetsinfo;
	}

	public Double getFDevstatevalue() {
		return this.FDevstatevalue;
	}

	public void setFDevstatevalue(Double FDevstatevalue) {
		this.FDevstatevalue = FDevstatevalue;
	}

	public String getFDevstatedesc() {
		return this.FDevstatedesc;
	}

	public void setFDevstatedesc(String FDevstatedesc) {
		this.FDevstatedesc = FDevstatedesc;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public String getFCreateuser() {
		return this.FCreateuser;
	}

	public void setFCreateuser(String FCreateuser) {
		this.FCreateuser = FCreateuser;
	}

}