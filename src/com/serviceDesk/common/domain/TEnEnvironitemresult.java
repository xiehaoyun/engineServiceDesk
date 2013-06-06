package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TEnEnvironitemresult entity. @author MyEclipse Persistence Tools
 */

public class TEnEnvironitemresult implements java.io.Serializable {

	// Fields

	private String FEnvironresultid;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TDtEnvironitemdict TDtEnvironitemdict;
	private Timestamp FStarttime;
	private Timestamp FEndtime;
	private String FEnvironvalue;
	private BigDecimal FState;

	// Constructors

	/** default constructor */
	public TEnEnvironitemresult() {
	}

	/** minimal constructor */
	public TEnEnvironitemresult(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnvironitemdict TDtEnvironitemdict, Timestamp FStarttime,
			Timestamp FEndtime, String FEnvironvalue) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnvironitemdict = TDtEnvironitemdict;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FEnvironvalue = FEnvironvalue;
	}

	/** full constructor */
	public TEnEnvironitemresult(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnvironitemdict TDtEnvironitemdict, Timestamp FStarttime,
			Timestamp FEndtime, String FEnvironvalue, BigDecimal FState) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnvironitemdict = TDtEnvironitemdict;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FEnvironvalue = FEnvironvalue;
		this.FState = FState;
	}

	// Property accessors

	public String getFEnvironresultid() {
		return this.FEnvironresultid;
	}

	public void setFEnvironresultid(String FEnvironresultid) {
		this.FEnvironresultid = FEnvironresultid;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public TDtEnvironitemdict getTDtEnvironitemdict() {
		return this.TDtEnvironitemdict;
	}

	public void setTDtEnvironitemdict(TDtEnvironitemdict TDtEnvironitemdict) {
		this.TDtEnvironitemdict = TDtEnvironitemdict;
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

	public String getFEnvironvalue() {
		return this.FEnvironvalue;
	}

	public void setFEnvironvalue(String FEnvironvalue) {
		this.FEnvironvalue = FEnvironvalue;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

}