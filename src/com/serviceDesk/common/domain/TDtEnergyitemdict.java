package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TDtEnergyitemdict entity. @author MyEclipse Persistence Tools
 */

public class TDtEnergyitemdict implements java.io.Serializable {

	// Fields

	private String FEnergyitemcode;
	private String FEnergyitemname;
	private String FParentitemcode;
	private String FEnergyitemtype;
	private String FEnergyitemunit;
	private String FEnergyitemfml;
	private BigDecimal FEnergyitemstate;
	private Set TEcEnergyitemresults = new HashSet(0);
	private Set TEpEnergyitemprices = new HashSet(0);
	private Set TEcMeterecitemrelainfos = new HashSet(0);
	private Set TEcParamecitemrelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TDtEnergyitemdict() {
	}

	/** minimal constructor */
	public TDtEnergyitemdict(String FEnergyitemname, String FEnergyitemtype,
			String FEnergyitemunit, String FEnergyitemfml,
			BigDecimal FEnergyitemstate) {
		this.FEnergyitemname = FEnergyitemname;
		this.FEnergyitemtype = FEnergyitemtype;
		this.FEnergyitemunit = FEnergyitemunit;
		this.FEnergyitemfml = FEnergyitemfml;
		this.FEnergyitemstate = FEnergyitemstate;
	}

	/** full constructor */
	public TDtEnergyitemdict(String FEnergyitemname, String FParentitemcode,
			String FEnergyitemtype, String FEnergyitemunit,
			String FEnergyitemfml, BigDecimal FEnergyitemstate,
			Set TEcEnergyitemresults, Set TEpEnergyitemprices,
			Set TEcMeterecitemrelainfos, Set TEcParamecitemrelainfos) {
		this.FEnergyitemname = FEnergyitemname;
		this.FParentitemcode = FParentitemcode;
		this.FEnergyitemtype = FEnergyitemtype;
		this.FEnergyitemunit = FEnergyitemunit;
		this.FEnergyitemfml = FEnergyitemfml;
		this.FEnergyitemstate = FEnergyitemstate;
		this.TEcEnergyitemresults = TEcEnergyitemresults;
		this.TEpEnergyitemprices = TEpEnergyitemprices;
		this.TEcMeterecitemrelainfos = TEcMeterecitemrelainfos;
		this.TEcParamecitemrelainfos = TEcParamecitemrelainfos;
	}

	// Property accessors

	public String getFEnergyitemcode() {
		return this.FEnergyitemcode;
	}

	public void setFEnergyitemcode(String FEnergyitemcode) {
		this.FEnergyitemcode = FEnergyitemcode;
	}

	public String getFEnergyitemname() {
		return this.FEnergyitemname;
	}

	public void setFEnergyitemname(String FEnergyitemname) {
		this.FEnergyitemname = FEnergyitemname;
	}

	public String getFParentitemcode() {
		return this.FParentitemcode;
	}

	public void setFParentitemcode(String FParentitemcode) {
		this.FParentitemcode = FParentitemcode;
	}

	public String getFEnergyitemtype() {
		return this.FEnergyitemtype;
	}

	public void setFEnergyitemtype(String FEnergyitemtype) {
		this.FEnergyitemtype = FEnergyitemtype;
	}

	public String getFEnergyitemunit() {
		return this.FEnergyitemunit;
	}

	public void setFEnergyitemunit(String FEnergyitemunit) {
		this.FEnergyitemunit = FEnergyitemunit;
	}

	public String getFEnergyitemfml() {
		return this.FEnergyitemfml;
	}

	public void setFEnergyitemfml(String FEnergyitemfml) {
		this.FEnergyitemfml = FEnergyitemfml;
	}

	public BigDecimal getFEnergyitemstate() {
		return this.FEnergyitemstate;
	}

	public void setFEnergyitemstate(BigDecimal FEnergyitemstate) {
		this.FEnergyitemstate = FEnergyitemstate;
	}

	public Set getTEcEnergyitemresults() {
		return this.TEcEnergyitemresults;
	}

	public void setTEcEnergyitemresults(Set TEcEnergyitemresults) {
		this.TEcEnergyitemresults = TEcEnergyitemresults;
	}

	public Set getTEpEnergyitemprices() {
		return this.TEpEnergyitemprices;
	}

	public void setTEpEnergyitemprices(Set TEpEnergyitemprices) {
		this.TEpEnergyitemprices = TEpEnergyitemprices;
	}

	public Set getTEcMeterecitemrelainfos() {
		return this.TEcMeterecitemrelainfos;
	}

	public void setTEcMeterecitemrelainfos(Set TEcMeterecitemrelainfos) {
		this.TEcMeterecitemrelainfos = TEcMeterecitemrelainfos;
	}

	public Set getTEcParamecitemrelainfos() {
		return this.TEcParamecitemrelainfos;
	}

	public void setTEcParamecitemrelainfos(Set TEcParamecitemrelainfos) {
		this.TEcParamecitemrelainfos = TEcParamecitemrelainfos;
	}

}