package com.serviceDesk.common.domain;

/**
 * TMoMonitoraprelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TMoMonitoraprelainfoId implements java.io.Serializable {

	// Fields

	private TMoMonitorabaseinfo TMoMonitorabaseinfo;
	private TMoMonitorpinfo TMoMonitorpinfo;

	// Constructors

	/** default constructor */
	public TMoMonitoraprelainfoId() {
	}

	/** full constructor */
	public TMoMonitoraprelainfoId(TMoMonitorabaseinfo TMoMonitorabaseinfo,
			TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorabaseinfo = TMoMonitorabaseinfo;
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	// Property accessors

	public TMoMonitorabaseinfo getTMoMonitorabaseinfo() {
		return this.TMoMonitorabaseinfo;
	}

	public void setTMoMonitorabaseinfo(TMoMonitorabaseinfo TMoMonitorabaseinfo) {
		this.TMoMonitorabaseinfo = TMoMonitorabaseinfo;
	}

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TMoMonitoraprelainfoId))
			return false;
		TMoMonitoraprelainfoId castOther = (TMoMonitoraprelainfoId) other;

		return ((this.getTMoMonitorabaseinfo() == castOther
				.getTMoMonitorabaseinfo()) || (this.getTMoMonitorabaseinfo() != null
				&& castOther.getTMoMonitorabaseinfo() != null && this
				.getTMoMonitorabaseinfo().equals(
						castOther.getTMoMonitorabaseinfo())))
				&& ((this.getTMoMonitorpinfo() == castOther
						.getTMoMonitorpinfo()) || (this.getTMoMonitorpinfo() != null
						&& castOther.getTMoMonitorpinfo() != null && this
						.getTMoMonitorpinfo().equals(
								castOther.getTMoMonitorpinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTMoMonitorabaseinfo() == null ? 0 : this
						.getTMoMonitorabaseinfo().hashCode());
		result = 37
				* result
				+ (getTMoMonitorpinfo() == null ? 0 : this.getTMoMonitorpinfo()
						.hashCode());
		return result;
	}

}