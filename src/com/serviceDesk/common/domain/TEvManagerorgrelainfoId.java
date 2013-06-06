package com.serviceDesk.common.domain;

/**
 * TEvManagerorgrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TEvManagerorgrelainfoId implements java.io.Serializable {

	// Fields

	private TMoOrgbaseinfo TMoOrgbaseinfo;
	private TEvStaffinfo TEvStaffinfo;

	// Constructors

	/** default constructor */
	public TEvManagerorgrelainfoId() {
	}

	/** full constructor */
	public TEvManagerorgrelainfoId(TMoOrgbaseinfo TMoOrgbaseinfo,
			TEvStaffinfo TEvStaffinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.TEvStaffinfo = TEvStaffinfo;
	}

	// Property accessors

	public TMoOrgbaseinfo getTMoOrgbaseinfo() {
		return this.TMoOrgbaseinfo;
	}

	public void setTMoOrgbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
	}

	public TEvStaffinfo getTEvStaffinfo() {
		return this.TEvStaffinfo;
	}

	public void setTEvStaffinfo(TEvStaffinfo TEvStaffinfo) {
		this.TEvStaffinfo = TEvStaffinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TEvManagerorgrelainfoId))
			return false;
		TEvManagerorgrelainfoId castOther = (TEvManagerorgrelainfoId) other;

		return ((this.getTMoOrgbaseinfo() == castOther.getTMoOrgbaseinfo()) || (this
				.getTMoOrgbaseinfo() != null
				&& castOther.getTMoOrgbaseinfo() != null && this
				.getTMoOrgbaseinfo().equals(castOther.getTMoOrgbaseinfo())))
				&& ((this.getTEvStaffinfo() == castOther.getTEvStaffinfo()) || (this
						.getTEvStaffinfo() != null
						&& castOther.getTEvStaffinfo() != null && this
						.getTEvStaffinfo().equals(castOther.getTEvStaffinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTMoOrgbaseinfo() == null ? 0 : this.getTMoOrgbaseinfo()
						.hashCode());
		result = 37
				* result
				+ (getTEvStaffinfo() == null ? 0 : this.getTEvStaffinfo()
						.hashCode());
		return result;
	}

}