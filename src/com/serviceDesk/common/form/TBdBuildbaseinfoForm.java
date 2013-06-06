package com.serviceDesk.common.form;

import java.sql.Timestamp;

/**
 * TBdBuildbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildbaseinfoForm implements java.io.Serializable {

	// Fields

	private String FBuildid;
	private String FBuildname;
	private String FAliasname;
	private String FBuildowner;
	private Integer FState;
	private String FBuildaddr;
	private Double FBuildlong;
	private Double FBuildlat;
	private Integer FBuildyear;
	private Integer FUpfloor;
	private Integer FDownfloor;
	private String FBuildfunc;
	private Double FTotalarea;
	private Double FAirarea;
	private Double FHeatarea;
	private String FAirtype;
	private String FHeattype;
	private Double FBodycoef;
	private String FStrutype;
	private String FWallmattype;
	private String FWallwarmtype;
	private String FWallwintype;
	private String FGlasstype;
	private String FWinframetype;
	private Integer FIsstandard;
	private String FDesigndept;
	private String FWorkdept;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Timestamp FMonitordate;
	private Timestamp FAcceptdate;

	// Constructors

	/** default constructor */
	public TBdBuildbaseinfoForm() {
	}

	/** minimal constructor */
	public TBdBuildbaseinfoForm(String FBuildname, String FAliasname,
			String FBuildowner, Integer FState, String FBuildaddr,
			Integer FBuildyear, Integer FUpfloor, String FBuildfunc,
			Double FTotalarea, Double FAirarea, Double FHeatarea,
			String FAirtype, String FHeattype, String FStrutype,
			String FWallmattype, String FWallwarmtype, String FWallwintype,
			String FGlasstype, String FWinframetype, Integer FIsstandard,
			String FDesigndept, String FWorkdept, Timestamp FCreatetime) {
		this.FBuildname = FBuildname;
		this.FAliasname = FAliasname;
		this.FBuildowner = FBuildowner;
		this.FState = FState;
		this.FBuildaddr = FBuildaddr;
		this.FBuildyear = FBuildyear;
		this.FUpfloor = FUpfloor;
		this.FBuildfunc = FBuildfunc;
		this.FTotalarea = FTotalarea;
		this.FAirarea = FAirarea;
		this.FHeatarea = FHeatarea;
		this.FAirtype = FAirtype;
		this.FHeattype = FHeattype;
		this.FStrutype = FStrutype;
		this.FWallmattype = FWallmattype;
		this.FWallwarmtype = FWallwarmtype;
		this.FWallwintype = FWallwintype;
		this.FGlasstype = FGlasstype;
		this.FWinframetype = FWinframetype;
		this.FIsstandard = FIsstandard;
		this.FDesigndept = FDesigndept;
		this.FWorkdept = FWorkdept;
		this.FCreatetime = FCreatetime;
	}

	// Property accessors

	public String getFBuildid() {
		return this.FBuildid;
	}

	public void setFBuildid(String FBuildid) {
		this.FBuildid = FBuildid;
	}

	public String getFBuildname() {
		return this.FBuildname;
	}

	public void setFBuildname(String FBuildname) {
		this.FBuildname = FBuildname;
	}

	public String getFAliasname() {
		return this.FAliasname;
	}

	public void setFAliasname(String FAliasname) {
		this.FAliasname = FAliasname;
	}

	public String getFBuildowner() {
		return this.FBuildowner;
	}

	public void setFBuildowner(String FBuildowner) {
		this.FBuildowner = FBuildowner;
	}

	public Integer getFState() {
		return this.FState;
	}

	public void setFState(Integer FState) {
		this.FState = FState;
	}

	public String getFBuildaddr() {
		return this.FBuildaddr;
	}

	public void setFBuildaddr(String FBuildaddr) {
		this.FBuildaddr = FBuildaddr;
	}

	public Double getFBuildlong() {
		return this.FBuildlong;
	}

	public void setFBuildlong(Double FBuildlong) {
		this.FBuildlong = FBuildlong;
	}

	public Double getFBuildlat() {
		return this.FBuildlat;
	}

	public void setFBuildlat(Double FBuildlat) {
		this.FBuildlat = FBuildlat;
	}

	public Integer getFBuildyear() {
		return this.FBuildyear;
	}

	public void setFBuildyear(Integer FBuildyear) {
		this.FBuildyear = FBuildyear;
	}

	public Integer getFUpfloor() {
		return this.FUpfloor;
	}

	public void setFUpfloor(Integer FUpfloor) {
		this.FUpfloor = FUpfloor;
	}

	public Integer getFDownfloor() {
		return this.FDownfloor;
	}

	public void setFDownfloor(Integer FDownfloor) {
		this.FDownfloor = FDownfloor;
	}

	public String getFBuildfunc() {
		return this.FBuildfunc;
	}

	public void setFBuildfunc(String FBuildfunc) {
		this.FBuildfunc = FBuildfunc;
	}

	public Double getFTotalarea() {
		return this.FTotalarea;
	}

	public void setFTotalarea(Double FTotalarea) {
		this.FTotalarea = FTotalarea;
	}

	public Double getFAirarea() {
		return this.FAirarea;
	}

	public void setFAirarea(Double FAirarea) {
		this.FAirarea = FAirarea;
	}

	public Double getFHeatarea() {
		return this.FHeatarea;
	}

	public void setFHeatarea(Double FHeatarea) {
		this.FHeatarea = FHeatarea;
	}

	public String getFAirtype() {
		return this.FAirtype;
	}

	public void setFAirtype(String FAirtype) {
		this.FAirtype = FAirtype;
	}

	public String getFHeattype() {
		return this.FHeattype;
	}

	public void setFHeattype(String FHeattype) {
		this.FHeattype = FHeattype;
	}

	public Double getFBodycoef() {
		return this.FBodycoef;
	}

	public void setFBodycoef(Double FBodycoef) {
		this.FBodycoef = FBodycoef;
	}

	public String getFStrutype() {
		return this.FStrutype;
	}

	public void setFStrutype(String FStrutype) {
		this.FStrutype = FStrutype;
	}

	public String getFWallmattype() {
		return this.FWallmattype;
	}

	public void setFWallmattype(String FWallmattype) {
		this.FWallmattype = FWallmattype;
	}

	public String getFWallwarmtype() {
		return this.FWallwarmtype;
	}

	public void setFWallwarmtype(String FWallwarmtype) {
		this.FWallwarmtype = FWallwarmtype;
	}

	public String getFWallwintype() {
		return this.FWallwintype;
	}

	public void setFWallwintype(String FWallwintype) {
		this.FWallwintype = FWallwintype;
	}

	public String getFGlasstype() {
		return this.FGlasstype;
	}

	public void setFGlasstype(String FGlasstype) {
		this.FGlasstype = FGlasstype;
	}

	public String getFWinframetype() {
		return this.FWinframetype;
	}

	public void setFWinframetype(String FWinframetype) {
		this.FWinframetype = FWinframetype;
	}

	public Integer getFIsstandard() {
		return this.FIsstandard;
	}

	public void setFIsstandard(Integer FIsstandard) {
		this.FIsstandard = FIsstandard;
	}

	public String getFDesigndept() {
		return this.FDesigndept;
	}

	public void setFDesigndept(String FDesigndept) {
		this.FDesigndept = FDesigndept;
	}

	public String getFWorkdept() {
		return this.FWorkdept;
	}

	public void setFWorkdept(String FWorkdept) {
		this.FWorkdept = FWorkdept;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public String getFCreateuser() {
		return this.FCreateuser;
	}

	public void setFCreateuser(String FCreateuser) {
		this.FCreateuser = FCreateuser;
	}

	public Timestamp getFMonitordate() {
		return this.FMonitordate;
	}

	public void setFMonitordate(Timestamp FMonitordate) {
		this.FMonitordate = FMonitordate;
	}

	public Timestamp getFAcceptdate() {
		return this.FAcceptdate;
	}

	public void setFAcceptdate(Timestamp FAcceptdate) {
		this.FAcceptdate = FAcceptdate;
	}
}