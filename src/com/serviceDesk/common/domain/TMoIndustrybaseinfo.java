package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoIndustrybaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoIndustrybaseinfo implements java.io.Serializable {

	// Fields

	private String FIndustrycode;
	private String FIndustryname;
	private String FIndustrydesc;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Set TMoOrgbaseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoIndustrybaseinfo() {
	}

	/** minimal constructor */
	public TMoIndustrybaseinfo(String FIndustryname, String FIndustrydesc) {
		this.FIndustryname = FIndustryname;
		this.FIndustrydesc = FIndustrydesc;
	}

	/** full constructor */
	public TMoIndustrybaseinfo(String FIndustryname, String FIndustrydesc,
			Timestamp FCreatetime, String FCreateuser, Set TMoOrgbaseinfos) {
		this.FIndustryname = FIndustryname;
		this.FIndustrydesc = FIndustrydesc;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
		this.TMoOrgbaseinfos = TMoOrgbaseinfos;
	}

	// Property accessors

	public String getFIndustrycode() {
		return this.FIndustrycode;
	}

	public void setFIndustrycode(String FIndustrycode) {
		this.FIndustrycode = FIndustrycode;
	}

	public String getFIndustryname() {
		return this.FIndustryname;
	}

	public void setFIndustryname(String FIndustryname) {
		this.FIndustryname = FIndustryname;
	}

	public String getFIndustrydesc() {
		return this.FIndustrydesc;
	}

	public void setFIndustrydesc(String FIndustrydesc) {
		this.FIndustrydesc = FIndustrydesc;
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

	public Set getTMoOrgbaseinfos() {
		return this.TMoOrgbaseinfos;
	}

	public void setTMoOrgbaseinfos(Set TMoOrgbaseinfos) {
		this.TMoOrgbaseinfos = TMoOrgbaseinfos;
	}

}