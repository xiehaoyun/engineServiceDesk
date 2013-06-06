package com.serviceDesk.common.domain;

/**
 * TEvAlerttypeconrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TEvAlerttypeconrelainfoId implements java.io.Serializable {

	// Fields

	private TAlAlerttype TAlAlerttype;
	private TAlAlertcondition TAlAlertcondition;

	// Constructors

	/** default constructor */
	public TEvAlerttypeconrelainfoId() {
	}

	/** full constructor */
	public TEvAlerttypeconrelainfoId(TAlAlerttype TAlAlerttype,
			TAlAlertcondition TAlAlertcondition) {
		this.TAlAlerttype = TAlAlerttype;
		this.TAlAlertcondition = TAlAlertcondition;
	}

	// Property accessors

	public TAlAlerttype getTAlAlerttype() {
		return this.TAlAlerttype;
	}

	public void setTAlAlerttype(TAlAlerttype TAlAlerttype) {
		this.TAlAlerttype = TAlAlerttype;
	}

	public TAlAlertcondition getTAlAlertcondition() {
		return this.TAlAlertcondition;
	}

	public void setTAlAlertcondition(TAlAlertcondition TAlAlertcondition) {
		this.TAlAlertcondition = TAlAlertcondition;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TEvAlerttypeconrelainfoId))
			return false;
		TEvAlerttypeconrelainfoId castOther = (TEvAlerttypeconrelainfoId) other;

		return ((this.getTAlAlerttype() == castOther.getTAlAlerttype()) || (this
				.getTAlAlerttype() != null
				&& castOther.getTAlAlerttype() != null && this
				.getTAlAlerttype().equals(castOther.getTAlAlerttype())))
				&& ((this.getTAlAlertcondition() == castOther
						.getTAlAlertcondition()) || (this
						.getTAlAlertcondition() != null
						&& castOther.getTAlAlertcondition() != null && this
						.getTAlAlertcondition().equals(
								castOther.getTAlAlertcondition())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTAlAlerttype() == null ? 0 : this.getTAlAlerttype()
						.hashCode());
		result = 37
				* result
				+ (getTAlAlertcondition() == null ? 0 : this
						.getTAlAlertcondition().hashCode());
		return result;
	}

}