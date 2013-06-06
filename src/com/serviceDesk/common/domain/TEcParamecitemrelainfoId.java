package com.serviceDesk.common.domain;

/**
 * TEcParamecitemrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TEcParamecitemrelainfoId implements java.io.Serializable {

	// Fields

	private TDtEnergyitemdict TDtEnergyitemdict;
	private TStMeterparaminfo TStMeterparaminfo;

	// Constructors

	/** default constructor */
	public TEcParamecitemrelainfoId() {
	}

	/** full constructor */
	public TEcParamecitemrelainfoId(TDtEnergyitemdict TDtEnergyitemdict,
			TStMeterparaminfo TStMeterparaminfo) {
		this.TDtEnergyitemdict = TDtEnergyitemdict;
		this.TStMeterparaminfo = TStMeterparaminfo;
	}

	// Property accessors

	public TDtEnergyitemdict getTDtEnergyitemdict() {
		return this.TDtEnergyitemdict;
	}

	public void setTDtEnergyitemdict(TDtEnergyitemdict TDtEnergyitemdict) {
		this.TDtEnergyitemdict = TDtEnergyitemdict;
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
		if (!(other instanceof TEcParamecitemrelainfoId))
			return false;
		TEcParamecitemrelainfoId castOther = (TEcParamecitemrelainfoId) other;

		return ((this.getTDtEnergyitemdict() == castOther
				.getTDtEnergyitemdict()) || (this.getTDtEnergyitemdict() != null
				&& castOther.getTDtEnergyitemdict() != null && this
				.getTDtEnergyitemdict()
				.equals(castOther.getTDtEnergyitemdict())))
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
				+ (getTDtEnergyitemdict() == null ? 0 : this
						.getTDtEnergyitemdict().hashCode());
		result = 37
				* result
				+ (getTStMeterparaminfo() == null ? 0 : this
						.getTStMeterparaminfo().hashCode());
		return result;
	}

}