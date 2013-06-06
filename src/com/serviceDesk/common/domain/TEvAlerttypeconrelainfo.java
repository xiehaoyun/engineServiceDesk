package com.serviceDesk.common.domain;

/**
 * TEvAlerttypeconrelainfo entity. @author MyEclipse Persistence Tools
 */

public class TEvAlerttypeconrelainfo implements java.io.Serializable {

	// Fields

	private TEvAlerttypeconrelainfoId id;

	// Constructors

	/** default constructor */
	public TEvAlerttypeconrelainfo() {
	}

	/** full constructor */
	public TEvAlerttypeconrelainfo(TEvAlerttypeconrelainfoId id) {
		this.id = id;
	}

	// Property accessors

	public TEvAlerttypeconrelainfoId getId() {
		return this.id;
	}

	public void setId(TEvAlerttypeconrelainfoId id) {
		this.id = id;
	}

}