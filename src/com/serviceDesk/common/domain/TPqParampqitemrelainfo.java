package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TPqParampqitemrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TPqParampqitemrelainfo implements java.io.Serializable {

	// Fields

	private TPqParampqitemrelainfoId id;
	private Double FUnitrate;
	private Timestamp FCreatetime;

	// Constructors

	/** default constructor */
	public TPqParampqitemrelainfo() {
	}

	/** minimal constructor */
	public TPqParampqitemrelainfo(TPqParampqitemrelainfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TPqParampqitemrelainfo(TPqParampqitemrelainfoId id,
			Double FUnitrate, Timestamp FCreatetime) {
		this.id = id;
		this.FUnitrate = FUnitrate;
		this.FCreatetime = FCreatetime;
	}

	// Property accessors

	public TPqParampqitemrelainfoId getId() {
		return this.id;
	}

	public void setId(TPqParampqitemrelainfoId id) {
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