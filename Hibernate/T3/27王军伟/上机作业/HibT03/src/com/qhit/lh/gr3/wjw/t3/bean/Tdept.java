package com.qhit.lh.gr3.wjw.t3.bean;

/**
 * Tdept entity. @author MyEclipse Persistence Tools
 */

public class Tdept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;

	// Constructors

	/** default constructor */
	public Tdept() {
	}

	/** full constructor */
	public Tdept(String dname) {
		this.dname = dname;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}