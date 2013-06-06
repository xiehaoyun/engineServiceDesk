package com.serviceDesk.common.domain;

/**
 * TBdBuildgrouprelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildgrouprelainfoId implements java.io.Serializable {

	// Fields

	private TBdBuildgroupbaseinfo TBdBuildgroupbaseinfo;
	private TBdBuildbaseinfo TBdBuildbaseinfo;

	// Constructors

	/** default constructor */
	public TBdBuildgrouprelainfoId() {
	}

	/** full constructor */
	public TBdBuildgrouprelainfoId(TBdBuildgroupbaseinfo TBdBuildgroupbaseinfo,
			TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildgroupbaseinfo = TBdBuildgroupbaseinfo;
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	// Property accessors

	public TBdBuildgroupbaseinfo getTBdBuildgroupbaseinfo() {
		return this.TBdBuildgroupbaseinfo;
	}

	public void setTBdBuildgroupbaseinfo(
			TBdBuildgroupbaseinfo TBdBuildgroupbaseinfo) {
		this.TBdBuildgroupbaseinfo = TBdBuildgroupbaseinfo;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TBdBuildgrouprelainfoId))
			return false;
		TBdBuildgrouprelainfoId castOther = (TBdBuildgrouprelainfoId) other;

		return ((this.getTBdBuildgroupbaseinfo() == castOther
				.getTBdBuildgroupbaseinfo()) || (this
				.getTBdBuildgroupbaseinfo() != null
				&& castOther.getTBdBuildgroupbaseinfo() != null && this
				.getTBdBuildgroupbaseinfo().equals(
						castOther.getTBdBuildgroupbaseinfo())))
				&& ((this.getTBdBuildbaseinfo() == castOther
						.getTBdBuildbaseinfo()) || (this.getTBdBuildbaseinfo() != null
						&& castOther.getTBdBuildbaseinfo() != null && this
						.getTBdBuildbaseinfo().equals(
								castOther.getTBdBuildbaseinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTBdBuildgroupbaseinfo() == null ? 0 : this
						.getTBdBuildgroupbaseinfo().hashCode());
		result = 37
				* result
				+ (getTBdBuildbaseinfo() == null ? 0 : this
						.getTBdBuildbaseinfo().hashCode());
		return result;
	}

}