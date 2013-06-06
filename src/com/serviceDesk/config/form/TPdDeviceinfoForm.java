package com.serviceDesk.config.form;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdDeviceinfo entity. @author MyEclipse Persistence Tools
 */
/////这里面的代码不可靠，不确定是否已经将变量或者函数的名称改正确了
public class TPdDeviceinfoForm implements java.io.Serializable {

	// Fields

	private Integer FDevid;
	private String FDevname;
	private String FDevbrand;
	private String FDevmodel;
	private String FDevproducer;
	private String FDevdesc;
	private Set TPdDeviceexinfos = new HashSet(0);
	private Set TPdDevassetsinfos = new HashSet(0);
	
	//新创建的属性(传递后以作插值)
	private String companyName;
	private String areaName;
	
	//新创建的属性(将值传递出来以作显示)
	private String orgName;

	// Constructors

	/** default constructor */
	public TPdDeviceinfoForm() {
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	/** full constructor */
	public TPdDeviceinfoForm(String FDevname, String FDevbrand, String FDevmodel,
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

	public Integer getFDevid() {
		return this.FDevid;
	}

	public void setFDevid(Integer FDevid) {
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

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
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