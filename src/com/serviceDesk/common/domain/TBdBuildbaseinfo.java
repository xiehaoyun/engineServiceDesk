package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TBdBuildbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildbaseinfo implements java.io.Serializable {

	// Fields

	private String FBuildid;
	private TMoDistrictbaseinfo TMoDistrictbaseinfo;
	private TDcDatacenterbaseinfo TDcDatacenterbaseinfo;
	private String FBuildname;
	private String FAliasname;
	private String FBuildowner;
	private BigDecimal FState;
	private String FBuildaddr;
	private Double FBuildlong;
	private Double FBuildlat;
	private Integer FBuildyear;
	private BigDecimal FUpfloor;
	private BigDecimal FDownfloor;
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
	private BigDecimal FIsstandard;
	private String FDesigndept;
	private String FWorkdept;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Timestamp FMonitordate;
	private Timestamp FAcceptdate;
	private Set TBdBuildexinfos = new HashSet(0);
	private Set TBdBuildaddfiles = new HashSet(0);
	private Set TPdPowergridinfos = new HashSet(0);
	private Set TBdBuildengyconsrenoinfos = new HashSet(0);
	private Set TMoMonitorabaseinfos = new HashSet(0);
	private Set TBdOrgbuildrelainfos = new HashSet(0);
	private Set TAlAlertinfos = new HashSet(0);
	private Set TBdBuildgrouprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TBdBuildbaseinfo() {
	}

	/** minimal constructor */
	public TBdBuildbaseinfo(String FBuildname, String FAliasname,
			String FBuildowner, BigDecimal FState, String FBuildaddr,
			Integer FBuildyear, BigDecimal FUpfloor, String FBuildfunc,
			Double FTotalarea, Double FAirarea, Double FHeatarea,
			String FAirtype, String FHeattype, String FStrutype,
			String FWallmattype, String FWallwarmtype, String FWallwintype,
			String FGlasstype, String FWinframetype, BigDecimal FIsstandard,
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

	/** full constructor */
	public TBdBuildbaseinfo(TMoDistrictbaseinfo TMoDistrictbaseinfo,
			TDcDatacenterbaseinfo TDcDatacenterbaseinfo, String FBuildname,
			String FAliasname, String FBuildowner, BigDecimal FState,
			String FBuildaddr, Double FBuildlong, Double FBuildlat,
			Integer FBuildyear, BigDecimal FUpfloor, BigDecimal FDownfloor,
			String FBuildfunc, Double FTotalarea, Double FAirarea,
			Double FHeatarea, String FAirtype, String FHeattype,
			Double FBodycoef, String FStrutype, String FWallmattype,
			String FWallwarmtype, String FWallwintype, String FGlasstype,
			String FWinframetype, BigDecimal FIsstandard, String FDesigndept,
			String FWorkdept, Timestamp FCreatetime, String FCreateuser,
			Timestamp FMonitordate, Timestamp FAcceptdate, Set TBdBuildexinfos,
			Set TBdBuildaddfiles, Set TPdPowergridinfos,
			Set TBdBuildengyconsrenoinfos, Set TMoMonitorabaseinfos,
			Set TBdOrgbuildrelainfos, Set TAlAlertinfos,
			Set TBdBuildgrouprelainfos) {
		this.TMoDistrictbaseinfo = TMoDistrictbaseinfo;
		this.TDcDatacenterbaseinfo = TDcDatacenterbaseinfo;
		this.FBuildname = FBuildname;
		this.FAliasname = FAliasname;
		this.FBuildowner = FBuildowner;
		this.FState = FState;
		this.FBuildaddr = FBuildaddr;
		this.FBuildlong = FBuildlong;
		this.FBuildlat = FBuildlat;
		this.FBuildyear = FBuildyear;
		this.FUpfloor = FUpfloor;
		this.FDownfloor = FDownfloor;
		this.FBuildfunc = FBuildfunc;
		this.FTotalarea = FTotalarea;
		this.FAirarea = FAirarea;
		this.FHeatarea = FHeatarea;
		this.FAirtype = FAirtype;
		this.FHeattype = FHeattype;
		this.FBodycoef = FBodycoef;
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
		this.FCreateuser = FCreateuser;
		this.FMonitordate = FMonitordate;
		this.FAcceptdate = FAcceptdate;
		this.TBdBuildexinfos = TBdBuildexinfos;
		this.TBdBuildaddfiles = TBdBuildaddfiles;
		this.TPdPowergridinfos = TPdPowergridinfos;
		this.TBdBuildengyconsrenoinfos = TBdBuildengyconsrenoinfos;
		this.TMoMonitorabaseinfos = TMoMonitorabaseinfos;
		this.TBdOrgbuildrelainfos = TBdOrgbuildrelainfos;
		this.TAlAlertinfos = TAlAlertinfos;
		this.TBdBuildgrouprelainfos = TBdBuildgrouprelainfos;
	}

	// Property accessors

	public String getFBuildid() {
		return this.FBuildid;
	}

	public void setFBuildid(String FBuildid) {
		this.FBuildid = FBuildid;
	}

	public TMoDistrictbaseinfo getTMoDistrictbaseinfo() {
		return this.TMoDistrictbaseinfo;
	}

	public void setTMoDistrictbaseinfo(TMoDistrictbaseinfo TMoDistrictbaseinfo) {
		this.TMoDistrictbaseinfo = TMoDistrictbaseinfo;
	}

	public TDcDatacenterbaseinfo getTDcDatacenterbaseinfo() {
		return this.TDcDatacenterbaseinfo;
	}

	public void setTDcDatacenterbaseinfo(
			TDcDatacenterbaseinfo TDcDatacenterbaseinfo) {
		this.TDcDatacenterbaseinfo = TDcDatacenterbaseinfo;
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

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
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

	public BigDecimal getFUpfloor() {
		return this.FUpfloor;
	}

	public void setFUpfloor(BigDecimal FUpfloor) {
		this.FUpfloor = FUpfloor;
	}

	public BigDecimal getFDownfloor() {
		return this.FDownfloor;
	}

	public void setFDownfloor(BigDecimal FDownfloor) {
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

	public BigDecimal getFIsstandard() {
		return this.FIsstandard;
	}

	public void setFIsstandard(BigDecimal FIsstandard) {
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

	public Set getTBdBuildexinfos() {
		return this.TBdBuildexinfos;
	}

	public void setTBdBuildexinfos(Set TBdBuildexinfos) {
		this.TBdBuildexinfos = TBdBuildexinfos;
	}

	public Set getTBdBuildaddfiles() {
		return this.TBdBuildaddfiles;
	}

	public void setTBdBuildaddfiles(Set TBdBuildaddfiles) {
		this.TBdBuildaddfiles = TBdBuildaddfiles;
	}

	public Set getTPdPowergridinfos() {
		return this.TPdPowergridinfos;
	}

	public void setTPdPowergridinfos(Set TPdPowergridinfos) {
		this.TPdPowergridinfos = TPdPowergridinfos;
	}

	public Set getTBdBuildengyconsrenoinfos() {
		return this.TBdBuildengyconsrenoinfos;
	}

	public void setTBdBuildengyconsrenoinfos(Set TBdBuildengyconsrenoinfos) {
		this.TBdBuildengyconsrenoinfos = TBdBuildengyconsrenoinfos;
	}

	public Set getTMoMonitorabaseinfos() {
		return this.TMoMonitorabaseinfos;
	}

	public void setTMoMonitorabaseinfos(Set TMoMonitorabaseinfos) {
		this.TMoMonitorabaseinfos = TMoMonitorabaseinfos;
	}

	public Set getTBdOrgbuildrelainfos() {
		return this.TBdOrgbuildrelainfos;
	}

	public void setTBdOrgbuildrelainfos(Set TBdOrgbuildrelainfos) {
		this.TBdOrgbuildrelainfos = TBdOrgbuildrelainfos;
	}

	public Set getTAlAlertinfos() {
		return this.TAlAlertinfos;
	}

	public void setTAlAlertinfos(Set TAlAlertinfos) {
		this.TAlAlertinfos = TAlAlertinfos;
	}

	public Set getTBdBuildgrouprelainfos() {
		return this.TBdBuildgrouprelainfos;
	}

	public void setTBdBuildgrouprelainfos(Set TBdBuildgrouprelainfos) {
		this.TBdBuildgrouprelainfos = TBdBuildgrouprelainfos;
	}

}