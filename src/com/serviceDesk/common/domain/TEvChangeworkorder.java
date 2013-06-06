package com.serviceDesk.common.domain;

import java.math.BigDecimal;

/**
 * TEvChangeworkorder entity. @author MyEclipse Persistence Tools
 */

public class TEvChangeworkorder implements java.io.Serializable {

	// Fields

	private BigDecimal FWorkorderid;
	private TEvEventworkorder TEvEventworkorder;
	private TEvStaffinfo TEvStaffinfo;
	private String FFaultdesc;
	private String FFaultreason;
	private String FPreassetsid;
	private String FAfterassetsid;

	// Constructors

	/** default constructor */
	public TEvChangeworkorder() {
	}

	/** full constructor */
	public TEvChangeworkorder(TEvEventworkorder TEvEventworkorder,
			TEvStaffinfo TEvStaffinfo, String FFaultdesc, String FFaultreason,
			String FPreassetsid, String FAfterassetsid) {
		this.TEvEventworkorder = TEvEventworkorder;
		this.TEvStaffinfo = TEvStaffinfo;
		this.FFaultdesc = FFaultdesc;
		this.FFaultreason = FFaultreason;
		this.FPreassetsid = FPreassetsid;
		this.FAfterassetsid = FAfterassetsid;
	}

	// Property accessors

	public BigDecimal getFWorkorderid() {
		return this.FWorkorderid;
	}

	public void setFWorkorderid(BigDecimal FWorkorderid) {
		this.FWorkorderid = FWorkorderid;
	}

	public TEvEventworkorder getTEvEventworkorder() {
		return this.TEvEventworkorder;
	}

	public void setTEvEventworkorder(TEvEventworkorder TEvEventworkorder) {
		this.TEvEventworkorder = TEvEventworkorder;
	}

	public TEvStaffinfo getTEvStaffinfo() {
		return this.TEvStaffinfo;
	}

	public void setTEvStaffinfo(TEvStaffinfo TEvStaffinfo) {
		this.TEvStaffinfo = TEvStaffinfo;
	}

	public String getFFaultdesc() {
		return this.FFaultdesc;
	}

	public void setFFaultdesc(String FFaultdesc) {
		this.FFaultdesc = FFaultdesc;
	}

	public String getFFaultreason() {
		return this.FFaultreason;
	}

	public void setFFaultreason(String FFaultreason) {
		this.FFaultreason = FFaultreason;
	}

	public String getFPreassetsid() {
		return this.FPreassetsid;
	}

	public void setFPreassetsid(String FPreassetsid) {
		this.FPreassetsid = FPreassetsid;
	}

	public String getFAfterassetsid() {
		return this.FAfterassetsid;
	}

	public void setFAfterassetsid(String FAfterassetsid) {
		this.FAfterassetsid = FAfterassetsid;
	}

}