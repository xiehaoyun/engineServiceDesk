package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TMoDepartmonitorprelainfo entity. @author MyEclipse Persistence Tools
 */

public class TMoDepartmonitorprelainfo implements java.io.Serializable {

	// Fields

	private TMoDepartmonitorprelainfoId id;
	private TMoMapstrategy TMoMapstrategy;
	private Double FMaprate;
	private Timestamp FCreatetime;
	private String FCreateuser;

	// Constructors

	/** default constructor */
	public TMoDepartmonitorprelainfo() {
	}

	/** minimal constructor */
	public TMoDepartmonitorprelainfo(TMoDepartmonitorprelainfoId id,
			Double FMaprate) {
		this.id = id;
		this.FMaprate = FMaprate;
	}

	/** full constructor */
	public TMoDepartmonitorprelainfo(TMoDepartmonitorprelainfoId id,
			TMoMapstrategy TMoMapstrategy, Double FMaprate,
			Timestamp FCreatetime, String FCreateuser) {
		this.id = id;
		this.TMoMapstrategy = TMoMapstrategy;
		this.FMaprate = FMaprate;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
	}

	// Property accessors

	public TMoDepartmonitorprelainfoId getId() {
		return this.id;
	}

	public void setId(TMoDepartmonitorprelainfoId id) {
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