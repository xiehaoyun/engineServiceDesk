package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TAlAlertinfo entity. @author MyEclipse Persistence Tools
 */

public class TAlAlertinfo implements java.io.Serializable {

	// Fields

	private BigDecimal FAlertid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private TAlAlerttype TAlAlerttype;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private Timestamp FAlerttime;
	private Double FAlertvalue;
	private BigDecimal FState;
	private Set TAlAlerthandles = new HashSet(0);

	// Constructors

	/** default constructor */
	public TAlAlertinfo() {
	}

	/** full constructor */
	public TAlAlertinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			TAlAlerttype TAlAlerttype, TMoMonitorpinfo TMoMonitorpinfo,
			Timestamp FAlerttime, Double FAlertvalue, BigDecimal FState,
			Set TAlAlerthandles) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.TAlAlerttype = TAlAlerttype;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.FAlerttime = FAlerttime;
		this.FAlertvalue = FAlertvalue;
		this.FState = FState;
		this.TAlAlerthandles = TAlAlerthandles;
	}

	// Property accessors

	public BigDecimal getFAlertid() {
		return this.FAlertid;
	}

	public void setFAlertid(BigDecimal FAlertid) {
		this.FAlertid = FAlertid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public TAlAlerttype getTAlAlerttype() {
		return this.TAlAlerttype;
	}

	public void setTAlAlerttype(TAlAlerttype TAlAlerttype) {
		this.TAlAlerttype = TAlAlerttype;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public Timestamp getFAlerttime() {
		return this.FAlerttime;
	}

	public void setFAlerttime(Timestamp FAlerttime) {
		this.FAlerttime = FAlerttime;
	}

	public Double getFAlertvalue() {
		return this.FAlertvalue;
	}

	public void setFAlertvalue(Double FAlertvalue) {
		this.FAlertvalue = FAlertvalue;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Set getTAlAlerthandles() {
		return this.TAlAlerthandles;
	}

	public void setTAlAlerthandles(Set TAlAlerthandles) {
		this.TAlAlerthandles = TAlAlerthandles;
	}

}