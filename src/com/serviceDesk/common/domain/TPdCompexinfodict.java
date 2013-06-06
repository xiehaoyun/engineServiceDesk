package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdCompexinfodict entity. @author MyEclipse Persistence Tools
 */

public class TPdCompexinfodict implements java.io.Serializable {

	// Fields

	private BigDecimal FCompexinfoid;
	private String FCompexinfoname;
	private String FCompexinfodatatype;
	private String FCompexinfodesc;
	private Set TPdCompexinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdCompexinfodict() {
	}

	/** full constructor */
	public TPdCompexinfodict(String FCompexinfoname,
			String FCompexinfodatatype, String FCompexinfodesc,
			Set TPdCompexinfos) {
		this.FCompexinfoname = FCompexinfoname;
		this.FCompexinfodatatype = FCompexinfodatatype;
		this.FCompexinfodesc = FCompexinfodesc;
		this.TPdCompexinfos = TPdCompexinfos;
	}

	// Property accessors

	public BigDecimal getFCompexinfoid() {
		return this.FCompexinfoid;
	}

	public void setFCompexinfoid(BigDecimal FCompexinfoid) {
		this.FCompexinfoid = FCompexinfoid;
	}

	public String getFCompexinfoname() {
		return this.FCompexinfoname;
	}

	public void setFCompexinfoname(String FCompexinfoname) {
		this.FCompexinfoname = FCompexinfoname;
	}

	public String getFCompexinfodatatype() {
		return this.FCompexinfodatatype;
	}

	public void setFCompexinfodatatype(String FCompexinfodatatype) {
		this.FCompexinfodatatype = FCompexinfodatatype;
	}

	public String getFCompexinfodesc() {
		return this.FCompexinfodesc;
	}

	public void setFCompexinfodesc(String FCompexinfodesc) {
		this.FCompexinfodesc = FCompexinfodesc;
	}

	public Set getTPdCompexinfos() {
		return this.TPdCompexinfos;
	}

	public void setTPdCompexinfos(Set TPdCompexinfos) {
		this.TPdCompexinfos = TPdCompexinfos;
	}

}