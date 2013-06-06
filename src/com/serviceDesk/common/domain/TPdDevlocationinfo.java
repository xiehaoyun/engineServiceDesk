package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdDevlocationinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDevlocationinfo implements java.io.Serializable {

	// Fields

	private String FDevlocationid;
	private TPdPowergridinfo TPdPowergridinfo;
	private String FDevlocationname;
	private String FDevloactiondesc;
	private Timestamp FInstalltime;
	private String FInstalloperator;
	private Timestamp FRemovetime;
	private String FRemoveoperator;
	private Timestamp FCreatedate;
	private String FCreateuser;
	private Set TPdDevassetsinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdDevlocationinfo() {
	}

	/** minimal constructor */
	public TPdDevlocationinfo(TPdPowergridinfo TPdPowergridinfo) {
		this.TPdPowergridinfo = TPdPowergridinfo;
	}

	/** full constructor */
	public TPdDevlocationinfo(TPdPowergridinfo TPdPowergridinfo,
			String FDevlocationname, String FDevloactiondesc,
			Timestamp FInstalltime, String FInstalloperator,
			Timestamp FRemovetime, String FRemoveoperator,
			Timestamp FCreatedate, String FCreateuser, Set TPdDevassetsinfos) {
		this.TPdPowergridinfo = TPdPowergridinfo;
		this.FDevlocationname = FDevlocationname;
		this.FDevloactiondesc = FDevloactiondesc;
		this.FInstalltime = FInstalltime;
		this.FInstalloperator = FInstalloperator;
		this.FRemovetime = FRemovetime;
		this.FRemoveoperator = FRemoveoperator;
		this.FCreatedate = FCreatedate;
		this.FCreateuser = FCreateuser;
		this.TPdDevassetsinfos = TPdDevassetsinfos;
	}

	// Property accessors

	public String getFDevlocationid() {
		return this.FDevlocationid;
	}

	public void setFDevlocationid(String FDevlocationid) {
		this.FDevlocationid = FDevlocationid;
	}

	public TPdPowergridinfo getTPdPowergridinfo() {
		return this.TPdPowergridinfo;
	}

	public void setTPdPowergridinfo(TPdPowergridinfo TPdPowergridinfo) {
		this.TPdPowergridinfo = TPdPowergridinfo;
	}

	public String getFDevlocationname() {
		return this.FDevlocationname;
	}

	public void setFDevlocationname(String FDevlocationname) {
		this.FDevlocationname = FDevlocationname;
	}

	public String getFDevloactiondesc() {
		return this.FDevloactiondesc;
	}

	public void setFDevloactiondesc(String FDevloactiondesc) {
		this.FDevloactiondesc = FDevloactiondesc;
	}

	public Timestamp getFInstalltime() {
		return this.FInstalltime;
	}

	public void setFInstalltime(Timestamp FInstalltime) {
		this.FInstalltime = FInstalltime;
	}

	public String getFInstalloperator() {
		return this.FInstalloperator;
	}

	public void setFInstalloperator(String FInstalloperator) {
		this.FInstalloperator = FInstalloperator;
	}

	public Timestamp getFRemovetime() {
		return this.FRemovetime;
	}

	public void setFRemovetime(Timestamp FRemovetime) {
		this.FRemovetime = FRemovetime;
	}

	public String getFRemoveoperator() {
		return this.FRemoveoperator;
	}

	public void setFRemoveoperator(String FRemoveoperator) {
		this.FRemoveoperator = FRemoveoperator;
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

	public Set getTPdDevassetsinfos() {
		return this.TPdDevassetsinfos;
	}

	public void setTPdDevassetsinfos(Set TPdDevassetsinfos) {
		this.TPdDevassetsinfos = TPdDevassetsinfos;
	}

}