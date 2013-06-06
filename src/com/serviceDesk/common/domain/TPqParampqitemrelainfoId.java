package com.serviceDesk.common.domain;

/**
 * TPqParampqitemrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TPqParampqitemrelainfoId implements java.io.Serializable {

	// Fields

	private TDtPowerqltyitemdict TDtPowerqltyitemdict;
	private TStMeterparaminfo TStMeterparaminfo;

	// Constructors

	/** default constructor */
	public TPqParampqitemrelainfoId() {
	}

	/** full constructor */
	public TPqParampqitemrelainfoId(TDtPowerqltyitemdict TDtPowerqltyitemdict,
			TStMeterparaminfo TStMeterparaminfo) {
		this.TDtPowerqltyitemdict = TDtPowerqltyitemdict;
		this.TStMeterparaminfo = TStMeterparaminfo;
	}

	// Property accessors

	public TDtPowerqltyitemdict getTDtPowerqltyitemdict() {
		return this.TDtPowerqltyitemdict;
	}

	public void setTDtPowerqltyitemdict(
			TDtPowerqltyitemdict TDtPowerqltyitemdict) {
		this.TDtPowerqltyitemdict = TDtPowerqltyitemdict;
	}

	public TStMeterparaminfo getTStMeterparaminfo() {
		return this.TStMeterparaminfo;
	}

	public void setTStMeterparaminfo(TStMeterparaminfo TStMeterparaminfo) {
		this.TStMeterparaminfo = TStMeterparaminfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPqParampqitemrelainfoId))
			return false;
		TPqParampqitemrelainfoId castOther = (TPqParampqitemrelainfoId) other;

		return ((this.getTDtPowerqltyitemdict() == castOther
				.getTDtPowerqltyitemdict()) || (this.getTDtPowerqltyitemdict() != null
				&& castOther.getTDtPowerqltyitemdict() != null && this
				.getTDtPowerqltyitemdict().equals(
						castOther.getTDtPowerqltyitemdict())))
				&& ((this.getTStMeterparaminfo() == castOther
						.getTStMeterparaminfo()) || (this
						.getTStMeterparaminfo() != null
						&& castOther.getTStMeterparaminfo() != null && this
						.getTStMeterparaminfo().equals(
								castOther.getTStMeterparaminfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTDtPowerqltyitemdict() == null ? 0 : this
						.getTDtPowerqltyitemdict().hashCode());
		result = 37
				* result
				+ (getTStMeterparaminfo() == null ? 0 : this
						.getTStMeterparaminfo().hashCode());
		return result;
	}

}