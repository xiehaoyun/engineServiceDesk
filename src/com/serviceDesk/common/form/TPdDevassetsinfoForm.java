package com.serviceDesk.common.form;

import java.sql.Timestamp;

/**
 * TPdDevassetsinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDevassetsinfoForm implements java.io.Serializable {

	// Fields

	private String FDevassetsid;
	private Timestamp FBuydate;
	private Timestamp FUsedate;
	private Timestamp FInstalltime;
	private String FInstalloperator;
	private String FServicelife;
	private String FDeprelife;
	private Timestamp FRemovetime;
	private String FRemoveoperator;
	private Timestamp FCreatedate;
	private String FCreateuser;

	// Constructors

	/** default constructor */
	public TPdDevassetsinfoForm() {
	}


	// Property accessors

	public String getFDevassetsid() {
		return this.FDevassetsid;
	}

	public void setFDevassetsid(String FDevassetsid) {
		this.FDevassetsid = FDevassetsid;
	}

	public Timestamp getFBuydate() {
		return this.FBuydate;
	}

	public void setFBuydate(Timestamp FBuydate) {
		this.FBuydate = FBuydate;
	}

	public Timestamp getFUsedate() {
		return this.FUsedate;
	}

	public void setFUsedate(Timestamp FUsedate) {
		this.FUsedate = FUsedate;
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

	public String getFServicelife() {
		return this.FServicelife;
	}

	public void setFServicelife(String FServicelife) {
		this.FServicelife = FServicelife;
	}

	public String getFDeprelife() {
		return this.FDeprelife;
	}

	public void setFDeprelife(String FDeprelife) {
		this.FDeprelife = FDeprelife;
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

}