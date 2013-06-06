package com.serviceDesk.common.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * TMoMonitorpinfo entity. @author MyEclipse Persistence Tools
 */

public class TMoMonitorpinfo implements java.io.Serializable {

	// Fields

	private String FMonitorpid;
	private String FMonitorpname;
	private BigDecimal FMonitorcolumn;
	private String FMonitorplevel;
	private String FParentmonitorpid;
	private String FMonitorpsitua;
	private String FMonitorpcontent;
	private String FMonitorpdesc;
	private Timestamp FCreatetime;
	private String FCreateuser;
	private Set TAlAlertinfos = new HashSet(0);
	private Set TMoMonitoraprelainfos = new HashSet(0);
	private Set TEpEnergyitemprices = new HashSet(0);
	private Set TOvMeterorigvalues = new HashSet(0);
	private Set TEcEnergyitemresults = new HashSet(0);
	private Set meterorivalues = new HashSet(0);
	private Set TStMeteruseinfos = new HashSet(0);
	private Set TPqPowerqltyresults = new HashSet(0);
	private Set TEnEnvironitemresults = new HashSet(0);
	private Set TMoDepartmonitorprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoMonitorpinfo() {
	}

	/** minimal constructor */
	public TMoMonitorpinfo(String FMonitorpname) {
		this.FMonitorpname = FMonitorpname;
	}

	/** full constructor */
	public TMoMonitorpinfo(String FMonitorpname, BigDecimal FMonitorcolumn,
			String FMonitorplevel, String FParentmonitorpid,
			String FMonitorpsitua, String FMonitorpcontent,
			String FMonitorpdesc, Timestamp FCreatetime, String FCreateuser,
			Set TAlAlertinfos, Set TMoMonitoraprelainfos,
			Set TEpEnergyitemprices, Set TOvMeterorigvalues,
			Set TEcEnergyitemresults, Set meterorivalues, Set TStMeteruseinfos,
			Set TPqPowerqltyresults, Set TEnEnvironitemresults,
			Set TMoDepartmonitorprelainfos) {
		this.FMonitorpname = FMonitorpname;
		this.FMonitorcolumn = FMonitorcolumn;
		this.FMonitorplevel = FMonitorplevel;
		this.FParentmonitorpid = FParentmonitorpid;
		this.FMonitorpsitua = FMonitorpsitua;
		this.FMonitorpcontent = FMonitorpcontent;
		this.FMonitorpdesc = FMonitorpdesc;
		this.FCreatetime = FCreatetime;
		this.FCreateuser = FCreateuser;
		this.TAlAlertinfos = TAlAlertinfos;
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
		this.TEpEnergyitemprices = TEpEnergyitemprices;
		this.TOvMeterorigvalues = TOvMeterorigvalues;
		this.TEcEnergyitemresults = TEcEnergyitemresults;
		this.meterorivalues = meterorivalues;
		this.TStMeteruseinfos = TStMeteruseinfos;
		this.TPqPowerqltyresults = TPqPowerqltyresults;
		this.TEnEnvironitemresults = TEnEnvironitemresults;
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
	}

	// Property accessors

	public String getFMonitorpid() {
		return this.FMonitorpid;
	}

	public void setFMonitorpid(String FMonitorpid) {
		this.FMonitorpid = FMonitorpid;
	}

	public String getFMonitorpname() {
		return this.FMonitorpname;
	}

	public void setFMonitorpname(String FMonitorpname) {
		this.FMonitorpname = FMonitorpname;
	}

	public BigDecimal getFMonitorcolumn() {
		return this.FMonitorcolumn;
	}

	public void setFMonitorcolumn(BigDecimal FMonitorcolumn) {
		this.FMonitorcolumn = FMonitorcolumn;
	}

	public String getFMonitorplevel() {
		return this.FMonitorplevel;
	}

	public void setFMonitorplevel(String FMonitorplevel) {
		this.FMonitorplevel = FMonitorplevel;
	}

	public String getFParentmonitorpid() {
		return this.FParentmonitorpid;
	}

	public void setFParentmonitorpid(String FParentmonitorpid) {
		this.FParentmonitorpid = FParentmonitorpid;
	}

	public String getFMonitorpsitua() {
		return this.FMonitorpsitua;
	}

	public void setFMonitorpsitua(String FMonitorpsitua) {
		this.FMonitorpsitua = FMonitorpsitua;
	}

	public String getFMonitorpcontent() {
		return this.FMonitorpcontent;
	}

	public void setFMonitorpcontent(String FMonitorpcontent) {
		this.FMonitorpcontent = FMonitorpcontent;
	}

	public String getFMonitorpdesc() {
		return this.FMonitorpdesc;
	}

	public void setFMonitorpdesc(String FMonitorpdesc) {
		this.FMonitorpdesc = FMonitorpdesc;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public String getFCreateuser() {
		return this.FCreateuser;
	}

	public void setFCreateuser(String FCreateuser) {
		this.FCreateuser = FCreateuser;
	}

	public Set getTAlAlertinfos() {
		return this.TAlAlertinfos;
	}

	public void setTAlAlertinfos(Set TAlAlertinfos) {
		this.TAlAlertinfos = TAlAlertinfos;
	}

	public Set getTMoMonitoraprelainfos() {
		return this.TMoMonitoraprelainfos;
	}

	public void setTMoMonitoraprelainfos(Set TMoMonitoraprelainfos) {
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
	}

	public Set getTEpEnergyitemprices() {
		return this.TEpEnergyitemprices;
	}

	public void setTEpEnergyitemprices(Set TEpEnergyitemprices) {
		this.TEpEnergyitemprices = TEpEnergyitemprices;
	}

	public Set getTOvMeterorigvalues() {
		return this.TOvMeterorigvalues;
	}

	public void setTOvMeterorigvalues(Set TOvMeterorigvalues) {
		this.TOvMeterorigvalues = TOvMeterorigvalues;
	}

	public Set getTEcEnergyitemresults() {
		return this.TEcEnergyitemresults;
	}

	public void setTEcEnergyitemresults(Set TEcEnergyitemresults) {
		this.TEcEnergyitemresults = TEcEnergyitemresults;
	}

	public Set getMeterorivalues() {
		return this.meterorivalues;
	}

	public void setMeterorivalues(Set meterorivalues) {
		this.meterorivalues = meterorivalues;
	}

	public Set getTStMeteruseinfos() {
		return this.TStMeteruseinfos;
	}

	public void setTStMeteruseinfos(Set TStMeteruseinfos) {
		this.TStMeteruseinfos = TStMeteruseinfos;
	}

	public Set getTPqPowerqltyresults() {
		return this.TPqPowerqltyresults;
	}

	public void setTPqPowerqltyresults(Set TPqPowerqltyresults) {
		this.TPqPowerqltyresults = TPqPowerqltyresults;
	}

	public Set getTEnEnvironitemresults() {
		return this.TEnEnvironitemresults;
	}

	public void setTEnEnvironitemresults(Set TEnEnvironitemresults) {
		this.TEnEnvironitemresults = TEnEnvironitemresults;
	}

	public Set getTMoDepartmonitorprelainfos() {
		return this.TMoDepartmonitorprelainfos;
	}

	public void setTMoDepartmonitorprelainfos(Set TMoDepartmonitorprelainfos) {
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
	}

}