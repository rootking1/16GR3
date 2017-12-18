package com.qhit.lh.gr3.wjw.t3.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Tdept entity. @author MyEclipse Persistence Tools
 */

public class Tdept implements java.io.Serializable {

	// Fields

	private Integer did;
	private String dname;
	private Set<Tuser> tusers = new HashSet<>();

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

	public Set<Tuser> getTusers() {
		return tusers;
	}

	public void setTusers(Set<Tuser> tusers) {
		this.tusers = tusers;
	}

}