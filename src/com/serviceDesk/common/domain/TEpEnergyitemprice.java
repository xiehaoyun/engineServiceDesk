package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TEpEnergyitemprice entity. @author MyEclipse Persistence Tools
 */

public class TEpEnergyitemprice implements java.io.Serializable {

	// Fields

	private String FEnergypriceid;
	private TMoMonitorpinfo TMoMonitorpinfo;
	private TDtEnergyitemdict TDtEnergyitemdict;
	private Double FPricevalue;
	private String FPricenote;
	private Timestamp FCreatetime;
	private String FCreateuser;

	// Constructors

	/** default constructor */
	public TEpEnergyitemprice() {
	}

	/** minimal constructor */
	public TEpEnergyitemprice(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnergyitemdict TDtEnergyitemdict, Double FPricevalue,
			Timestamp FCreatetime) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnergyitemdict = TDtEnergyitemdict;
		this.FPricevalue = FPricevalue;
		this.FCreatetime = FCreatetime;
	}

	/** full constructor */
	public TEpEnergyitemprice(TMoMonitorpinfo TMoMonitorpinfo,
			TDtEnergyitemdict TDtEnergyitemdict, Double FPricevalue,
			String FPricenote, Timestamp FCreatetime, String FCreateuser) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TDtEnergyitemdict = TDtEnergyitemdict;
		this.FPricevalue = FPricevalue;
		this.FPricenote = FPricenote;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
	}

	// Property accessors

	public String getFEnergypriceid() {
		return this.FEnergypriceid;
	}

	public void setFEnergypriceid(String FEnergypriceid) {
		this.FEnergypriceid = FEnergypriceid;
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

	public Double getFPricevalue() {
		return this.FPricevalue;
	}

	public void setFPricevalue(Double FPricevalue) {
		this.FPricevalue = FPricevalue;
	}

	public String getFPricenote() {
		return this.FPricenote;
	}

	public void setFPricenote(String FPricenote) {
		this.FPricenote = FPricenote;
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

}