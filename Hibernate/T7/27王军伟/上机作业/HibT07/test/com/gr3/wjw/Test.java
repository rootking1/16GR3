package com.gr3.wjw;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.qhit.lh.gr3.wjw.bean.Emp;
import com.qhit.lh.gr3.wjw.utils.HibernateSessionFactory;

/**
 * @author 王军伟 
 * 2017年12月25日上午11:20:24
 */
public class Test {

	@org.junit.Test
	public void EmpTest() {
		String hql = "select e from Emp e where e.ename like ?";

		Session session = HibernateSessionFactory.getSession();

		Query query = session.createQuery(hql);
		query.setString(0, "大%");

		List<Emp> result = query.list();

		for (Emp emp : result) {
			System.out.println(emp.getEname());
		}
	}
}
