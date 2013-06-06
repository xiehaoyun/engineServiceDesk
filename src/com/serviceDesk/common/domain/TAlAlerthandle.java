package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TAlAlerthandle entity. @author MyEclipse Persistence Tools
 */

public class TAlAlerthandle implements java.io.Serializable {

	// Fields

	private BigDecimal FOperatingid;
	private TAlAlertinfo TAlAlertinfo;
	private TEvStaffinfo TEvStaffinfo;
	private String FHandlemethod;
	private String FHandlereason;
	private Timestamp FHandletime;

	// Constructors

	/** default constructor */
	public TAlAlerthandle() {
	}

	/** full constructor */
	public TAlAlerthandle(TAlAlertinfo TAlAlertinfo, TEvStaffinfo TEvStaffinfo,
			String FHandlemethod, String FHandlereason, Timestamp FHandletime) {
		this.TAlAlertinfo = TAlAlertinfo;
		this.TEvStaffinfo = TEvStaffinfo;
		this.FHandlemethod = FHandlemethod;
		this.FHandlereason = FHandlereason;
		this.FHandletime = FHandletime;
	}

	// Property accessors

	public BigDecimal getFOperatingid() {
		return this.FOperatingid;
	}

	public void setFOperatingid(BigDecimal FOperatingid) {
		this.FOperatingid = FOperatingid;
	}

	public TAlAlertinfo getTAlAlertinfo() {
		return this.TAlAlertinfo;
	}

	public void setTAlAlertinfo(TAlAlertinfo TAlAlertinfo) {
		this.TAlAlertinfo = TAlAlertinfo;
	}

	public TEvStaffinfo getTEvStaffinfo() {
		return this.TEvStaffinfo;
	}

	public void setTEvStaffinfo(TEvStaffinfo TEvStaffinfo) {
		this.TEvStaffinfo = TEvStaffinfo;
	}

	public String getFHandlemethod() {
		return this.FHandlemethod;
	}

	public void setFHandlemethod(String FHandlemethod) {
		this.FHandlemethod = FHandlemethod;
	}

	public String getFHandlereason() {
		return this.FHandlereason;
	}

	public void setFHandlereason(String FHandlereason) {
		this.FHandlereason = FHandlereason;
	}

	public Timestamp getFHandletime() {
		return this.FHandletime;
	}

	public void setFHandletime(Timestamp FHandletime) {
		this.FHandletime = FHandletime;
	}

}