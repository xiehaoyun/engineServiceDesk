package com.serviceDesk.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TStMeterprodinfo entity. @author MyEclipse Persistence Tools
 */

public class TStMeterprodinfo implements java.io.Serializable {

	// Fields

	private String FMeterprodid;
	private String FMetername;
	private String FMetertype;
	private String FMeterproducer;
	private String FMetermodel;
	private String FMeterproddesc;
	private Set TStMeteruseinfos = new HashSet(0);
	private Set TStMeterparaminfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TStMeterprodinfo() {
	}

	/** minimal constructor */
	public TStMeterprodinfo(String FMetername, String FMetertype) {
		this.FMetername = FMetername;
		this.FMetertype = FMetertype;
	}

	/** full constructor */
	public TStMeterprodinfo(String FMetername, String FMetertype,
			String FMeterproducer, String FMetermodel, String FMeterproddesc,
			Set TStMeteruseinfos, Set TStMeterparaminfos) {
		this.FMetername = FMetername;
		this.FMetertype = FMetertype;
		this.FMeterproducer = FMeterproducer;
		this.FMetermodel = FMetermodel;
		this.FMeterproddesc = FMeterproddesc;
		this.TStMeteruseinfos = TStMeteruseinfos;
		this.TStMeterparaminfos = TStMeterparaminfos;
	}

	// Property accessors

	public String getFMeterprodid() {
		return this.FMeterprodid;
	}

	public void setFMeterprodid(String FMeterprodid) {
		this.FMeterprodid = FMeterprodid;
	}

	public String getFMetername() {
		return this.FMetername;
	}

	public void setFMetername(String FMetername) {
		this.FMetername = FMetername;
	}

	public String getFMetertype() {
		return this.FMetertype;
	}

	public void setFMetertype(String FMetertype) {
		this.FMetertype = FMetertype;
	}

	public String getFMeterproducer() {
		return this.FMeterproducer;
	}

	public void setFMeterproducer(String FMeterproducer) {
		this.FMeterproducer = FMeterproducer;
	}

	public String getFMetermodel() {
		return this.FMetermodel;
	}

	public void setFMetermodel(String FMetermodel) {
		this.FMetermodel = FMetermodel;
	}

	public String getFMeterproddesc() {
		return this.FMeterproddesc;
	}

	public void setFMeterproddesc(String FMeterproddesc) {
		this.FMeterproddesc = FMeterproddesc;
	}

	public Set getTStMeteruseinfos() {
		return this.TStMeteruseinfos;
	}

	public void setTStMeteruseinfos(Set TStMeteruseinfos) {
		this.TStMeteruseinfos = TStMeteruseinfos;
	}

	public Set getTStMeterparaminfos() {
		return this.TStMeterparaminfos;
	}

	public void setTStMeterparaminfos(Set TStMeterparaminfos) {
		this.TStMeterparaminfos = TStMeterparaminfos;
	}

}