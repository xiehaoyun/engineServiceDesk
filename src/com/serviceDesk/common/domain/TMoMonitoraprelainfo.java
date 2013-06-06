package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TMoMonitoraprelainfo entity. @author MyEclipse Persistence Tools
 */

public class TMoMonitoraprelainfo implements java.io.Serializable {

	// Fields

	private TMoMonitoraprelainfoId id;
	private TMoMapstrategy TMoMapstrategy;
	private Double FMaprate;
	private Timestamp FCreatetime;
	private String FCreateuser;

	// Constructors

	/** default constructor */
	public TMoMonitoraprelainfo() {
	}

	/** minimal constructor */
	public TMoMonitoraprelainfo(TMoMonitoraprelainfoId id, Double FMaprate) {
		this.id = id;
		this.FMaprate = FMaprate;
	}

	/** full constructor */
	public TMoMonitoraprelainfo(TMoMonitoraprelainfoId id,
			TMoMapstrategy TMoMapstrategy, Double FMaprate,
			Timestamp FCreatetime, String FCreateuser) {
		this.id = id;
		this.TMoMapstrategy = TMoMapstrategy;
		this.FMaprate = FMaprate;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
	}

	// Property accessors

	public TMoMonitoraprelainfoId getId() {
		return this.id;
	}

	public void setId(TMoMonitoraprelainfoId id) {
		this.id = id;
	}

	public TMoMapstrategy getTMoMapstrategy() {
		return this.TMoMapstrategy;
	}

	public void setTMoMapstrategy(TMoMapstrategy TMoMapstrategy) {
		this.TMoMapstrategy = TMoMapstrategy;
	}

	public Double getFMaprate() {
		return this.FMaprate;
	}

	public void setFMaprate(Double FMaprate) {
		this.FMaprate = FMaprate;
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