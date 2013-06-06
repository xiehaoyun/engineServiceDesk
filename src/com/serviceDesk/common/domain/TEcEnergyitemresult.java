package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TEcEnergyitemresult entity. @author MyEclipse Persistence Tools
 */

public class TEcEnergyitemresult implements java.io.Serializable {

	// Fields

	private BigDecimal FEnergyresultid;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TDtEnergyitemdict TDtEnergyitemdict;
	private String FEnergyresultlevel;
	private Timestamp FStarttime;
	private Timestamp FEndtime;
	private Double FEnergyvalue;
	private Double FEnergyequvalue;
	private BigDecimal FState;
	private Timestamp FEtltime;
	private Timestamp FEtltofloor;

	// Constructors

	/** default constructor */
	public TEcEnergyitemresult() {
	}

	/** minimal constructor */
	public TEcEnergyitemresult(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnergyitemdict TDtEnergyitemdict, Timestamp FStarttime,
			Timestamp FEndtime, Double FEnergyvalue) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnergyitemdict = TDtEnergyitemdict;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FEnergyvalue = FEnergyvalue;
	}

	/** full constructor */
	public TEcEnergyitemresult(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnergyitemdict TDtEnergyitemdict, String FEnergyresultlevel,
			Timestamp FStarttime, Timestamp FEndtime, Double FEnergyvalue,
			Double FEnergyequvalue, BigDecimal FState, Timestamp FEtltime,
			Timestamp FEtltofloor) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnergyitemdict = TDtEnergyitemdict;
		this.FEnergyresultlevel = FEnergyresultlevel;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FEnergyvalue = FEnergyvalue;
		this.FEnergyequvalue = FEnergyequvalue;
		this.FState = FState;
		this.FEtltime = FEtltime;
		this.FEtltofloor = FEtltofloor;
	}

	// Property accessors

	public BigDecimal getFEnergyresultid() {
		return this.FEnergyresultid;
	}

	public void setFEnergyresultid(BigDecimal FEnergyresultid) {
		this.FEnergyresultid = FEnergyresultid;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public TDtEnergyitemdict getTDtEnergyitemdict() {
		return this.TDtEnergyitemdict;
	}

	public void setTDtEnergyitemdict(TDtEnergyitemdict TDtEnergyitemdict) {
		this.TDtEnergyitemdict = TDtEnergyitemdict;
	}

	public String getFEnergyresultlevel() {
		return this.FEnergyresultlevel;
	}

	public void setFEnergyresultlevel(String FEnergyresultlevel) {
		this.FEnergyresultlevel = FEnergyresultlevel;
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

	public Double getFEnergyvalue() {
		return this.FEnergyvalue;
	}

	public void setFEnergyvalue(Double FEnergyvalue) {
		this.FEnergyvalue = FEnergyvalue;
	}

	public Double getFEnergyequvalue() {
		return this.FEnergyequvalue;
	}

	public void setFEnergyequvalue(Double FEnergyequvalue) {
		this.FEnergyequvalue = FEnergyequvalue;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Timestamp getFEtltime() {
		return this.FEtltime;
	}

	public void setFEtltime(Timestamp FEtltime) {
		this.FEtltime = FEtltime;
	}

	public Timestamp getFEtltofloor() {
		return this.FEtltofloor;
	}

	public void setFEtltofloor(Timestamp FEtltofloor) {
		this.FEtltofloor = FEtltofloor;
	}

}