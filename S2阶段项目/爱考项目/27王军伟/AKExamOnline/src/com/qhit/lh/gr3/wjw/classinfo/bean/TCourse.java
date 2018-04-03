package com.qhit.lh.gr3.wjw.classinfo.bean;
// Generated 2018-3-8 11:27:08 by Hibernate Tools 5.2.8.Final

import java.util.HashSet;
import java.util.Set;

import com.qhit.lh.gr3.wjw.question.bean.TMachineTest;
import com.qhit.lh.gr3.wjw.question.bean.TWrittenTest;

/**
 * @author 王军伟 类说明：课程 创建时间:2018年3月9日下午7:56:30
 */
public class TCourse implements java.io.Serializable {

	// 课程编号
	private Integer csId;
	// 课程名
	private String csName;
	// 阶段
	private String stage;
	// 方向
	private String major;
	// 1-n
	private Set<TWrittenTest> writtenTests = new HashSet<TWrittenTest>();
	//1-n
	private Set<TMachineTest> machineTests = new HashSet<TMachineTest>();

	public TCourse() {
	}

	public TCourse(String csName, String stage, String major) {
		this.csName = csName;
		this.stage = stage;
		this.major = major;
	}

	public Integer getCsId() {
		return this.csId;
	}

	public void setCsId(Integer csId) {
		this.csId = csId;
	}

	public String getCsName() {
		return this.csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getStage() {
		return this.stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Set<TWrittenTest> getWrittenTests() {
		return writtenTests;
	}

	public void setWrittenTests(Set<TWrittenTest> writtenTests) {
		this.writtenTests = writtenTests;
	}

	public Set<TMachineTest> getMachineTests() {
		return machineTests;
	}

	public void setMachineTests(Set<TMachineTest> machineTests) {
		this.machineTests = machineTests;
	}
}
