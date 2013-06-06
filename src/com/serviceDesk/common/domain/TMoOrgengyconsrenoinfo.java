package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * TMoOrgengyconsrenoinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoOrgengyconsrenoinfo implements java.io.Serializable {

	// Fields

	private String FOrgcode;
	private TMoOrgbaseinfo TMoOrgbaseinfo;
	private Timestamp FRenodate;
	private String FRenodept;
	private String FRenodesc;

	// Constructors

	/** default constructor */
	public TMoOrgengyconsrenoinfo() {
	}

	/** minimal constructor */
	public TMoOrgengyconsrenoinfo(TMoOrgbaseinfo TMoOrgbaseinfo,
			Timestamp FRenodate, String FRenodept) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.FRenodate = FRenodate;
		this.FRenodept = FRenodept;
	}

	/** full constructor */
	public TMoOrgengyconsrenoinfo(TMoOrgbaseinfo TMoOrgbaseinfo,
			Timestamp FRenodate, String FRenodept, String FRenodesc) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
		this.FRenodate = FRenodate;
		this.FRenodept = FRenodept;
		this.FRenodesc = FRenodesc;
	}

	// Property accessors

	public String getFOrgcode() {
		return this.FOrgcode;
	}

	public void setFOrgcode(String FOrgcode) {
		this.FOrgcode = FOrgcode;
	}

	public TMoOrgbaseinfo getTMoOrgbaseinfo() {
		return this.TMoOrgbaseinfo;
	}

	public void setTMoOrgbaseinfo(TMoOrgbaseinfo TMoOrgbaseinfo) {
		this.TMoOrgbaseinfo = TMoOrgbaseinfo;
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