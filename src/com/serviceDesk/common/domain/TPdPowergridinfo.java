package com.serviceDesk.common.domain;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdPowergridinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdPowergridinfo implements java.io.Serializable {

	// Fields

	private String FPowergridid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private String FGriddiagrampath;
	private Double FMaxloadpower;
	private Double FMaxloadvoltage;
	private Double FMaxloadec;
	private Timestamp FCreatedate;
	private String FCreateuser;
	private Set TPdPowergridlevelrelainfosForFFatherpowergridid = new HashSet(0);
	private Set TPdDevlocationinfos = new HashSet(0);
	private Set TPdMaintapgrelainfos = new HashSet(0);
	private Set TPdPowergridlevelrelainfosForFSonpowergridid = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdPowergridinfo() {
	}

	/** full constructor */
	public TPdPowergridinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			String FGriddiagrampath, Double FMaxloadpower,
			Double FMaxloadvoltage, Double FMaxloadec, Timestamp FCreatedate,
			String FCreateuser,
			Set TPdPowergridlevelrelainfosForFFatherpowergridid,
			Set TPdDevlocationinfos, Set TPdMaintapgrelainfos,
			Set TPdPowergridlevelrelainfosForFSonpowergridid) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FGriddiagrampath = FGriddiagrampath;
		this.FMaxloadpower = FMaxloadpower;
		this.FMaxloadvoltage = FMaxloadvoltage;
		this.FMaxloadec = FMaxloadec;
		this.FCreatedate = FCreatedate;
		this.FCreateuser = FCreateuser;
		this.TPdPowergridlevelrelainfosForFFatherpowergridid = TPdPowergridlevelrelainfosForFFatherpowergridid;
		this.TPdDevlocationinfos = TPdDevlocationinfos;
		this.TPdMaintapgrelainfos = TPdMaintapgrelainfos;
		this.TPdPowergridlevelrelainfosForFSonpowergridid = TPdPowergridlevelrelainfosForFSonpowergridid;
	}

	// Property accessors

	public String getFPowergridid() {
		return this.FPowergridid;
	}

	public void setFPowergridid(String FPowergridid) {
		this.FPowergridid = FPowergridid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public String getFGriddiagrampath() {
		return this.FGriddiagrampath;
	}

	public void setFGriddiagrampath(String FGriddiagrampath) {
		this.FGriddiagrampath = FGriddiagrampath;
	}

	public Double getFMaxloadpower() {
		return this.FMaxloadpower;
	}

	public void setFMaxloadpower(Double FMaxloadpower) {
		this.FMaxloadpower = FMaxloadpower;
	}

	public Double getFMaxloadvoltage() {
		return this.FMaxloadvoltage;
	}

	public void setFMaxloadvoltage(Double FMaxloadvoltage) {
		this.FMaxloadvoltage = FMaxloadvoltage;
	}

	public Double getFMaxloadec() {
		return this.FMaxloadec;
	}

	public void setFMaxloadec(Double FMaxloadec) {
		this.FMaxloadec = FMaxloadec;
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

	public Set getTPdPowergridlevelrelainfosForFFatherpowergridid() {
		return this.TPdPowergridlevelrelainfosForFFatherpowergridid;
	}

	public void setTPdPowergridlevelrelainfosForFFatherpowergridid(
			Set TPdPowergridlevelrelainfosForFFatherpowergridid) {
		this.TPdPowergridlevelrelainfosForFFatherpowergridid = TPdPowergridlevelrelainfosForFFatherpowergridid;
	}

	public Set getTPdDevlocationinfos() {
		return this.TPdDevlocationinfos;
	}

	public void setTPdDevlocationinfos(Set TPdDevlocationinfos) {
		this.TPdDevlocationinfos = TPdDevlocationinfos;
	}

	public Set getTPdMaintapgrelainfos() {
		return this.TPdMaintapgrelainfos;
	}

	public void setTPdMaintapgrelainfos(Set TPdMaintapgrelainfos) {
		this.TPdMaintapgrelainfos = TPdMaintapgrelainfos;
	}

	public Set getTPdPowergridlevelrelainfosForFSonpowergridid() {
		return this.TPdPowergridlevelrelainfosForFSonpowergridid;
	}

	public void setTPdPowergridlevelrelainfosForFSonpowergridid(
			Set TPdPowergridlevelrelainfosForFSonpowergridid) {
		this.TPdPowergridlevelrelainfosForFSonpowergridid = TPdPowergridlevelrelainfosForFSonpowergridid;
	}

}