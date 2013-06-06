package com.serviceDesk.common.domain;

/**
 * TEcMeterecitemrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TEcMeterecitemrelainfoId implements java.io.Serializable {

	// Fields

	private TStMeteruseinfo TStMeteruseinfo;
	private TDtEnergyitemdict TDtEnergyitemdict;

	// Constructors

	/** default constructor */
	public TEcMeterecitemrelainfoId() {
	}

	/** full constructor */
	public TEcMeterecitemrelainfoId(TStMeteruseinfo TStMeteruseinfo,
			TDtEnergyitemdict TDtEnergyitemdict) {
		this.TStMeteruseinfo = TStMeteruseinfo;
		this.TDtEnergyitemdict = TDtEnergyitemdict;
	}

	// Property accessors

	public TStMeteruseinfo getTStMeteruseinfo() {
		return this.TStMeteruseinfo;
	}

	public void setTStMeteruseinfo(TStMeteruseinfo TStMeteruseinfo) {
		this.TStMeteruseinfo = TStMeteruseinfo;
	}

	public TDtEnergyitemdict getTDtEnergyitemdict() {
		return this.TDtEnergyitemdict;
	}

	public void setTDtEnergyitemdict(TDtEnergyitemdict TDtEnergyitemdict) {
		this.TDtEnergyitemdict = TDtEnergyitemdict;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TEcMeterecitemrelainfoId))
			return false;
		TEcMeterecitemrelainfoId castOther = (TEcMeterecitemrelainfoId) other;

		return ((this.getTStMeteruseinfo() == castOther.getTStMeteruseinfo()) || (this
				.getTStMeteruseinfo() != null
				&& castOther.getTStMeteruseinfo() != null && this
				.getTStMeteruseinfo().equals(castOther.getTStMeteruseinfo())))
				&& ((this.getTDtEnergyitemdict() == castOther
						.getTDtEnergyitemdict()) || (this
						.getTDtEnergyitemdict() != null
						&& castOther.getTDtEnergyitemdict() != null && this
						.getTDtEnergyitemdict().equals(
								castOther.getTDtEnergyitemdict())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTStMeteruseinfo() == null ? 0 : this.getTStMeteruseinfo()
						.hashCode());
		result = 37
				* result
				+ (getTDtEnergyitemdict() == null ? 0 : this
						.getTDtEnergyitemdict().hashCode());
		return result;
	}

}