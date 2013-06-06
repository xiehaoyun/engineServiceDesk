package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TBdBuildengyconsrenoinfo entity. @author MyEclipse Persistence Tools
 */

public class TBdBuildengyconsrenoinfo implements java.io.Serializable {

	// Fields

	private String FBuildid;
	private TBdBuildbaseinfo TBdBuildbaseinfo;
	private Timestamp FRenodate;
	private String FRenodept;
	private String FRenodesc;

	// Constructors

	/** default constructor */
	public TBdBuildengyconsrenoinfo() {
	}

	/** minimal constructor */
	public TBdBuildengyconsrenoinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			Timestamp FRenodate, String FRenodept) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FRenodate = FRenodate;
		this.FRenodept = FRenodept;
	}

	/** full constructor */
	public TBdBuildengyconsrenoinfo(TBdBuildbaseinfo TBdBuildbaseinfo,
			Timestamp FRenodate, String FRenodept, String FRenodesc) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
		this.FRenodate = FRenodate;
		this.FRenodept = FRenodept;
		this.FRenodesc = FRenodesc;
	}

	// Property accessors

	public String getFBuildid() {
		return this.FBuildid;
	}

	public void setFBuildid(String FBuildid) {
		this.FBuildid = FBuildid;
	}

	public TBdBuildbaseinfo getTBdBuildbaseinfo() {
		return this.TBdBuildbaseinfo;
	}

	public void setTBdBuildbaseinfo(TBdBuildbaseinfo TBdBuildbaseinfo) {
		this.TBdBuildbaseinfo = TBdBuildbaseinfo;
	}

	public Timestamp getFRenodate() {
		return this.FRenodate;
	}

	public void setFRenodate(Timestamp FRenodate) {
		this.FRenodate = FRenodate;
	}

	public String getFRenodept() {
		return this.FRenodept;
	}

	public void setFRenodept(String FRenodept) {
		this.FRenodept = FRenodept;
	}

	public String getFRenodesc() {
		return this.FRenodesc;
	}

	public void setFRenodesc(String FRenodesc) {
		this.FRenodesc = FRenodesc;
	}

}