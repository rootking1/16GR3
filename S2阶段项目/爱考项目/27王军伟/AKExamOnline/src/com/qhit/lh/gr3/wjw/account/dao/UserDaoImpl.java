package com.qhit.lh.gr3.wjw.account.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.gr3.wjw.account.bean.User;
import com.qhit.lh.gr3.wjw.common.bean.PageBean;
import com.qhit.lh.gr3.wjw.common.utils.HibernateSessionFactory;

/**
 * @author 王军伟 方法实例 创建时间:2018年1月7日上午1:30:08
 */
public class UserDaoImpl implements UserDao {

	@Override
	public User login(User user) {
		// 声明hql语句
		String hql = "select user from User user where user.name = ? and user.pwd = ? and user.role = ?";
		// 1,获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 2，开启事务
		Transaction ts = session.beginTransaction();
		// 3，获取查询器对象
		Query query = session.createQuery(hql);
		query.setParameter(0, user.getName());
		query.setParameter(1, user.getPwd());
		query.setParameter(2, user.getRole());
		List<User> users = query.list();
		// 4,提交事务
		ts.commit();
		if (users.size() != 0) {
			user = users.get(0);
		} else {
			user = null;
		}
		// 5，释放资源
		session.close();
		return user;
	}

	@Override
	public PageBean QueryAll(PageBean pageBean, String hql) {
		// 声明hql语句
		String sql = "select ? from ?";
		// 1,获取session对象
		Session session = HibernateSessionFactory.getSession();
		// 2，开启事务
		Transaction ts = session.beginTransaction();
		// 3，获取查询器对象
		Query query = session.createQuery(sql);
		query.setParameter(0, hql);
		query.setParameter(1, hql);
		// 4,提交事务
		ts.commit();
		// 总记录数
		pageBean.setTotalNumber(query.list().size());
		// 当前页数据
		List<Object> teachers = query.setFirstResult((pageBean.getCurrentIndex() - 1) * pageBean.getPageSize())
				.setMaxResults(pageBean.getPageSize()).list();
		pageBean.setItems(teachers);
		// 5，释放资源
		session.close();
		return pageBean;
	}
}
