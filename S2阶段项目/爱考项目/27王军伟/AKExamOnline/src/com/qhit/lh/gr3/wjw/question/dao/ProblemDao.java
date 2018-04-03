package com.qhit.lh.gr3.wjw.question.dao;

import java.util.List;

import com.qhit.lh.gr3.wjw.classinfo.bean.TCourse;

public interface ProblemDao {
	// 查询所有试题
	public List<TCourse> queryall();
}
