package com.serviceDesk.common.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * TMoMapstrategy entity. @author MyEclipse Persistence Tools
 */

public class TMoMapstrategy implements java.io.Serializable {

	// Fields

	private String FStrategycode;
	private String FStrategyname;
	private String FStrategydesc;
	private Set TMoDepartmonitorprelainfos = new HashSet(0);
	private Set TMoMonitoraprelainfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public TMoMapstrategy() {
	}

	/** full constructor */
	public TMoMapstrategy(String FStrategyname, String FStrategydesc,
			Set TMoDepartmonitorprelainfos, Set TMoMonitoraprelainfos) {
		this.FStrategyname = FStrategyname;
		this.FStrategydesc = FStrategydesc;
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
	}

	// Property accessors

	public String getFStrategycode() {
		return this.FStrategycode;
	}

	public void setFStrategycode(String FStrategycode) {
		this.FStrategycode = FStrategycode;
	}

	public String getFStrategyname() {
		return this.FStrategyname;
	}

	public void setFStrategyname(String FStrategyname) {
		this.FStrategyname = FStrategyname;
	}

	public String getFStrategydesc() {
		return this.FStrategydesc;
	}

	public void setFStrategydesc(String FStrategydesc) {
		this.FStrategydesc = FStrategydesc;
	}

	public Set getTMoDepartmonitorprelainfos() {
		return this.TMoDepartmonitorprelainfos;
	}

	public void setTMoDepartmonitorprelainfos(Set TMoDepartmonitorprelainfos) {
		this.TMoDepartmonitorprelainfos = TMoDepartmonitorprelainfos;
	}

	public Set getTMoMonitoraprelainfos() {
		return this.TMoMonitoraprelainfos;
	}

	public void setTMoMonitoraprelainfos(Set TMoMonitoraprelainfos) {
		this.TMoMonitoraprelainfos = TMoMonitoraprelainfos;
	}

}