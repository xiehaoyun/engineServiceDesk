package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import com.serviceDesk.config.domain.TPdDeviceinfo;

/**
 * TPdDevassetsinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdDevassetsinfo implements java.io.Serializable {

	// Fields

	private String FDevassetsid;
	private TPdDevlocationinfo TPdDevlocationinfo;
	private TPdDeviceinfo TPdDeviceinfo;
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
	private Set TPdDevstateresults = new HashSet(0);
	private Set TEvEventinfos = new HashSet(0);
	private Set TPdCompuseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdDevassetsinfo() {
	}

	/** full constructor */
	public TPdDevassetsinfo(TPdDevlocationinfo TPdDevlocationinfo,
			TPdDeviceinfo TPdDeviceinfo, Timestamp FBuydate,
			Timestamp FUsedate, Timestamp FInstalltime,
			String FInstalloperator, String FServicelife, String FDeprelife,
			Timestamp FRemovetime, String FRemoveoperator,
			Timestamp FCreatedate, String FCreateuser, Set TPdDevstateresults,
			Set TEvEventinfos, Set TPdCompuseinfos) {
		this.TPdDevlocationinfo = TPdDevlocationinfo;
		this.TPdDeviceinfo = TPdDeviceinfo;
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
		this.TPdDevstateresults = TPdDevstateresults;
		this.TEvEventinfos = TEvEventinfos;
		this.TPdCompuseinfos = TPdCompuseinfos;
	}

	// Property accessors

	public String getFDevassetsid() {
		return this.FDevassetsid;
	}

	public void setFDevassetsid(String FDevassetsid) {
		this.FDevassetsid = FDevassetsid;
	}

	public TPdDevlocationinfo getTPdDevlocationinfo() {
		return this.TPdDevlocationinfo;
	}

	public void setTPdDevlocationinfo(TPdDevlocationinfo TPdDevlocationinfo) {
		this.TPdDevlocationinfo = TPdDevlocationinfo;
	}

	public TPdDeviceinfo getTPdDeviceinfo() {
		return this.TPdDeviceinfo;
	}

	public void setTPdDeviceinfo(TPdDeviceinfo TPdDeviceinfo) {
		this.TPdDeviceinfo = TPdDeviceinfo;
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

	public Set getTPdDevstateresults() {
		return this.TPdDevstateresults;
	}

	public void setTPdDevstateresults(Set TPdDevstateresults) {
		this.TPdDevstateresults = TPdDevstateresults;
	}

	public Set getTEvEventinfos() {
		return this.TEvEventinfos;
	}

	public void setTEvEventinfos(Set TEvEventinfos) {
		this.TEvEventinfos = TEvEventinfos;
	}

	public Set getTPdCompuseinfos() {
		return this.TPdCompuseinfos;
	}

	public void setTPdCompuseinfos(Set TPdCompuseinfos) {
		this.TPdCompuseinfos = TPdCompuseinfos;
	}

}