package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TDcDatacenterbaseinfo entity. @author MyEclipse Persistence Tools
 */

public class TDcDatacenterbaseinfo implements java.io.Serializable {

	// Fields

	private String FDatacenterid;
	private String FDatacentername;
	private BigDecimal FDatacentertype;
	private BigDecimal FDatacentermanager;
	private String FDatacenterdesc;
	private String FDatacentercontact;
	private String FDatacentertel;
	private Set TMoOrgbaseinfos = new HashSet(0);
	private Set TBdBuildbaseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TDcDatacenterbaseinfo() {
	}

	/** minimal constructor */
	public TDcDatacenterbaseinfo(String FDatacentername,
			BigDecimal FDatacentertype) {
		this.FDatacentername = FDatacentername;
		this.FDatacentertype = FDatacentertype;
	}

	/** full constructor */
	public TDcDatacenterbaseinfo(String FDatacentername,
			BigDecimal FDatacentertype, BigDecimal FDatacentermanager,
			String FDatacenterdesc, String FDatacentercontact,
			String FDatacentertel, Set TMoOrgbaseinfos, Set TBdBuildbaseinfos) {
		this.FDatacentername = FDatacentername;
		this.FDatacentertype = FDatacentertype;
		this.FDatacentermanager = FDatacentermanager;
		this.FDatacenterdesc = FDatacenterdesc;
		this.FDatacentercontact = FDatacentercontact;
		this.FDatacentertel = FDatacentertel;
		this.TMoOrgbaseinfos = TMoOrgbaseinfos;
		this.TBdBuildbaseinfos = TBdBuildbaseinfos;
	}

	// Property accessors

	public String getFDatacenterid() {
		return this.FDatacenterid;
	}

	public void setFDatacenterid(String FDatacenterid) {
		this.FDatacenterid = FDatacenterid;
	}

	public String getFDatacentername() {
		return this.FDatacentername;
	}

	public void setFDatacentername(String FDatacentername) {
		this.FDatacentername = FDatacentername;
	}

	public BigDecimal getFDatacentertype() {
		return this.FDatacentertype;
	}

	public void setFDatacentertype(BigDecimal FDatacentertype) {
		this.FDatacentertype = FDatacentertype;
	}

	public BigDecimal getFDatacentermanager() {
		return this.FDatacentermanager;
	}

	public void setFDatacentermanager(BigDecimal FDatacentermanager) {
		this.FDatacentermanager = FDatacentermanager;
	}

	public String getFDatacenterdesc() {
		return this.FDatacenterdesc;
	}

	public void setFDatacenterdesc(String FDatacenterdesc) {
		this.FDatacenterdesc = FDatacenterdesc;
	}

	public String getFDatacentercontact() {
		return this.FDatacentercontact;
	}

	public void setFDatacentercontact(String FDatacentercontact) {
		this.FDatacentercontact = FDatacentercontact;
	}

	public String getFDatacentertel() {
		return this.FDatacentertel;
	}

	public void setFDatacentertel(String FDatacentertel) {
		this.FDatacentertel = FDatacentertel;
	}

	public Set getTMoOrgbaseinfos() {
		return this.TMoOrgbaseinfos;
	}

	public void setTMoOrgbaseinfos(Set TMoOrgbaseinfos) {
		this.TMoOrgbaseinfos = TMoOrgbaseinfos;
	}

	public Set getTBdBuildbaseinfos() {
		return this.TBdBuildbaseinfos;
	}

	public void setTBdBuildbaseinfos(Set TBdBuildbaseinfos) {
		this.TBdBuildbaseinfos = TBdBuildbaseinfos;
	}

}