package com.serviceDesk.common.domain;

import java.sql.Timestamp;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Short empno;
	private Dept dept;
	private String ename;
	private String job;
	private Short mgr;
	private Timestamp hiredate;
	private Double sal;
	private Double comm;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** full constructor */
	public Emp(Dept dept, String ename, String job, Short mgr,
			Timestamp hiredate, Double sal, Double comm) {
		this.dept = dept;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
	}

	// Property accessors

	public Short getEmpno() {
		return this.empno;
	}

	public void setEmpno(Short empno) {
		this.empno = empno;
	}

	public Dept getDept() {
		return this.dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Short getMgr() {
		return this.mgr;
	}

	public void setMgr(Short mgr) {
		this.mgr = mgr;
	}

	public Timestamp getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}

	public Double getSal() {
		return this.sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public Double getComm() {
		return this.comm;
	}

	public void setComm(Double comm) {
		this.comm = comm;
	}

}