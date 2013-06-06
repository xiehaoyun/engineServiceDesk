package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TEvEventinfo entity. @author MyEclipse Persistence Tools
 */

public class TEvEventinfo implements java.io.Serializable {

	// Fields

	private BigDecimal FEventrecordid;
	private TPdDevassetsinfo TPdDevassetsinfo;
	private String FEventsource;
	private String FEventtype;
	private String FEventstate;
	private Timestamp FFinishtime;
	private String FCreateuser;
	private String FCustomername;
	private String FCustomertel;
	private String FAccmanager;
	private String FEventdesc;
	private String FSevicerecord;
	private String FSolution;
	private String FOrgname;
	private String FDepartname;
	private String FBuildname;
	private String FMonitoraname;
	private Timestamp FCreatetime;
	private Set TEvEventworkorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public TEvEventinfo() {
	}

	/** full constructor */
	public TEvEventinfo(TPdDevassetsinfo TPdDevassetsinfo, String FEventsource,
			String FEventtype, String FEventstate, Timestamp FFinishtime,
			String FCreateuser, String FCustomername, String FCustomertel,
			String FAccmanager, String FEventdesc, String FSevicerecord,
			String FSolution, String FOrgname, String FDepartname,
			String FBuildname, String FMonitoraname, Timestamp FCreatetime,
			Set TEvEventworkorders) {
		this.TPdDevassetsinfo = TPdDevassetsinfo;
		this.FEventsource = FEventsource;
		this.FEventtype = FEventtype;
		this.FEventstate = FEventstate;
		this.FFinishtime = FFinishtime;
		this.FCreateuser = FCreateuser;
		this.FCustomername = FCustomername;
		this.FCustomertel = FCustomertel;
		this.FAccmanager = FAccmanager;
		this.FEventdesc = FEventdesc;
		this.FSevicerecord = FSevicerecord;
		this.FSolution = FSolution;
		this.FOrgname = FOrgname;
		this.FDepartname = FDepartname;
		this.FBuildname = FBuildname;
		this.FMonitoraname = FMonitoraname;
		this.FCreatetime = FCreatetime;
		this.TEvEventworkorders = TEvEventworkorders;
	}

	// Property accessors

	public BigDecimal getFEventrecordid() {
		return this.FEventrecordid;
	}

	public void setFEventrecordid(BigDecimal FEventrecordid) {
		this.FEventrecordid = FEventrecordid;
	}

	public TPdDevassetsinfo getTPdDevassetsinfo() {
		return this.TPdDevassetsinfo;
	}

	public void setTPdDevassetsinfo(TPdDevassetsinfo TPdDevassetsinfo) {
		this.TPdDevassetsinfo = TPdDevassetsinfo;
	}

	public String getFEventsource() {
		return this.FEventsource;
	}

	public void setFEventsource(String FEventsource) {
		this.FEventsource = FEventsource;
	}

	public String getFEventtype() {
		return this.FEventtype;
	}

	public void setFEventtype(String FEventtype) {
		this.FEventtype = FEventtype;
	}

	public String getFEventstate() {
		return this.FEventstate;
	}

	public void setFEventstate(String FEventstate) {
		this.FEventstate = FEventstate;
	}

	public Timestamp getFFinishtime() {
		return this.FFinishtime;
	}

	public void setFFinishtime(Timestamp FFinishtime) {
		this.FFinishtime = FFinishtime;
	}

	public String getFCreateuser() {
		return this.FCreateuser;
	}

	public void setFCreateuser(String FCreateuser) {
		this.FCreateuser = FCreateuser;
	}

	public String getFCustomername() {
		return this.FCustomername;
	}

	public void setFCustomername(String FCustomername) {
		this.FCustomername = FCustomername;
	}

	public String getFCustomertel() {
		return this.FCustomertel;
	}

	public void setFCustomertel(String FCustomertel) {
		this.FCustomertel = FCustomertel;
	}

	public String getFAccmanager() {
		return this.FAccmanager;
	}

	public void setFAccmanager(String FAccmanager) {
		this.FAccmanager = FAccmanager;
	}

	public String getFEventdesc() {
		return this.FEventdesc;
	}

	public void setFEventdesc(String FEventdesc) {
		this.FEventdesc = FEventdesc;
	}

	public String getFSevicerecord() {
		return this.FSevicerecord;
	}

	public void setFSevicerecord(String FSevicerecord) {
		this.FSevicerecord = FSevicerecord;
	}

	public String getFSolution() {
		return this.FSolution;
	}

	public void setFSolution(String FSolution) {
		this.FSolution = FSolution;
	}

	public String getFOrgname() {
		return this.FOrgname;
	}

	public void setFOrgname(String FOrgname) {
		this.FOrgname = FOrgname;
	}

	public String getFDepartname() {
		return this.FDepartname;
	}

	public void setFDepartname(String FDepartname) {
		this.FDepartname = FDepartname;
	}

	public String getFBuildname() {
		return this.FBuildname;
	}

	public void setFBuildname(String FBuildname) {
		this.FBuildname = FBuildname;
	}

	public String getFMonitoraname() {
		return this.FMonitoraname;
	}

	public void setFMonitoraname(String FMonitoraname) {
		this.FMonitoraname = FMonitoraname;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public Set getTEvEventworkorders() {
		return this.TEvEventworkorders;
	}

	public void setTEvEventworkorders(Set TEvEventworkorders) {
		this.TEvEventworkorders = TEvEventworkorders;
	}

}