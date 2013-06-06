package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TEvManagerorgrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TEvManagerorgrelainfo implements java.io.Serializable {

	// Fields

	private TEvManagerorgrelainfoId id;
	private Timestamp FStarttime;
	private Timestamp FEndtime;
	private Integer FState;
	private String FDescription;

	// Constructors

	/** default constructor */
	public TEvManagerorgrelainfo() {
	}

	/** minimal constructor */
	public TEvManagerorgrelainfo(TEvManagerorgrelainfoId id) {
		this.id = id;
	}

	/** full constructor */
	public TEvManagerorgrelainfo(TEvManagerorgrelainfoId id,
			Timestamp FStarttime, Timestamp FEndtime, Integer FState,
			String FDescription) {
		this.id = id;
		this.FStarttime = FStarttime;
		this.FEndtime = FEndtime;
		this.FState = FState;
		this.FDescription = FDescription;
	}

	// Property accessors

	public TEvManagerorgrelainfoId getId() {
		return this.id;
	}

	public void setId(TEvManagerorgrelainfoId id) {
		this.id = id;
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

	public Integer getFState() {
		return this.FState;
	}

	public void setFState(Integer FState) {
		this.FState = FState;
	}

	public String getFDescription() {
		return this.FDescription;
	}

	public void setFDescription(String FDescription) {
		this.FDescription = FDescription;
	}

}