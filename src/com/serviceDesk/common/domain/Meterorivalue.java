package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Meterorivalue entity. @author MyEclipse Persistence Tools
 */

public class Meterorivalue implements java.io.Serializable {

	// Fields

	private BigDecimal FOrigvalueid;
	private TStMeterparaminfo TStMeterparaminfo;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TStMeteruseinfo TStMeteruseinfo;
	private Timestamp FCollectdate;
	private String FOrigvalue;
	private Timestamp FCaltime;
	private Double FLastvalue;

	// Constructors

	/** default constructor */
	public Meterorivalue() {
	}

	/** minimal constructor */
	public Meterorivalue(TStMeterparaminfo TStMeterparaminfo,
			TMoMonitorpinfo TMoMonitorpinfo, TStMeteruseinfo TStMeteruseinfo,
			Timestamp FCollectdate, String FOrigvalue) {
		this.TStMeterparaminfo = TStMeterparaminfo;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeteruseinfo = TStMeteruseinfo;
		this.FCollectdate = FCollectdate;
		this.FOrigvalue = FOrigvalue;
	}

	/** full constructor */
	public Meterorivalue(TStMeterparaminfo TStMeterparaminfo,
			TMoMonitorpinfo TMoMonitorpinfo, TStMeteruseinfo TStMeteruseinfo,
			Timestamp FCollectdate, String FOrigvalue, Timestamp FCaltime,
			Double FLastvalue) {
		this.TStMeterparaminfo = TStMeterparaminfo;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TStMeteruseinfo = TStMeteruseinfo;
		this.FCollectdate = FCollectdate;
		this.FOrigvalue = FOrigvalue;
		this.FCaltime = FCaltime;
		this.FLastvalue = FLastvalue;
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

	public Timestamp getFCollectdate() {
		return this.FCollectdate;
	}

	public void setFCollectdate(Timestamp FCollectdate) {
		this.FCollectdate = FCollectdate;
	}

	public String getFOrigvalue() {
		return this.FOrigvalue;
	}

	public void setFOrigvalue(String FOrigvalue) {
		this.FOrigvalue = FOrigvalue;
	}

	public Timestamp getFCaltime() {
		return this.FCaltime;
	}

	public void setFCaltime(Timestamp FCaltime) {
		this.FCaltime = FCaltime;
	}

	public Double getFLastvalue() {
		return this.FLastvalue;
	}

	public void setFLastvalue(Double FLastvalue) {
		this.FLastvalue = FLastvalue;
	}

}