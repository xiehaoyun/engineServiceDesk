package com.serviceDesk.common.domain;

/**
 * TPdDepartmaintarelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TPdDepartmaintarelainfoId implements java.io.Serializable {

	// Fields

	private TMoOrgbaseinfo TMoOrgbaseinfo;
	private TPdMaintareainfo TPdMaintareainfo;

	// Constructors

	/** default constructor */
	public TPdDepartmaintarelainfoId() {
	}

	/** full constructor */
	public TPdDepartmaintarelainfoId(TMoOrgbaseinfo TMoOrgbaseinfo,
			TPdMaintareainfo TPdMaintareainfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.TPdMaintareainfo = TPdMaintareainfo;
	}

	// Property accessors

	public TMoOrgbaseinfo getTMoOrgbaseinfo() {
		return this.TMoOrgbaseinfo;
	}

	public void setTMoOrgbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
	}

	public TPdMaintareainfo getTPdMaintareainfo() {
		return this.TPdMaintareainfo;
	}

	public void setTPdMaintareainfo(TPdMaintareainfo TPdMaintareainfo) {
		this.TPdMaintareainfo = TPdMaintareainfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TPdDepartmaintarelainfoId))
			return false;
		TPdDepartmaintarelainfoId castOther = (TPdDepartmaintarelainfoId) other;

		return ((this.getTMoOrgbaseinfo() == castOther.getTMoOrgbaseinfo()) || (this
				.getTMoOrgbaseinfo() != null
				&& castOther.getTMoOrgbaseinfo() != null && this
				.getTMoOrgbaseinfo().equals(castOther.getTMoOrgbaseinfo())))
				&& ((this.getTPdMaintareainfo() == castOther
						.getTPdMaintareainfo()) || (this.getTPdMaintareainfo() != null
						&& castOther.getTPdMaintareainfo() != null && this
						.getTPdMaintareainfo().equals(
								castOther.getTPdMaintareainfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTMoOrgbaseinfo() == null ? 0 : this.getTMoOrgbaseinfo()
						.hashCode());
		result = 37
				* result
				+ (getTPdMaintareainfo() == null ? 0 : this
						.getTPdMaintareainfo().hashCode());
		return result;
	}

}