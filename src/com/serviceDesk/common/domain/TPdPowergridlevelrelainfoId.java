package com.serviceDesk.common.domain;

/**
 * TPdPowergridlevelrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdPowergridlevelrelainfoId implements java.io.Serializable {

	// Fields

	private TPdPowergridinfo TPdPowergridinfo;
	private TPdPowergridinfo TPdPowergridinfo_1;

	// Constructors

	/** default constructor */
	public TPdPowergridlevelrelainfoId() {
	}

	/** full constructor */
	public TPdPowergridlevelrelainfoId(TPdPowergridinfo TPdPowergridinfo,
			TPdPowergridinfo TPdPowergridinfo_1) {
		this.TPdPowergridinfo = TPdPowergridinfo;
		this.TPdPowergridinfo_1 = TPdPowergridinfo_1;
	}

	// Property accessors

	public TPdPowergridinfo getTPdPowergridinfo() {
		return this.TPdPowergridinfo;
	}

	public void setTPdPowergridinfo(TPdPowergridinfo TPdPowergridinfo) {
		this.TPdPowergridinfo = TPdPowergridinfo;
	}

	public TPdPowergridinfo getTPdPowergridinfo_1() {
		return this.TPdPowergridinfo_1;
	}

	public void setTPdPowergridinfo_1(TPdPowergridinfo TPdPowergridinfo_1) {
		this.TPdPowergridinfo_1 = TPdPowergridinfo_1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdPowergridlevelrelainfoId))
			return false;
		TPdPowergridlevelrelainfoId castOther = (TPdPowergridlevelrelainfoId) other;

		return ((this.getTPdPowergridinfo() == castOther.getTPdPowergridinfo()) || (this
				.getTPdPowergridinfo() != null
				&& castOther.getTPdPowergridinfo() != null && this
				.getTPdPowergridinfo().equals(castOther.getTPdPowergridinfo())))
				&& ((this.getTPdPowergridinfo_1() == castOther
						.getTPdPowergridinfo_1()) || (this
						.getTPdPowergridinfo_1() != null
						&& castOther.getTPdPowergridinfo_1() != null && this
						.getTPdPowergridinfo_1().equals(
								castOther.getTPdPowergridinfo_1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTPdPowergridinfo() == null ? 0 : this
						.getTPdPowergridinfo().hashCode());
		result = 37
				* result
				+ (getTPdPowergridinfo_1() == null ? 0 : this
						.getTPdPowergridinfo_1().hashCode());
		return result;
	}

}