package com.serviceDesk.common.form;


/**
 * TPdMaintareainfo entity. @author MyEclipse Persistence Tools
 */

public class TPdMaintareainfoForm implements java.io.Serializable {

	// Fields

	private String FMaintareaid;
	private String FMaintareaname;
	private Integer FFloornum;
	private String FBuildid;

	// Constructors

	/** default constructor */
	public TPdMaintareainfoForm() {
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
}