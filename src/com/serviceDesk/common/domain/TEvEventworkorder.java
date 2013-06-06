package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TEvEventworkorder entity. @author MyEclipse Persistence Tools
 */

public class TEvEventworkorder implements java.io.Serializable {

	// Fields

	private BigDecimal FEventworkorderid;
	private TEvEventinfo TEvEventinfo;
	private TEvStaffinfo TEvStaffinfo;
	private String FWorkorderlevel;
	private Timestamp FCreatedate;
	private String FCreateuser;
	private String FCustomername;
	private String FCustomertel;
	private String FWorkorderdesc;
	private String FServicerecord;
	private String FOrgname;
	private String FDepartname;
	private String FBuildname;
	private String FMonitoraname;
	private Set TEvChangeworkorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public TEvEventworkorder() {
	}

	/** full constructor */
	public TEvEventworkorder(TEvEventinfo TEvEventinfo,
			TEvStaffinfo TEvStaffinfo, String FWorkorderlevel,
			Timestamp FCreatedate, String FCreateuser, String FCustomername,
			String FCustomertel, String FWorkorderdesc, String FServicerecord,
			String FOrgname, String FDepartname, String FBuildname,
			String FMonitoraname, Set TEvChangeworkorders) {
		this.TEvEventinfo = TEvEventinfo;
		this.TEvStaffinfo = TEvStaffinfo;
		this.FWorkorderlevel = FWorkorderlevel;
		this.FCreatedate = FCreatedate;
		this.FCreateuser = FCreateuser;
		this.FCustomername = FCustomername;
		this.FCustomertel = FCustomertel;
		this.FWorkorderdesc = FWorkorderdesc;
		this.FServicerecord = FServicerecord;
		this.FOrgname = FOrgname;
		this.FDepartname = FDepartname;
		this.FBuildname = FBuildname;
		this.FMonitoraname = FMonitoraname;
		this.TEvChangeworkorders = TEvChangeworkorders;
	}

	// Property accessors

	public BigDecimal getFEventworkorderid() {
		return this.FEventworkorderid;
	}

	public void setFEventworkorderid(BigDecimal FEventworkorderid) {
		this.FEventworkorderid = FEventworkorderid;
	}

	public TEvEventinfo getTEvEventinfo() {
		return this.TEvEventinfo;
	}

	public void setTEvEventinfo(TEvEventinfo TEvEventinfo) {
		this.TEvEventinfo = TEvEventinfo;
	}

	public TEvStaffinfo getTEvStaffinfo() {
		return this.TEvStaffinfo;
	}

	public void setTEvStaffinfo(TEvStaffinfo TEvStaffinfo) {
		this.TEvStaffinfo = TEvStaffinfo;
	}

	public String getFWorkorderlevel() {
		return this.FWorkorderlevel;
	}

	public void setFWorkorderlevel(String FWorkorderlevel) {
		this.FWorkorderlevel = FWorkorderlevel;
	}

	public Timestamp getFCreatedate() {
		return this.FCreatedate;
	}

	public void setFCreatedate(Timestamp FCreatedate) {
		this.FCreatedate = FCreatedate;
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

	public String getFWorkorderdesc() {
		return this.FWorkorderdesc;
	}

	public void setFWorkorderdesc(String FWorkorderdesc) {
		this.FWorkorderdesc = FWorkorderdesc;
	}

	public String getFServicerecord() {
		return this.FServicerecord;
	}

	public void setFServicerecord(String FServicerecord) {
		this.FServicerecord = FServicerecord;
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

	public Set getTEvChangeworkorders() {
		return this.TEvChangeworkorders;
	}

	public void setTEvChangeworkorders(Set TEvChangeworkorders) {
		this.TEvChangeworkorders = TEvChangeworkorders;
	}

}