package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoMonitorabaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoMonitorabaseinfo implements java.io.Serializable {

	// Fields

	private String FMonitoraid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private String FMonitoraname;
	private String FMonitoralevel;
	private String FParentmonitoraid;
	private String FMonitorafunc;
	private Double FMonitoraarea;
	private Double FHeatarea;
	private Double FColdarea;
	private BigDecimal FMapeoplenum;
	private BigDecimal FMaeffectnum;
	private String FMonitoracontact;
	private String FMonitoratel;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Set TMoMonitoraprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoMonitorabaseinfo() {
	}

	/** minimal constructor */
	public TMoMonitorabaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			String FMonitoraname) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FMonitoraname = FMonitoraname;
	}

	/** full constructor */
	public TMoMonitorabaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			String FMonitoraname, String FMonitoralevel,
			String FParentmonitoraid, String FMonitorafunc,
			Double FMonitoraarea, Double FHeatarea, Double FColdarea,
			BigDecimal FMapeoplenum, BigDecimal FMaeffectnum,
			String FMonitoracontact, String FMonitoratel,
			Timestamp FCreatetime, String FCreateuser, Set TMoMonitoraprelainfos) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FMonitoraname = FMonitoraname;
		this.FMonitoralevel = FMonitoralevel;
		this.FParentmonitoraid = FParentmonitoraid;
		this.FMonitorafunc = FMonitorafunc;
		this.FMonitoraarea = FMonitoraarea;
		this.FHeatarea = FHeatarea;
		this.FColdarea = FColdarea;
		this.FMapeoplenum = FMapeoplenum;
		this.FMaeffectnum = FMaeffectnum;
		this.FMonitoracontact = FMonitoracontact;
		this.FMonitoratel = FMonitoratel;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
	}

	// Property accessors

	public String getFMonitoraid() {
		return this.FMonitoraid;
	}

	public void setFMonitoraid(String FMonitoraid) {
		this.FMonitoraid = FMonitoraid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public String getFMonitoraname() {
		return this.FMonitoraname;
	}

	public void setFMonitoraname(String FMonitoraname) {
		this.FMonitoraname = FMonitoraname;
	}

	public String getFMonitoralevel() {
		return this.FMonitoralevel;
	}

	public void setFMonitoralevel(String FMonitoralevel) {
		this.FMonitoralevel = FMonitoralevel;
	}

	public String getFParentmonitoraid() {
		return this.FParentmonitoraid;
	}

	public void setFParentmonitoraid(String FParentmonitoraid) {
		this.FParentmonitoraid = FParentmonitoraid;
	}

	public String getFMonitorafunc() {
		return this.FMonitorafunc;
	}

	public void setFMonitorafunc(String FMonitorafunc) {
		this.FMonitorafunc = FMonitorafunc;
	}

	public Double getFMonitoraarea() {
		return this.FMonitoraarea;
	}

	public void setFMonitoraarea(Double FMonitoraarea) {
		this.FMonitoraarea = FMonitoraarea;
	}

	public Double getFHeatarea() {
		return this.FHeatarea;
	}

	public void setFHeatarea(Double FHeatarea) {
		this.FHeatarea = FHeatarea;
	}

	public Double getFColdarea() {
		return this.FColdarea;
	}

	public void setFColdarea(Double FColdarea) {
		this.FColdarea = FColdarea;
	}

	public BigDecimal getFMapeoplenum() {
		return this.FMapeoplenum;
	}

	public void setFMapeoplenum(BigDecimal FMapeoplenum) {
		this.FMapeoplenum = FMapeoplenum;
	}

	public BigDecimal getFMaeffectnum() {
		return this.FMaeffectnum;
	}

	public void setFMaeffectnum(BigDecimal FMaeffectnum) {
		this.FMaeffectnum = FMaeffectnum;
	}

	public String getFMonitoracontact() {
		return this.FMonitoracontact;
	}

	public void setFMonitoracontact(String FMonitoracontact) {
		this.FMonitoracontact = FMonitoracontact;
	}

	public String getFMonitoratel() {
		return this.FMonitoratel;
	}

	public void setFMonitoratel(String FMonitoratel) {
		this.FMonitoratel = FMonitoratel;
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

	public Set getTMoMonitoraprelainfos() {
		return this.TMoMonitoraprelainfos;
	}

	public void setTMoMonitoraprelainfos(Set TMoMonitoraprelainfos) {
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
	}

}