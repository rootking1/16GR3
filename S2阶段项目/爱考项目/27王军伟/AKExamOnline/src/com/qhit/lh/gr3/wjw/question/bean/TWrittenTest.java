package com.qhit.lh.gr3.wjw.question.bean;
// Generated 2018-3-8 11:27:08 by Hibernate Tools 5.2.8.Final

import com.qhit.lh.gr3.wjw.classinfo.bean.TCourse;

/**
 * 
 * @author 王军伟
 * 类说明：题库
 * 创建时间:2018年3月8日上午11:50:58
 */
public class TWrittenTest implements java.io.Serializable {

	//编号
	private Integer qid;
	//类型
	private String qtype;
	//标题
	private String qtitle;
	//选择A
	private String optionA;
	//选择B
	private String optionB;
	//选择C
	private String optionC;
	//选择D
	private String optionD;
	//答案
	private String answer;
	//困难程度
	private String degree;
	//章节
	private int csId;
	//所属科目
	private String chapter;
//n-1
	private TCourse tcourse;
	public TWrittenTest() {
	}

	public TWrittenTest(String qtype, String qtitle, String optionA, String optionB, String optionC, String optionD,
			String degree, int csId) {
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.degree = degree;
		this.csId = csId;
	}

	public TWrittenTest(String qtype, String qtitle, String optionA, String optionB, String optionC, String optionD,
			String answer, String degree, int csId, String chapter) {
		this.qtype = qtype;
		this.qtitle = qtitle;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.answer = answer;
		this.degree = degree;
		this.csId = csId;
		this.chapter = chapter;
	}

	public Integer getQid() {
		return this.qid;
	}

	public void setQid(Integer qid) {
		this.qid = qid;
	}

	public String getQtype() {
		return this.qtype;
	}

	public void setQtype(String qtype) {
		this.qtype = qtype;
	}

	public String getQtitle() {
		return this.qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
	}

	public String getOptionA() {
		return this.optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return this.optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return this.optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return this.optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getCsId() {
		return this.csId;
	}

	public void setCsId(int csId) {
		this.csId = csId;
	}

	public String getChapter() {
		return this.chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public TCourse getTcourse() {
		return tcourse;
	}

	public void setTcourse(TCourse tcourse) {
		this.tcourse = tcourse;
	}

}
