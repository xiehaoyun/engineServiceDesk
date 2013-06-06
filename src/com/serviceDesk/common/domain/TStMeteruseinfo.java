package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TStMeteruseinfo entity. @author MyEclipse Persistence Tools
 */

public class TStMeteruseinfo implements java.io.Serializable {

	// Fields

	private String FMeterid;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TStMeterprodinfo TStMeterprodinfo;
	private String FMetername;
	private String FMeteraddr1;
	private String FMeteraddr2;
	private String FMeteraddr3;
	private String FMeterboxid;
	private Double FRate;
	private BigDecimal FState;
	private Set TEcMeterecitemrelainfos = new HashSet(0);
	private Set TOvMeterorigvalues = new HashSet(0);
	private Set meterorivalues = new HashSet(0);

	// Constructors

	/** default constructor */
	public TStMeteruseinfo() {
	}

	/** minimal constructor */
	public TStMeteruseinfo(TMoMonitorpinfo TMoMonitorpinfo,
			TStMeterprodinfo TStMeterprodinfo, String FMetername, Double FRate,
			BigDecimal FState) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeterprodinfo = TStMeterprodinfo;
		this.FMetername = FMetername;
		this.FRate = FRate;
		this.FState = FState;
	}

	/** full constructor */
	public TStMeteruseinfo(TMoMonitorpinfo TMoMonitorpinfo,
			TStMeterprodinfo TStMeterprodinfo, String FMetername,
			String FMeteraddr1, String FMeteraddr2, String FMeteraddr3,
			String FMeterboxid, Double FRate, BigDecimal FState,
			Set TEcMeterecitemrelainfos, Set TOvMeterorigvalues,
			Set meterorivalues) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeterprodinfo = TStMeterprodinfo;
		this.FMetername = FMetername;
		this.FMeteraddr1 = FMeteraddr1;
		this.FMeteraddr2 = FMeteraddr2;
		this.FMeteraddr3 = FMeteraddr3;
		this.FMeterboxid = FMeterboxid;
		this.FRate = FRate;
		this.FState = FState;
		this.TEcMeterecitemrelainfos = TEcMeterecitemrelainfos;
		this.TOvMeterorigvalues = TOvMeterorigvalues;
		this.meterorivalues = meterorivalues;
	}

	// Property accessors

	public String getFMeterid() {
		return this.FMeterid;
	}

	public void setFMeterid(String FMeterid) {
		this.FMeterid = FMeterid;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public TStMeterprodinfo getTStMeterprodinfo() {
		return this.TStMeterprodinfo;
	}

	public void setTStMeterprodinfo(TStMeterprodinfo TStMeterprodinfo) {
		this.TStMeterprodinfo = TStMeterprodinfo;
	}

	public String getFMetername() {
		return this.FMetername;
	}

	public void setFMetername(String FMetername) {
		this.FMetername = FMetername;
	}

	public String getFMeteraddr1() {
		return this.FMeteraddr1;
	}

	public void setFMeteraddr1(String FMeteraddr1) {
		this.FMeteraddr1 = FMeteraddr1;
	}

	public String getFMeteraddr2() {
		return this.FMeteraddr2;
	}

	public void setFMeteraddr2(String FMeteraddr2) {
		this.FMeteraddr2 = FMeteraddr2;
	}

	public String getFMeteraddr3() {
		return this.FMeteraddr3;
	}

	public void setFMeteraddr3(String FMeteraddr3) {
		this.FMeteraddr3 = FMeteraddr3;
	}

	public String getFMeterboxid() {
		return this.FMeterboxid;
	}

	public void setFMeterboxid(String FMeterboxid) {
		this.FMeterboxid = FMeterboxid;
	}

	public Double getFRate() {
		return this.FRate;
	}

	public void setFRate(Double FRate) {
		this.FRate = FRate;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Set getTEcMeterecitemrelainfos() {
		return this.TEcMeterecitemrelainfos;
	}

	public void setTEcMeterecitemrelainfos(Set TEcMeterecitemrelainfos) {
		this.TEcMeterecitemrelainfos = TEcMeterecitemrelainfos;
	}

	public Set getTOvMeterorigvalues() {
		return this.TOvMeterorigvalues;
	}

	public void setTOvMeterorigvalues(Set TOvMeterorigvalues) {
		this.TOvMeterorigvalues = TOvMeterorigvalues;
	}

	public Set getMeterorivalues() {
		return this.meterorivalues;
	}

	public void setMeterorivalues(Set meterorivalues) {
		this.meterorivalues = meterorivalues;
	}

}