package com.qhit.lh.gr3.wjw.question.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.wjw.classinfo.bean.TCourse;
import com.qhit.lh.gr3.wjw.common.utils.HibernateSessionFactory;
import com.qhit.lh.gr3.wjw.question.bean.TWrittenTest;

public class ProblemDaoImpl implements ProblemDao {

	@Override
	public List<TCourse> queryall() {
		// 声明hql语句
		String hql = "select c from TCourse c";
		// 1,获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 2，开启事务
		Transaction ts = session.beginTransaction();
		// 3，获取查询器对象
		Query query = session.createQuery(hql);
		List<TCourse> cs = (List<TCourse>)query.list();
		// 4,提交事务
		ts.commit();
		// 5，释放资源
		session.close();
		return cs;
	}
}
