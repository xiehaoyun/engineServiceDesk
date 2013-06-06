package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TEcParamecitemrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TEcParamecitemrelainfo implements java.io.Serializable {

	// Fields

	private TEcParamecitemrelainfoId id;
	private Double FUnitrate;
	private Timestamp FCreatetime;

	// Constructors

	/** default constructor */
	public TEcParamecitemrelainfo() {
	}

	/** minimal constructor */
	public TEcParamecitemrelainfo(TEcParamecitemrelainfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TEcParamecitemrelainfo(TEcParamecitemrelainfoId id,
			Double FUnitrate, Timestamp FCreatetime) {
		this.id = id;
		this.FUnitrate = FUnitrate;
		this.FCreatetime = FCreatetime;
	}

	// Property accessors

	public TEcParamecitemrelainfoId getId() {
		return this.id;
	}

	public void setId(TEcParamecitemrelainfoId id) {
		this.id = id;
	}

	public Double getFUnitrate() {
		return this.FUnitrate;
	}

	public void setFUnitrate(Double FUnitrate) {
		this.FUnitrate = FUnitrate;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

}