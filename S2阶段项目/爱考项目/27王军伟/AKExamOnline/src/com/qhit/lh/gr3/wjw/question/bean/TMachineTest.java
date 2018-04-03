package com.qhit.lh.gr3.wjw.question.bean;
// Generated 2018-3-8 11:27:08 by Hibernate Tools 5.2.8.Final

/**
 * @author 王军伟
 * 类说明：机试
 * 创建时间:2018年3月9日下午8:07:06
 */
public class TMachineTest implements java.io.Serializable {

	//机试编号
	private Integer qid;
	//机试标题
	private String qtitle;
	//难易程度
	private String degree;
	//章节
	private int csId;
	//所属科目
	private String chapter;

	public TMachineTest() {
	}

	public TMachineTest(String qtitle, String degree, int csId) {
		this.qtitle = qtitle;
		this.degree = degree;
		this.csId = csId;
	}

	public TMachineTest(String qtitle, String degree, int csId, String chapter) {
		this.qtitle = qtitle;
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

	public String getQtitle() {
		return this.qtitle;
	}

	public void setQtitle(String qtitle) {
		this.qtitle = qtitle;
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

}
