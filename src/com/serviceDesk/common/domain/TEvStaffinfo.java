package com.serviceDesk.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TEvStaffinfo entity. @author MyEclipse Persistence Tools
 */

public class TEvStaffinfo implements java.io.Serializable {

	// Fields

	private Integer FStaffid;
	private String FStaffname;
	private String FStaffsex;
	private String FStafftel;
	private String FStaffemail;
	private String FStaffpost;
	private String FStafflevel;
	private Set TAlAlerthandles = new HashSet(0);
	private Set TEvEventworkorders = new HashSet(0);
	private Set TEvManagerorgrelainfos = new HashSet(0);
	private Set TEvChangeworkorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public TEvStaffinfo() {
	}

	/** full constructor */
	public TEvStaffinfo(String FStaffname, String FStaffsex, String FStafftel,
			String FStaffemail, String FStaffpost, String FStafflevel,
			Set TAlAlerthandles, Set TEvEventworkorders,
			Set TEvManagerorgrelainfos, Set TEvChangeworkorders) {
		this.FStaffname = FStaffname;
		this.FStaffsex = FStaffsex;
		this.FStafftel = FStafftel;
		this.FStaffemail = FStaffemail;
		this.FStaffpost = FStaffpost;
		this.FStafflevel = FStafflevel;
		this.TAlAlerthandles = TAlAlerthandles;
		this.TEvEventworkorders = TEvEventworkorders;
		this.TEvManagerorgrelainfos = TEvManagerorgrelainfos;
		this.TEvChangeworkorders = TEvChangeworkorders;
	}

	// Property accessors

	public Integer getFStaffid() {
		return this.FStaffid;
	}

	public void setFStaffid(Integer FStaffid) {
		this.FStaffid = FStaffid;
	}

	public String getFStaffname() {
		return this.FStaffname;
	}

	public void setFStaffname(String FStaffname) {
		this.FStaffname = FStaffname;
	}

	public String getFStaffsex() {
		return this.FStaffsex;
	}

	public void setFStaffsex(String FStaffsex) {
		this.FStaffsex = FStaffsex;
	}

	public String getFStafftel() {
		return this.FStafftel;
	}

	public void setFStafftel(String FStafftel) {
		this.FStafftel = FStafftel;
	}

	public String getFStaffemail() {
		return this.FStaffemail;
	}

	public void setFStaffemail(String FStaffemail) {
		this.FStaffemail = FStaffemail;
	}

	public String getFStaffpost() {
		return this.FStaffpost;
	}

	public void setFStaffpost(String FStaffpost) {
		this.FStaffpost = FStaffpost;
	}

	public String getFStafflevel() {
		return this.FStafflevel;
	}

	public void setFStafflevel(String FStafflevel) {
		this.FStafflevel = FStafflevel;
	}

	public Set getTAlAlerthandles() {
		return this.TAlAlerthandles;
	}

	public void setTAlAlerthandles(Set TAlAlerthandles) {
		this.TAlAlerthandles = TAlAlerthandles;
	}

	public Set getTEvEventworkorders() {
		return this.TEvEventworkorders;
	}

	public void setTEvEventworkorders(Set TEvEventworkorders) {
		this.TEvEventworkorders = TEvEventworkorders;
	}

	public Set getTEvManagerorgrelainfos() {
		return this.TEvManagerorgrelainfos;
	}

	public void setTEvManagerorgrelainfos(Set TEvManagerorgrelainfos) {
		this.TEvManagerorgrelainfos = TEvManagerorgrelainfos;
	}

	public Set getTEvChangeworkorders() {
		return this.TEvChangeworkorders;
	}

	public void setTEvChangeworkorders(Set TEvChangeworkorders) {
		this.TEvChangeworkorders = TEvChangeworkorders;
	}

}