package com.serviceDesk.common.domain;

/**
 * TMoDepartmonitorprelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TMoDepartmonitorprelainfoId implements java.io.Serializable {

	// Fields

	private TMoMonitorpinfo TMoMonitorpinfo;
	private TMoDepartbaseinfo TMoDepartbaseinfo;

	// Constructors

	/** default constructor */
	public TMoDepartmonitorprelainfoId() {
	}

	/** full constructor */
	public TMoDepartmonitorprelainfoId(TMoMonitorpinfo TMoMonitorpinfo,
			TMoDepartbaseinfo TMoDepartbaseinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
		this.TMoDepartbaseinfo = TMoDepartbaseinfo;
	}

	// Property accessors

	public TMoMonitorpinfo getTMoMonitorpinfo() {
		return this.TMoMonitorpinfo;
	}

	public void setTMoMonitorpinfo(TMoMonitorpinfo TMoMonitorpinfo) {
		this.TMoMonitorpinfo = TMoMonitorpinfo;
	}

	public TMoDepartbaseinfo getTMoDepartbaseinfo() {
		return this.TMoDepartbaseinfo;
	}

	public void setTMoDepartbaseinfo(TMoDepartbaseinfo TMoDepartbaseinfo) {
		this.TMoDepartbaseinfo = TMoDepartbaseinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TMoDepartmonitorprelainfoId))
			return false;
		TMoDepartmonitorprelainfoId castOther = (TMoDepartmonitorprelainfoId) other;

		return ((this.getTMoMonitorpinfo() == castOther.getTMoMonitorpinfo()) || (this
				.getTMoMonitorpinfo() != null
				&& castOther.getTMoMonitorpinfo() != null && this
				.getTMoMonitorpinfo().equals(castOther.getTMoMonitorpinfo())))
				&& ((this.getTMoDepartbaseinfo() == castOther
						.getTMoDepartbaseinfo()) || (this
						.getTMoDepartbaseinfo() != null
						&& castOther.getTMoDepartbaseinfo() != null && this
						.getTMoDepartbaseinfo().equals(
								castOther.getTMoDepartbaseinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTMoMonitorpinfo() == null ? 0 : this.getTMoMonitorpinfo()
						.hashCode());
		result = 37
				* result
				+ (getTMoDepartbaseinfo() == null ? 0 : this
						.getTMoDepartbaseinfo().hashCode());
		return result;
	}

}