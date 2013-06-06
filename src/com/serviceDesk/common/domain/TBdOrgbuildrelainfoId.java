package com.serviceDesk.common.domain;

/**
 * TBdOrgbuildrelainfoId entity. @author MyEclipse Persistence Tools
 */

public class TBdOrgbuildrelainfoId implements java.io.Serializable {

	// Fields

	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private TMoOrgbaseinfo TMoOrgbaseinfo;

	// Constructors

	/** default constructor */
	public TBdOrgbuildrelainfoId() {
	}

	/** full constructor */
	public TBdOrgbuildrelainfoId(TBdBuildbaseinfo TBdBuildbaseinfo,
			TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
	}

	// Property accessors

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public TMoOrgbaseinfo getTMoOrgbaseinfo() {
		return this.TMoOrgbaseinfo;
	}

	public void setTMoOrgbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TBdOrgbuildrelainfoId))
			return false;
		TBdOrgbuildrelainfoId castOther = (TBdOrgbuildrelainfoId) other;

		return ((this.getTBdBuildbaseinfo() == castOther.getTBdBuildbaseinfo()) || (this
				.getTBdBuildbaseinfo() != null
				&& castOther.getTBdBuildbaseinfo() != null && this
				.getTBdBuildbaseinfo().equals(castOther.getTBdBuildbaseinfo())))
				&& ((this.getTMoOrgbaseinfo() == castOther.getTMoOrgbaseinfo()) || (this
						.getTMoOrgbaseinfo() != null
						&& castOther.getTMoOrgbaseinfo() != null && this
						.getTMoOrgbaseinfo().equals(
								castOther.getTMoOrgbaseinfo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTBdBuildbaseinfo() == null ? 0 : this
						.getTBdBuildbaseinfo().hashCode());
		result = 37
				* result
				+ (getTMoOrgbaseinfo() == null ? 0 : this.getTMoOrgbaseinfo()
						.hashCode());
		return result;
	}

}