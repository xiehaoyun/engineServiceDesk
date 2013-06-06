package com.serviceDesk.common.domain;

/**
 * TPdCompexinfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdCompexinfoId implements java.io.Serializable {

	// Fields

	private TPdComponentinfo TPdComponentinfo;
	private TPdCompexinfodict TPdCompexinfodict;

	// Constructors

	/** default constructor */
	public TPdCompexinfoId() {
	}

	/** full constructor */
	public TPdCompexinfoId(TPdComponentinfo TPdComponentinfo,
			TPdCompexinfodict TPdCompexinfodict) {
		this.TPdComponentinfo = TPdComponentinfo;
		this.TPdCompexinfodict = TPdCompexinfodict;
	}

	// Property accessors

	public TPdComponentinfo getTPdComponentinfo() {
		return this.TPdComponentinfo;
	}

	public void setTPdComponentinfo(TPdComponentinfo TPdComponentinfo) {
		this.TPdComponentinfo = TPdComponentinfo;
	}

	public TPdCompexinfodict getTPdCompexinfodict() {
		return this.TPdCompexinfodict;
	}

	public void setTPdCompexinfodict(TPdCompexinfodict TPdCompexinfodict) {
		this.TPdCompexinfodict = TPdCompexinfodict;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdCompexinfoId))
			return false;
		TPdCompexinfoId castOther = (TPdCompexinfoId) other;

		return ((this.getTPdComponentinfo() == castOther.getTPdComponentinfo()) || (this
				.getTPdComponentinfo() != null
				&& castOther.getTPdComponentinfo() != null && this
				.getTPdComponentinfo().equals(castOther.getTPdComponentinfo())))
				&& ((this.getTPdCompexinfodict() == castOther
						.getTPdCompexinfodict()) || (this
						.getTPdCompexinfodict() != null
						&& castOther.getTPdCompexinfodict() != null && this
						.getTPdCompexinfodict().equals(
								castOther.getTPdCompexinfodict())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTPdComponentinfo() == null ? 0 : this
						.getTPdComponentinfo().hashCode());
		result = 37
				* result
				+ (getTPdCompexinfodict() == null ? 0 : this
						.getTPdCompexinfodict().hashCode());
		return result;
	}

}