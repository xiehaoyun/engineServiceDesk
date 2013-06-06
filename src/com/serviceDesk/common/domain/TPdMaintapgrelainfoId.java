package com.serviceDesk.common.domain;

/**
 * TPdMaintapgrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdMaintapgrelainfoId implements java.io.Serializable {

	// Fields

	private TPdMaintareainfo TPdMaintareainfo;
	private TPdPowergridinfo TPdPowergridinfo;

	// Constructors

	/** default constructor */
	public TPdMaintapgrelainfoId() {
	}

	/** full constructor */
	public TPdMaintapgrelainfoId(TPdMaintareainfo TPdMaintareainfo,
			TPdPowergridinfo TPdPowergridinfo) {
		this.TPdMaintareainfo = TPdMaintareainfo;
		this.TPdPowergridinfo = TPdPowergridinfo;
	}

	// Property accessors

	public TPdMaintareainfo getTPdMaintareainfo() {
		return this.TPdMaintareainfo;
	}

	public void setTPdMaintareainfo(TPdMaintareainfo TPdMaintareainfo) {
		this.TPdMaintareainfo = TPdMaintareainfo;
	}

	public TPdPowergridinfo getTPdPowergridinfo() {
		return this.TPdPowergridinfo;
	}

	public void setTPdPowergridinfo(TPdPowergridinfo TPdPowergridinfo) {
		this.TPdPowergridinfo = TPdPowergridinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdMaintapgrelainfoId))
			return false;
		TPdMaintapgrelainfoId castOther = (TPdMaintapgrelainfoId) other;

		return ((this.getTPdMaintareainfo() == castOther.getTPdMaintareainfo()) || (this
				.getTPdMaintareainfo() != null
				&& castOther.getTPdMaintareainfo() != null && this
				.getTPdMaintareainfo().equals(castOther.getTPdMaintareainfo())))
				&& ((this.getTPdPowergridinfo() == castOther
						.getTPdPowergridinfo()) || (this.getTPdPowergridinfo() != null
						&& castOther.getTPdPowergridinfo() != null && this
						.getTPdPowergridinfo().equals(
								castOther.getTPdPowergridinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTPdMaintareainfo() == null ? 0 : this
						.getTPdMaintareainfo().hashCode());
		result = 37
				* result
				+ (getTPdPowergridinfo() == null ? 0 : this
						.getTPdPowergridinfo().hashCode());
		return result;
	}

}