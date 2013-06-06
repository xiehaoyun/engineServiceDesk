package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TOvMeterorigvalue entity. @author MyEclipse Persistence Tools
 */

public class TOvMeterorigvalue implements java.io.Serializable {

	// Fields

	private BigDecimal FOrigvalueid;
	private TStMeterparaminfo TStMeterparaminfo;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TStMeteruseinfo TStMeteruseinfo;
	private String FOrigvalue;
	private Timestamp FCollecttime;
	private Timestamp FReceivetime;
	private Timestamp FCalctime;
	private BigDecimal FState;

	// Constructors

	/** default constructor */
	public TOvMeterorigvalue() {
	}

	/** minimal constructor */
	public TOvMeterorigvalue(TStMeterparaminfo TStMeterparaminfo,
			TMoMonitorpinfo TMoMonitorpinfo, TStMeteruseinfo TStMeteruseinfo,
			String FOrigvalue, Timestamp FCollecttime, Timestamp FReceivetime,
			BigDecimal FState) {
		this.TStMeterparaminfo = TStMeterparaminfo;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeteruseinfo = TStMeteruseinfo;
		this.FOrigvalue = FOrigvalue;
		this.FCollecttime = FCollecttime;
		this.FReceivetime = FReceivetime;
		this.FState = FState;
	}

	/** full constructor */
	public TOvMeterorigvalue(TStMeterparaminfo TStMeterparaminfo,
			TMoMonitorpinfo TMoMonitorpinfo, TStMeteruseinfo TStMeteruseinfo,
			String FOrigvalue, Timestamp FCollecttime, Timestamp FReceivetime,
			Timestamp FCalctime, BigDecimal FState) {
		this.TStMeterparaminfo = TStMeterparaminfo;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeteruseinfo = TStMeteruseinfo;
		this.FOrigvalue = FOrigvalue;
		this.FCollecttime = FCollecttime;
		this.FReceivetime = FReceivetime;
		this.FCalctime = FCalctime;
		this.FState = FState;
	}

	// Property accessors

	public BigDecimal getFOrigvalueid() {
		return this.FOrigvalueid;
	}

	public void setFOrigvalueid(BigDecimal FOrigvalueid) {
		this.FOrigvalueid = FOrigvalueid;
	}

	public TStMeterparaminfo getTStMeterparaminfo() {
		return this.TStMeterparaminfo;
	}

	public void setTStMeterparaminfo(TStMeterparaminfo TStMeterparaminfo) {
		this.TStMeterparaminfo = TStMeterparaminfo;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public TStMeteruseinfo getTStMeteruseinfo() {
		return this.TStMeteruseinfo;
	}

	public void setTStMeteruseinfo(TStMeteruseinfo TStMeteruseinfo) {
		this.TStMeteruseinfo = TStMeteruseinfo;
	}

	public String getFOrigvalue() {
		return this.FOrigvalue;
	}

	public void setFOrigvalue(String FOrigvalue) {
		this.FOrigvalue = FOrigvalue;
	}

	public Timestamp getFCollecttime() {
		return this.FCollecttime;
	}

	public void setFCollecttime(Timestamp FCollecttime) {
		this.FCollecttime = FCollecttime;
	}

	public Timestamp getFReceivetime() {
		return this.FReceivetime;
	}

	public void setFReceivetime(Timestamp FReceivetime) {
		this.FReceivetime = FReceivetime;
	}

	public Timestamp getFCalctime() {
		return this.FCalctime;
	}

	public void setFCalctime(Timestamp FCalctime) {
		this.FCalctime = FCalctime;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

}