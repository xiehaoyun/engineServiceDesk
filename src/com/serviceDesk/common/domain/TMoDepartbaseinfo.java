package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoDepartbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoDepartbaseinfo implements java.io.Serializable {

	// Fields

	private String FDepartid;
	private TMoOrgbaseinfo TMoOrgbaseinfo;
	private String FDepartname;
	private String FDepartlevel;
	private String FParentdepartid;
	private String FDepartfunc;
	private Double FDepartarea;
	private Double FHeatarea;
	private Double FColdarea;
	private BigDecimal FDepartpeoplenum;
	private BigDecimal FDeparteffectnum;
	private String FDepartcontact;
	private String FDeparttel;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Set TMoDepartmonitorprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoDepartbaseinfo() {
	}

	/** minimal constructor */
	public TMoDepartbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo, String FDepartname) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.FDepartname = FDepartname;
	}

	/** full constructor */
	public TMoDepartbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo, String FDepartname,
			String FDepartlevel, String FParentdepartid, String FDepartfunc,
			Double FDepartarea, Double FHeatarea, Double FColdarea,
			BigDecimal FDepartpeoplenum, BigDecimal FDeparteffectnum,
			String FDepartcontact, String FDeparttel, Timestamp FCreatetime,
			String FCreateuser, Set TMoDepartmonitorprelainfos) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.FDepartname = FDepartname;
		this.FDepartlevel = FDepartlevel;
		this.FParentdepartid = FParentdepartid;
		this.FDepartfunc = FDepartfunc;
		this.FDepartarea = FDepartarea;
		this.FHeatarea = FHeatarea;
		this.FColdarea = FColdarea;
		this.FDepartpeoplenum = FDepartpeoplenum;
		this.FDeparteffectnum = FDeparteffectnum;
		this.FDepartcontact = FDepartcontact;
		this.FDeparttel = FDeparttel;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
	}

	// Property accessors

	public String getFDepartid() {
		return this.FDepartid;
	}

	public void setFDepartid(String FDepartid) {
		this.FDepartid = FDepartid;
	}

	public TMoOrgbaseinfo getTMoOrgbaseinfo() {
		return this.TMoOrgbaseinfo;
	}

	public void setTMoOrgbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
	}

	public String getFDepartname() {
		return this.FDepartname;
	}

	public void setFDepartname(String FDepartname) {
		this.FDepartname = FDepartname;
	}

	public String getFDepartlevel() {
		return this.FDepartlevel;
	}

	public void setFDepartlevel(String FDepartlevel) {
		this.FDepartlevel = FDepartlevel;
	}

	public String getFParentdepartid() {
		return this.FParentdepartid;
	}

	public void setFParentdepartid(String FParentdepartid) {
		this.FParentdepartid = FParentdepartid;
	}

	public String getFDepartfunc() {
		return this.FDepartfunc;
	}

	public void setFDepartfunc(String FDepartfunc) {
		this.FDepartfunc = FDepartfunc;
	}

	public Double getFDepartarea() {
		return this.FDepartarea;
	}

	public void setFDepartarea(Double FDepartarea) {
		this.FDepartarea = FDepartarea;
	}

	public Double getFHeatarea() {
		return this.FHeatarea;
	}

	public void setFHeatarea(Double FHeatarea) {
		this.FHeatarea = FHeatarea;
	}

	public Double getFColdarea() {
		return this.FColdarea;
	}

	public void setFColdarea(Double FColdarea) {
		this.FColdarea = FColdarea;
	}

	public BigDecimal getFDepartpeoplenum() {
		return this.FDepartpeoplenum;
	}

	public void setFDepartpeoplenum(BigDecimal FDepartpeoplenum) {
		this.FDepartpeoplenum = FDepartpeoplenum;
	}

	public BigDecimal getFDeparteffectnum() {
		return this.FDeparteffectnum;
	}

	public void setFDeparteffectnum(BigDecimal FDeparteffectnum) {
		this.FDeparteffectnum = FDeparteffectnum;
	}

	public String getFDepartcontact() {
		return this.FDepartcontact;
	}

	public void setFDepartcontact(String FDepartcontact) {
		this.FDepartcontact = FDepartcontact;
	}

	public String getFDeparttel() {
		return this.FDeparttel;
	}

	public void setFDeparttel(String FDeparttel) {
		this.FDeparttel = FDeparttel;
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

	public Set getTMoDepartmonitorprelainfos() {
		return this.TMoDepartmonitorprelainfos;
	}

	public void setTMoDepartmonitorprelainfos(Set TMoDepartmonitorprelainfos) {
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
	}

}