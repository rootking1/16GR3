package com.qhit.lh.gr3.wjw.question.service;

import java.util.List;

import com.qhit.lh.gr3.wjw.classinfo.bean.TCourse;
import com.qhit.lh.gr3.wjw.question.dao.ProblemDao;
import com.qhit.lh.gr3.wjw.question.dao.ProblemDaoImpl;

public class ProblemServiceImpl implements ProblemService {
	ProblemDao problem = new ProblemDaoImpl();
	@Override
	public List<TCourse> queryall() {
		return problem.queryall();
	}

}
