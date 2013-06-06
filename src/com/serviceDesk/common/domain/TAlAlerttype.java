package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TAlAlerttype entity. @author MyEclipse Persistence Tools
 */

public class TAlAlerttype implements java.io.Serializable {

	// Fields

	private BigDecimal FAlerttypeid;
	private String FAlerttypename;
	private String FAlerttypedesc;
	private Set TEvAlerttypeconrelainfos = new HashSet(0);
	private Set TAlAlertinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TAlAlerttype() {
	}

	/** full constructor */
	public TAlAlerttype(String FAlerttypename, String FAlerttypedesc,
			Set TEvAlerttypeconrelainfos, Set TAlAlertinfos) {
		this.FAlerttypename = FAlerttypename;
		this.FAlerttypedesc = FAlerttypedesc;
		this.TEvAlerttypeconrelainfos = TEvAlerttypeconrelainfos;
		this.TAlAlertinfos = TAlAlertinfos;
	}

	// Property accessors

	public BigDecimal getFAlerttypeid() {
		return this.FAlerttypeid;
	}

	public void setFAlerttypeid(BigDecimal FAlerttypeid) {
		this.FAlerttypeid = FAlerttypeid;
	}

	public String getFAlerttypename() {
		return this.FAlerttypename;
	}

	public void setFAlerttypename(String FAlerttypename) {
		this.FAlerttypename = FAlerttypename;
	}

	public String getFAlerttypedesc() {
		return this.FAlerttypedesc;
	}

	public void setFAlerttypedesc(String FAlerttypedesc) {
		this.FAlerttypedesc = FAlerttypedesc;
	}

	public Set getTEvAlerttypeconrelainfos() {
		return this.TEvAlerttypeconrelainfos;
	}

	public void setTEvAlerttypeconrelainfos(Set TEvAlerttypeconrelainfos) {
		this.TEvAlerttypeconrelainfos = TEvAlerttypeconrelainfos;
	}

	public Set getTAlAlertinfos() {
		return this.TAlAlertinfos;
	}

	public void setTAlAlertinfos(Set TAlAlertinfos) {
		this.TAlAlertinfos = TAlAlertinfos;
	}

}