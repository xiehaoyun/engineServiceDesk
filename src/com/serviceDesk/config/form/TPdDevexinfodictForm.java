package com.serviceDesk.config.form;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdDevexinfodict entity. @author MyEclipse Persistence Tools
 */

public class TPdDevexinfodictForm implements java.io.Serializable {

	// Fields

	private BigDecimal FDevexinfoid;
	private String FDevexinfoname;
	private String FDevexinfodatatype;
	private String FDevexinfodesc;
	private Set TPdDeviceexinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdDevexinfodictForm() {
	}

	/** full constructor */
	public TPdDevexinfodictForm(String FDevexinfoname, String FDevexinfodatatype,
			String FDevexinfodesc, Set TPdDeviceexinfos) {
		this.FDevexinfoname = FDevexinfoname;
		this.FDevexinfodatatype = FDevexinfodatatype;
		this.FDevexinfodesc = FDevexinfodesc;
		this.TPdDeviceexinfos = TPdDeviceexinfos;
	}

	// Property accessors

	public BigDecimal getFDevexinfoid() {
		return this.FDevexinfoid;
	}

	public void setFDevexinfoid(BigDecimal FDevexinfoid) {
		this.FDevexinfoid = FDevexinfoid;
	}

	public String getFDevexinfoname() {
		return this.FDevexinfoname;
	}

	public void setFDevexinfoname(String FDevexinfoname) {
		this.FDevexinfoname = FDevexinfoname;
	}

	public String getFDevexinfodatatype() {
		return this.FDevexinfodatatype;
	}

	public void setFDevexinfodatatype(String FDevexinfodatatype) {
		this.FDevexinfodatatype = FDevexinfodatatype;
	}

	public String getFDevexinfodesc() {
		return this.FDevexinfodesc;
	}

	public void setFDevexinfodesc(String FDevexinfodesc) {
		this.FDevexinfodesc = FDevexinfodesc;
	}

	public Set getTPdDeviceexinfos() {
		return this.TPdDeviceexinfos;
	}

	public void setTPdDeviceexinfos(Set TPdDeviceexinfos) {
		this.TPdDeviceexinfos = TPdDeviceexinfos;
	}

}