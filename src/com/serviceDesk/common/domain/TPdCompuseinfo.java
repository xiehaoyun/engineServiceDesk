package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdCompuseinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdCompuseinfo implements java.io.Serializable {

	// Fields

	private BigDecimal FCompuseid;
	private TPdComponentinfo TPdComponentinfo;
	private TPdDevassetsinfo TPdDevassetsinfo;
	private String FCompassetsid;
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
	private Set TPdComponentrelainfosForFSoncompuseid = new HashSet(0);
	private Set TPdComponentrelainfosForFFathercompuseid = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdCompuseinfo() {
	}

	/** full constructor */
	public TPdCompuseinfo(TPdComponentinfo TPdComponentinfo,
			TPdDevassetsinfo TPdDevassetsinfo, String FCompassetsid,
			Timestamp FBuydate, Timestamp FUsedate, Timestamp FInstalltime,
			String FInstalloperator, String FServicelife, String FDeprelife,
			Timestamp FRemovetime, String FRemoveoperator,
			Timestamp FCreatedate, String FCreateuser,
			Set TPdComponentrelainfosForFSoncompuseid,
			Set TPdComponentrelainfosForFFathercompuseid) {
		this.TPdComponentinfo = TPdComponentinfo;
		this.TPdDevassetsinfo = TPdDevassetsinfo;
		this.FCompassetsid = FCompassetsid;
		this.FBuydate = FBuydate;
		this.FUsedate = FUsedate;
		this.FInstalltime = FInstalltime;
		this.FInstalloperator = FInstalloperator;
		this.FServicelife = FServicelife;
		this.FDeprelife = FDeprelife;
		this.FRemovetime = FRemovetime;
		this.FRemoveoperator = FRemoveoperator;
		this.FCreatedate = FCreatedate;
		this.FCreateuser = FCreateuser;
		this.TPdComponentrelainfosForFSoncompuseid = TPdComponentrelainfosForFSoncompuseid;
		this.TPdComponentrelainfosForFFathercompuseid = TPdComponentrelainfosForFFathercompuseid;
	}

	// Property accessors

	public BigDecimal getFCompuseid() {
		return this.FCompuseid;
	}

	public void setFCompuseid(BigDecimal FCompuseid) {
		this.FCompuseid = FCompuseid;
	}

	public TPdComponentinfo getTPdComponentinfo() {
		return this.TPdComponentinfo;
	}

	public void setTPdComponentinfo(TPdComponentinfo TPdComponentinfo) {
		this.TPdComponentinfo = TPdComponentinfo;
	}

	public TPdDevassetsinfo getTPdDevassetsinfo() {
		return this.TPdDevassetsinfo;
	}

	public void setTPdDevassetsinfo(TPdDevassetsinfo TPdDevassetsinfo) {
		this.TPdDevassetsinfo = TPdDevassetsinfo;
	}

	public String getFCompassetsid() {
		return this.FCompassetsid;
	}

	public void setFCompassetsid(String FCompassetsid) {
		this.FCompassetsid = FCompassetsid;
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

	public Set getTPdComponentrelainfosForFSoncompuseid() {
		return this.TPdComponentrelainfosForFSoncompuseid;
	}

	public void setTPdComponentrelainfosForFSoncompuseid(
			Set TPdComponentrelainfosForFSoncompuseid) {
		this.TPdComponentrelainfosForFSoncompuseid = TPdComponentrelainfosForFSoncompuseid;
	}

	public Set getTPdComponentrelainfosForFFathercompuseid() {
		return this.TPdComponentrelainfosForFFathercompuseid;
	}

	public void setTPdComponentrelainfosForFFathercompuseid(
			Set TPdComponentrelainfosForFFathercompuseid) {
		this.TPdComponentrelainfosForFFathercompuseid = TPdComponentrelainfosForFFathercompuseid;
	}

}