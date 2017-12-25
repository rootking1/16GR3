package com.gr3.wjw;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.wjw.bean.Emp;
import com.qhit.lh.gr3.wjw.utils.HibernateSessionFactory;

/**
 * @author 王军伟 
 * 2017年12月25日上午9:59:43
 */
public class UserTest {

	@Test
	public void EmpTest() {

		Session session = HibernateSessionFactory.getSession();

		Criteria criteria = session.createCriteria(Emp.class).add(Restrictions.like("ename", "王%"));

		List<Emp> list = criteria.list();

		for (Emp e : list) {
			System.out.println(e.getEname());
		}

	}
}
