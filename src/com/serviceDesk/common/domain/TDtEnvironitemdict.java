package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TDtEnvironitemdict entity. @author MyEclipse Persistence Tools
 */

public class TDtEnvironitemdict implements java.io.Serializable {

	// Fields

	private String FEnvironitemcode;
	private String FEnvironitemname;
	private String FParentitemcode;
	private String FEnvironitemtype;
	private String FEnvironitemunit;
	private BigDecimal FState;
	private Set TEnEnvironitemresults = new HashSet(0);

	// Constructors

	/** default constructor */
	public TDtEnvironitemdict() {
	}

	/** minimal constructor */
	public TDtEnvironitemdict(String FEnvironitemname, String FEnvironitemtype,
			String FEnvironitemunit, BigDecimal FState) {
		this.FEnvironitemname = FEnvironitemname;
		this.FEnvironitemtype = FEnvironitemtype;
		this.FEnvironitemunit = FEnvironitemunit;
		this.FState = FState;
	}

	/** full constructor */
	public TDtEnvironitemdict(String FEnvironitemname, String FParentitemcode,
			String FEnvironitemtype, String FEnvironitemunit,
			BigDecimal FState, Set TEnEnvironitemresults) {
		this.FEnvironitemname = FEnvironitemname;
		this.FParentitemcode = FParentitemcode;
		this.FEnvironitemtype = FEnvironitemtype;
		this.FEnvironitemunit = FEnvironitemunit;
		this.FState = FState;
		this.TEnEnvironitemresults = TEnEnvironitemresults;
	}

	// Property accessors

	public String getFEnvironitemcode() {
		return this.FEnvironitemcode;
	}

	public void setFEnvironitemcode(String FEnvironitemcode) {
		this.FEnvironitemcode = FEnvironitemcode;
	}

	public String getFEnvironitemname() {
		return this.FEnvironitemname;
	}

	public void setFEnvironitemname(String FEnvironitemname) {
		this.FEnvironitemname = FEnvironitemname;
	}

	public String getFParentitemcode() {
		return this.FParentitemcode;
	}

	public void setFParentitemcode(String FParentitemcode) {
		this.FParentitemcode = FParentitemcode;
	}

	public String getFEnvironitemtype() {
		return this.FEnvironitemtype;
	}

	public void setFEnvironitemtype(String FEnvironitemtype) {
		this.FEnvironitemtype = FEnvironitemtype;
	}

	public String getFEnvironitemunit() {
		return this.FEnvironitemunit;
	}

	public void setFEnvironitemunit(String FEnvironitemunit) {
		this.FEnvironitemunit = FEnvironitemunit;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Set getTEnEnvironitemresults() {
		return this.TEnEnvironitemresults;
	}

	public void setTEnEnvironitemresults(Set TEnEnvironitemresults) {
		this.TEnEnvironitemresults = TEnEnvironitemresults;
	}

}