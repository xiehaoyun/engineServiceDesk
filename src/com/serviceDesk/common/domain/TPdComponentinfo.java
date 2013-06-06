package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TPdComponentinfo entity. @author MyEclipse Persistence Tools
 */

public class TPdComponentinfo implements java.io.Serializable {

	// Fields

	private BigDecimal FCompid;
	private String FCompname;
	private String FCompbrand;
	private String FCompmodel;
	private String FCompproducer;
	private String FCompdesc;
	private Set TPdCompexinfos = new HashSet(0);
	private Set TPdCompuseinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TPdComponentinfo() {
	}

	/** full constructor */
	public TPdComponentinfo(String FCompname, String FCompbrand,
			String FCompmodel, String FCompproducer, String FCompdesc,
			Set TPdCompexinfos, Set TPdCompuseinfos) {
		this.FCompname = FCompname;
		this.FCompbrand = FCompbrand;
		this.FCompmodel = FCompmodel;
		this.FCompproducer = FCompproducer;
		this.FCompdesc = FCompdesc;
		this.TPdCompexinfos = TPdCompexinfos;
		this.TPdCompuseinfos = TPdCompuseinfos;
	}

	// Property accessors

	public BigDecimal getFCompid() {
		return this.FCompid;
	}

	public void setFCompid(BigDecimal FCompid) {
		this.FCompid = FCompid;
	}

	public String getFCompname() {
		return this.FCompname;
	}

	public void setFCompname(String FCompname) {
		this.FCompname = FCompname;
	}

	public String getFCompbrand() {
		return this.FCompbrand;
	}

	public void setFCompbrand(String FCompbrand) {
		this.FCompbrand = FCompbrand;
	}

	public String getFCompmodel() {
		return this.FCompmodel;
	}

	public void setFCompmodel(String FCompmodel) {
		this.FCompmodel = FCompmodel;
	}

	public String getFCompproducer() {
		return this.FCompproducer;
	}

	public void setFCompproducer(String FCompproducer) {
		this.FCompproducer = FCompproducer;
	}

	public String getFCompdesc() {
		return this.FCompdesc;
	}

	public void setFCompdesc(String FCompdesc) {
		this.FCompdesc = FCompdesc;
	}

	public Set getTPdCompexinfos() {
		return this.TPdCompexinfos;
	}

	public void setTPdCompexinfos(Set TPdCompexinfos) {
		this.TPdCompexinfos = TPdCompexinfos;
	}

	public Set getTPdCompuseinfos() {
		return this.TPdCompuseinfos;
	}

	public void setTPdCompuseinfos(Set TPdCompuseinfos) {
		this.TPdCompuseinfos = TPdCompuseinfos;
	}

}