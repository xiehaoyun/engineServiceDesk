package com.serviceDesk.common.domain;

/**
 * TPdComponentrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdComponentrelainfoId implements java.io.Serializable {

	// Fields

	private TPdCompuseinfo TPdCompuseinfo;
	private TPdCompuseinfo TPdCompuseinfo_1;

	// Constructors

	/** default constructor */
	public TPdComponentrelainfoId() {
	}

	/** full constructor */
	public TPdComponentrelainfoId(TPdCompuseinfo TPdCompuseinfo,
			TPdCompuseinfo TPdCompuseinfo_1) {
		this.TPdCompuseinfo = TPdCompuseinfo;
		this.TPdCompuseinfo_1 = TPdCompuseinfo_1;
	}

	// Property accessors

	public TPdCompuseinfo getTPdCompuseinfo() {
		return this.TPdCompuseinfo;
	}

	public void setTPdCompuseinfo(TPdCompuseinfo TPdCompuseinfo) {
		this.TPdCompuseinfo = TPdCompuseinfo;
	}

	public TPdCompuseinfo getTPdCompuseinfo_1() {
		return this.TPdCompuseinfo_1;
	}

	public void setTPdCompuseinfo_1(TPdCompuseinfo TPdCompuseinfo_1) {
		this.TPdCompuseinfo_1 = TPdCompuseinfo_1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdComponentrelainfoId))
			return false;
		TPdComponentrelainfoId castOther = (TPdComponentrelainfoId) other;

		return ((this.getTPdCompuseinfo() == castOther.getTPdCompuseinfo()) || (this
				.getTPdCompuseinfo() != null
				&& castOther.getTPdCompuseinfo() != null && this
				.getTPdCompuseinfo().equals(castOther.getTPdCompuseinfo())))
				&& ((this.getTPdCompuseinfo_1() == castOther
						.getTPdCompuseinfo_1()) || (this.getTPdCompuseinfo_1() != null
						&& castOther.getTPdCompuseinfo_1() != null && this
						.getTPdCompuseinfo_1().equals(
								castOther.getTPdCompuseinfo_1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTPdCompuseinfo() == null ? 0 : this.getTPdCompuseinfo()
						.hashCode());
		result = 37
				* result
				+ (getTPdCompuseinfo_1() == null ? 0 : this
						.getTPdCompuseinfo_1().hashCode());
		return result;
	}

}