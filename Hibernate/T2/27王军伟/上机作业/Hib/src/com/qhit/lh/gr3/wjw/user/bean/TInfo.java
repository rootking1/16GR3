package com.qhit.lh.gr3.wjw.user.bean;
// Generated 2017-12-12 23:25:16 by Hibernate Tools 5.2.6.Final

/**
 * TInfo generated by hbm2java
 */
public class TInfo{

	private int id;
	private String sex;
	private Integer age;
	
	private TUser tuser;
	
	public TInfo() {
	}

	public TInfo(int id) {
		this.id = id;
	}

	public TInfo(int id, String sex, Integer age) {
		this.id = id;
		this.sex = sex;
		this.age = age;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public TUser getTuser() {
		return tuser;
	}

	public void setTuser(TUser tuser) {
		this.tuser = tuser;
	}

}
