package com.serviceDesk.config.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdDeviceinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDeviceinfo implements java.io.Serializable {

	// Fields

	private BigDecimal FDevid;
	private String FDevname;
	private String FDevbrand;
	private String FDevmodel;
	private String FDevproducer;
	private String FDevdesc;
	private Set TPdDeviceexinfos = new HashSet(0);
	private Set TPdDevassetsinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdDeviceinfo() {
	}

	/** full constructor */
	public TPdDeviceinfo(String FDevname, String FDevbrand, String FDevmodel,
			String FDevproducer, String FDevdesc, Set TPdDeviceexinfos,
			Set TPdDevassetsinfos) {
		this.FDevname = FDevname;
		this.FDevbrand = FDevbrand;
		this.FDevmodel = FDevmodel;
		this.FDevproducer = FDevproducer;
		this.FDevdesc = FDevdesc;
		this.TPdDeviceexinfos = TPdDeviceexinfos;
		this.TPdDevassetsinfos = TPdDevassetsinfos;
	}

	// Property accessors

	public BigDecimal getFDevid() {
		return this.FDevid;
	}

	public void setFDevid(BigDecimal FDevid) {
		this.FDevid = FDevid;
	}

	public String getFDevname() {
		return this.FDevname;
	}

	public void setFDevname(String FDevname) {
		this.FDevname = FDevname;
	}

	public String getFDevbrand() {
		return this.FDevbrand;
	}

	public void setFDevbrand(String FDevbrand) {
		this.FDevbrand = FDevbrand;
	}

	public String getFDevmodel() {
		return this.FDevmodel;
	}

	public void setFDevmodel(String FDevmodel) {
		this.FDevmodel = FDevmodel;
	}

	public String getFDevproducer() {
		return this.FDevproducer;
	}

	public void setFDevproducer(String FDevproducer) {
		this.FDevproducer = FDevproducer;
	}

	public String getFDevdesc() {
		return this.FDevdesc;
	}

	public void setFDevdesc(String FDevdesc) {
		this.FDevdesc = FDevdesc;
	}

	public Set getTPdDeviceexinfos() {
		return this.TPdDeviceexinfos;
	}

	public void setTPdDeviceexinfos(Set TPdDeviceexinfos) {
		this.TPdDeviceexinfos = TPdDeviceexinfos;
	}

	public Set getTPdDevassetsinfos() {
		return this.TPdDevassetsinfos;
	}

	public void setTPdDevassetsinfos(Set TPdDevassetsinfos) {
		this.TPdDevassetsinfos = TPdDevassetsinfos;
	}

}