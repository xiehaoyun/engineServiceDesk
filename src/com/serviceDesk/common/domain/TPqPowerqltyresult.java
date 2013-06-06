package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TPqPowerqltyresult entity. @author MyEclipse Persistence Tools
 */

public class TPqPowerqltyresult implements java.io.Serializable {

	// Fields

	private String FPowerqltyresultid;
	private TDtPowerqltyitemdict TDtPowerqltyitemdict;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private Timestamp FStarttime;
	private Timestamp FEndtime;
	private String FPowerqltyvalue;
	private BigDecimal FState;

	// Constructors

	/** default constructor */
	public TPqPowerqltyresult() {
	}

	/** minimal constructor */
	public TPqPowerqltyresult(TDtPowerqltyitemdict TDtPowerqltyitemdict,
			TMoMonitorpinfo TMoMonitorpinfo, Timestamp FStarttime,
			Timestamp FEndtime, String FPowerqltyvalue) {
		this.TDtPowerqltyitemdict = TDtPowerqltyitemdict;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FPowerqltyvalue = FPowerqltyvalue;
	}

	/** full constructor */
	public TPqPowerqltyresult(TDtPowerqltyitemdict TDtPowerqltyitemdict,
			TMoMonitorpinfo TMoMonitorpinfo, Timestamp FStarttime,
			Timestamp FEndtime, String FPowerqltyvalue, BigDecimal FState) {
		this.TDtPowerqltyitemdict = TDtPowerqltyitemdict;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FPowerqltyvalue = FPowerqltyvalue;
		this.FState = FState;
	}

	// Property accessors

	public String getFPowerqltyresultid() {
		return this.FPowerqltyresultid;
	}

	public void setFPowerqltyresultid(String FPowerqltyresultid) {
		this.FPowerqltyresultid = FPowerqltyresultid;
	}

	public TDtPowerqltyitemdict getTDtPowerqltyitemdict() {
		return this.TDtPowerqltyitemdict;
	}

	public void setTDtPowerqltyitemdict(
			TDtPowerqltyitemdict TDtPowerqltyitemdict) {
		this.TDtPowerqltyitemdict = TDtPowerqltyitemdict;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public Timestamp getFStarttime() {
		return this.FStarttime;
	}

	public void setFStarttime(Timestamp FStarttime) {
		this.FStarttime = FStarttime;
	}

	public Timestamp getFEndtime() {
		return this.FEndtime;
	}

	public void setFEndtime(Timestamp FEndtime) {
		this.FEndtime = FEndtime;
	}

	public String getFPowerqltyvalue() {
		return this.FPowerqltyvalue;
	}

	public void setFPowerqltyvalue(String FPowerqltyvalue) {
		this.FPowerqltyvalue = FPowerqltyvalue;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

}