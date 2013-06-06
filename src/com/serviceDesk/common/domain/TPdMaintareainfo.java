package com.serviceDesk.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TPdMaintareainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdMaintareainfo implements java.io.Serializable {

	// Fields

	private String FMaintareaid;
	private String FMaintareaname;
	private Integer FFloornum;
	private String FBuildid;
	private Set TPdMaintapgrelainfos = new HashSet(0);
	private Set TPdDepartmaintarelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdMaintareainfo() {
	}

	/** full constructor */
	public TPdMaintareainfo(String FMaintareaname, Integer FFloornum,
			Set TPdMaintapgrelainfos, Set TPdDepartmaintarelainfos) {
		this.FMaintareaname = FMaintareaname;
		this.FFloornum = FFloornum;
		this.TPdMaintapgrelainfos = TPdMaintapgrelainfos;
		this.TPdDepartmaintarelainfos = TPdDepartmaintarelainfos;
	}

	// Property accessors

	public String getFMaintareaid() {
		return this.FMaintareaid;
	}

	public void setFMaintareaid(String FMaintareaid) {
		this.FMaintareaid = FMaintareaid;
	}

	public String getFMaintareaname() {
		return this.FMaintareaname;
	}

	public void setFMaintareaname(String FMaintareaname) {
		this.FMaintareaname = FMaintareaname;
	}

	public Integer getFFloornum() {
		return this.FFloornum;
	}

	public void setFFloornum(Integer FFloornum) {
		this.FFloornum = FFloornum;
	}

	public String getFBuildid() {
		return FBuildid;
	}

	public void setFBuildid(String fBuildid) {
		FBuildid = fBuildid;
	}

	public Set getTPdMaintapgrelainfos() {
		return this.TPdMaintapgrelainfos;
	}

	public void setTPdMaintapgrelainfos(Set TPdMaintapgrelainfos) {
		this.TPdMaintapgrelainfos = TPdMaintapgrelainfos;
	}

	public Set getTPdDepartmaintarelainfos() {
		return this.TPdDepartmaintarelainfos;
	}

	public void setTPdDepartmaintarelainfos(Set TPdDepartmaintarelainfos) {
		this.TPdDepartmaintarelainfos = TPdDepartmaintarelainfos;
	}

}