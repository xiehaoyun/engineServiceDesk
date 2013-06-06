package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TDtPowerqltyitemdict entity. @author MyEclipse Persistence Tools
 */

public class TDtPowerqltyitemdict implements java.io.Serializable {

	// Fields

	private String FPowerqltyitemcode;
	private String FPowerqltyitemname;
	private String FParentitemcode;
	private String FPowerqltyitemtype;
	private String FPowerqltyitemunit;
	private BigDecimal FState;
	private Set TPqPowerqltyresults = new HashSet(0);
	private Set TPqParampqitemrelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TDtPowerqltyitemdict() {
	}

	/** minimal constructor */
	public TDtPowerqltyitemdict(String FPowerqltyitemname,
			String FPowerqltyitemtype, String FPowerqltyitemunit,
			BigDecimal FState) {
		this.FPowerqltyitemname = FPowerqltyitemname;
		this.FPowerqltyitemtype = FPowerqltyitemtype;
		this.FPowerqltyitemunit = FPowerqltyitemunit;
		this.FState = FState;
	}

	/** full constructor */
	public TDtPowerqltyitemdict(String FPowerqltyitemname,
			String FParentitemcode, String FPowerqltyitemtype,
			String FPowerqltyitemunit, BigDecimal FState,
			Set TPqPowerqltyresults, Set TPqParampqitemrelainfos) {
		this.FPowerqltyitemname = FPowerqltyitemname;
		this.FParentitemcode = FParentitemcode;
		this.FPowerqltyitemtype = FPowerqltyitemtype;
		this.FPowerqltyitemunit = FPowerqltyitemunit;
		this.FState = FState;
		this.TPqPowerqltyresults = TPqPowerqltyresults;
		this.TPqParampqitemrelainfos = TPqParampqitemrelainfos;
	}

	// Property accessors

	public String getFPowerqltyitemcode() {
		return this.FPowerqltyitemcode;
	}

	public void setFPowerqltyitemcode(String FPowerqltyitemcode) {
		this.FPowerqltyitemcode = FPowerqltyitemcode;
	}

	public String getFPowerqltyitemname() {
		return this.FPowerqltyitemname;
	}

	public void setFPowerqltyitemname(String FPowerqltyitemname) {
		this.FPowerqltyitemname = FPowerqltyitemname;
	}

	public String getFParentitemcode() {
		return this.FParentitemcode;
	}

	public void setFParentitemcode(String FParentitemcode) {
		this.FParentitemcode = FParentitemcode;
	}

	public String getFPowerqltyitemtype() {
		return this.FPowerqltyitemtype;
	}

	public void setFPowerqltyitemtype(String FPowerqltyitemtype) {
		this.FPowerqltyitemtype = FPowerqltyitemtype;
	}

	public String getFPowerqltyitemunit() {
		return this.FPowerqltyitemunit;
	}

	public void setFPowerqltyitemunit(String FPowerqltyitemunit) {
		this.FPowerqltyitemunit = FPowerqltyitemunit;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Set getTPqPowerqltyresults() {
		return this.TPqPowerqltyresults;
	}

	public void setTPqPowerqltyresults(Set TPqPowerqltyresults) {
		this.TPqPowerqltyresults = TPqPowerqltyresults;
	}

	public Set getTPqParampqitemrelainfos() {
		return this.TPqParampqitemrelainfos;
	}

	public void setTPqParampqitemrelainfos(Set TPqParampqitemrelainfos) {
		this.TPqParampqitemrelainfos = TPqParampqitemrelainfos;
	}

}