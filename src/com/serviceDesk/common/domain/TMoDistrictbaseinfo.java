package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoDistrictbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoDistrictbaseinfo implements java.io.Serializable {

	// Fields

	private String FDistrictcode;
	private String FDistrictname;
	private String FDistrictpostcode;
	private BigDecimal FDistrictpeoplenum;
	private Double FDistrictarea;
	private String FDistrictdesc;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Set TMoOrgbaseinfos = new HashSet(0);
	private Set TBdBuildbaseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoDistrictbaseinfo() {
	}

	/** minimal constructor */
	public TMoDistrictbaseinfo(String FDistrictname, String FDistrictpostcode) {
		this.FDistrictname = FDistrictname;
		this.FDistrictpostcode = FDistrictpostcode;
	}

	/** full constructor */
	public TMoDistrictbaseinfo(String FDistrictname, String FDistrictpostcode,
			BigDecimal FDistrictpeoplenum, Double FDistrictarea,
			String FDistrictdesc, Timestamp FCreatetime, String FCreateuser,
			Set TMoOrgbaseinfos, Set TBdBuildbaseinfos) {
		this.FDistrictname = FDistrictname;
		this.FDistrictpostcode = FDistrictpostcode;
		this.FDistrictpeoplenum = FDistrictpeoplenum;
		this.FDistrictarea = FDistrictarea;
		this.FDistrictdesc = FDistrictdesc;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
		this.TMoOrgbaseinfos = TMoOrgbaseinfos;
		this.TBdBuildbaseinfos = TBdBuildbaseinfos;
	}

	// Property accessors

	public String getFDistrictcode() {
		return this.FDistrictcode;
	}

	public void setFDistrictcode(String FDistrictcode) {
		this.FDistrictcode = FDistrictcode;
	}

	public String getFDistrictname() {
		return this.FDistrictname;
	}

	public void setFDistrictname(String FDistrictname) {
		this.FDistrictname = FDistrictname;
	}

	public String getFDistrictpostcode() {
		return this.FDistrictpostcode;
	}

	public void setFDistrictpostcode(String FDistrictpostcode) {
		this.FDistrictpostcode = FDistrictpostcode;
	}

	public BigDecimal getFDistrictpeoplenum() {
		return this.FDistrictpeoplenum;
	}

	public void setFDistrictpeoplenum(BigDecimal FDistrictpeoplenum) {
		this.FDistrictpeoplenum = FDistrictpeoplenum;
	}

	public Double getFDistrictarea() {
		return this.FDistrictarea;
	}

	public void setFDistrictarea(Double FDistrictarea) {
		this.FDistrictarea = FDistrictarea;
	}

	public String getFDistrictdesc() {
		return this.FDistrictdesc;
	}

	public void setFDistrictdesc(String FDistrictdesc) {
		this.FDistrictdesc = FDistrictdesc;
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

	public Set getTBdBuildbaseinfos() {
		return this.TBdBuildbaseinfos;
	}

	public void setTBdBuildbaseinfos(Set TBdBuildbaseinfos) {
		this.TBdBuildbaseinfos = TBdBuildbaseinfos;
	}

}