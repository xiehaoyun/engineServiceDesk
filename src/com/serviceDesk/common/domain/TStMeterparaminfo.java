package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TStMeterparaminfo entity. @author MyEclipse Persistence Tools
 */

public class TStMeterparaminfo implements java.io.Serializable {

	// Fields

	private String FMeterparamid;
	private TStMeterprodinfo TStMeterprodinfo;
	private String FMeterparamname;
	private Double FChangerate;
	private String FValuetype;
	private BigDecimal FState;
	private Set TPqParampqitemrelainfos = new HashSet(0);
	private Set TEcParamecitemrelainfos = new HashSet(0);
	private Set TOvMeterorigvalues = new HashSet(0);
	private Set meterorivalues = new HashSet(0);

	// Constructors

	/** default constructor */
	public TStMeterparaminfo() {
	}

	/** minimal constructor */
	public TStMeterparaminfo(TStMeterprodinfo TStMeterprodinfo,
			String FMeterparamname, Double FChangerate, String FValuetype,
			BigDecimal FState) {
		this.TStMeterprodinfo = TStMeterprodinfo;
		this.FMeterparamname = FMeterparamname;
		this.FChangerate = FChangerate;
		this.FValuetype = FValuetype;
		this.FState = FState;
	}

	/** full constructor */
	public TStMeterparaminfo(TStMeterprodinfo TStMeterprodinfo,
			String FMeterparamname, Double FChangerate, String FValuetype,
			BigDecimal FState, Set TPqParampqitemrelainfos,
			Set TEcParamecitemrelainfos, Set TOvMeterorigvalues,
			Set meterorivalues) {
		this.TStMeterprodinfo = TStMeterprodinfo;
		this.FMeterparamname = FMeterparamname;
		this.FChangerate = FChangerate;
		this.FValuetype = FValuetype;
		this.FState = FState;
		this.TPqParampqitemrelainfos = TPqParampqitemrelainfos;
		this.TEcParamecitemrelainfos = TEcParamecitemrelainfos;
		this.TOvMeterorigvalues = TOvMeterorigvalues;
		this.meterorivalues = meterorivalues;
	}

	// Property accessors

	public String getFMeterparamid() {
		return this.FMeterparamid;
	}

	public void setFMeterparamid(String FMeterparamid) {
		this.FMeterparamid = FMeterparamid;
	}

	public TStMeterprodinfo getTStMeterprodinfo() {
		return this.TStMeterprodinfo;
	}

	public void setTStMeterprodinfo(TStMeterprodinfo TStMeterprodinfo) {
		this.TStMeterprodinfo = TStMeterprodinfo;
	}

	public String getFMeterparamname() {
		return this.FMeterparamname;
	}

	public void setFMeterparamname(String FMeterparamname) {
		this.FMeterparamname = FMeterparamname;
	}

	public Double getFChangerate() {
		return this.FChangerate;
	}

	public void setFChangerate(Double FChangerate) {
		this.FChangerate = FChangerate;
	}

	public String getFValuetype() {
		return this.FValuetype;
	}

	public void setFValuetype(String FValuetype) {
		this.FValuetype = FValuetype;
	}

	public BigDecimal getFState() {
		return this.FState;
	}

	public void setFState(BigDecimal FState) {
		this.FState = FState;
	}

	public Set getTPqParampqitemrelainfos() {
		return this.TPqParampqitemrelainfos;
	}

	public void setTPqParampqitemrelainfos(Set TPqParampqitemrelainfos) {
		this.TPqParampqitemrelainfos = TPqParampqitemrelainfos;
	}

	public Set getTEcParamecitemrelainfos() {
		return this.TEcParamecitemrelainfos;
	}

	public void setTEcParamecitemrelainfos(Set TEcParamecitemrelainfos) {
		this.TEcParamecitemrelainfos = TEcParamecitemrelainfos;
	}

	public Set getTOvMeterorigvalues() {
		return this.TOvMeterorigvalues;
	}

	public void setTOvMeterorigvalues(Set TOvMeterorigvalues) {
		this.TOvMeterorigvalues = TOvMeterorigvalues;
	}

	public Set getMeterorivalues() {
		return this.meterorivalues;
	}

	public void setMeterorivalues(Set meterorivalues) {
		this.meterorivalues = meterorivalues;
	}

}