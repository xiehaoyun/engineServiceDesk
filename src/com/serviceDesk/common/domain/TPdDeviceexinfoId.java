package com.serviceDesk.common.domain;

import com.serviceDesk.config.domain.TPdDevexinfodict;
import com.serviceDesk.config.domain.TPdDeviceinfo;

/**
 * TPdDeviceexinfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdDeviceexinfoId implements java.io.Serializable {

	// Fields

	private TPdDeviceinfo TPdDeviceinfo;
	private TPdDevexinfodict TPdDevexinfodict;

	// Constructors

	/** default constructor */
	public TPdDeviceexinfoId() {
	}

	/** full constructor */
	public TPdDeviceexinfoId(TPdDeviceinfo TPdDeviceinfo,
			TPdDevexinfodict TPdDevexinfodict) {
		this.TPdDeviceinfo = TPdDeviceinfo;
		this.TPdDevexinfodict = TPdDevexinfodict;
	}

	// Property accessors

	public TPdDeviceinfo getTPdDeviceinfo() {
		return this.TPdDeviceinfo;
	}

	public void setTPdDeviceinfo(TPdDeviceinfo TPdDeviceinfo) {
		this.TPdDeviceinfo = TPdDeviceinfo;
	}

	public TPdDevexinfodict getTPdDevexinfodict() {
		return this.TPdDevexinfodict;
	}

	public void setTPdDevexinfodict(TPdDevexinfodict TPdDevexinfodict) {
		this.TPdDevexinfodict = TPdDevexinfodict;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdDeviceexinfoId))
			return false;
		TPdDeviceexinfoId castOther = (TPdDeviceexinfoId) other;

		return ((this.getTPdDeviceinfo() == castOther.getTPdDeviceinfo()) || (this
				.getTPdDeviceinfo() != null
				&& castOther.getTPdDeviceinfo() != null && this
				.getTPdDeviceinfo().equals(castOther.getTPdDeviceinfo())))
				&& ((this.getTPdDevexinfodict() == castOther
						.getTPdDevexinfodict()) || (this.getTPdDevexinfodict() != null
						&& castOther.getTPdDevexinfodict() != null && this
						.getTPdDevexinfodict().equals(
								castOther.getTPdDevexinfodict())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTPdDeviceinfo() == null ? 0 : this.getTPdDeviceinfo()
						.hashCode());
		result = 37
				* result
				+ (getTPdDevexinfodict() == null ? 0 : this
						.getTPdDevexinfodict().hashCode());
		return result;
	}

}