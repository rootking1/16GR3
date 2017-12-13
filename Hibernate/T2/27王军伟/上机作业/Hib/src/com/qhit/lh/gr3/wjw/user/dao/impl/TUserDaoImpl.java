package com.qhit.lh.gr3.wjw.user.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.qhit.lh.gr3.wjw.user.bean.TUser;

/**
 * @author 王军伟 方法实现 创建时间:2017年12月11日下午2:23:35
 */
public class TUserDaoImpl implements com.qhit.lh.gr3.wjw.user.dao.TUserDao {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.qhit.lh.gr3.wjw.user.dao.TUserDao#add(com.qhit.lh.gr3.wjw.user.bean.
	 * TUser)
	 */
	@Override
	public void add(TUser tuser) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		// 创建工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 取得session
		Session session = sf.openSession();
		// 开始事务
		Transaction ts = session.beginTransaction();
		session.save(tuser);
		// 释放资源
		ts.commit();
		session.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.qhit.lh.gr3.wjw.user.dao.TUserDao#del(com.qhit.lh.gr3.wjw.user.bean.
	 * TUser)
	 */
	@Override
	public void del(TUser tuser) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		// 创建工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 取得session
		Session session = sf.openSession();
		// 开始事务
		Transaction ts = session.beginTransaction();
		session.delete(tuser);
		ts.commit();
		session.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qhit.lh.gr3.wjw.user.dao.TUserDao#update(com.qhit.lh.gr3.wjw.user.bean.
	 * TUser)
	 */
	@Override
	public void update(TUser tuser) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		// 创建工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 取得session
		Session session = sf.openSession();
		// 开始事务
		Transaction ts = session.beginTransaction();
		session.update(tuser);
		ts.commit();
		session.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.qhit.lh.gr3.wjw.user.dao.TUserDao#getall()
	 */
	@Override
	public List<TUser> getall(String from) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		// 创建工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 取得session
		Session session = sf.openSession();
		// 开始事务
		Transaction ts = session.beginTransaction();
		// 提交事务
		Query<TUser> query = session.createQuery(from);
		List<TUser> list = (List<TUser>) query.list();
		// 释放资源
		ts.commit();
		session.close();
		return list;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.qhit.lh.gr3.wjw.user.dao.TUserDao#get(com.qhit.lh.gr3.wjw.user.bean.
	 * TUser)
	 */
	@Override
	public TUser get(TUser tuser) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		// 创建工厂
		SessionFactory sf = conf.buildSessionFactory();
		// 取得session
		Session session = sf.openSession();
		// 开始事务
		Transaction ts = session.beginTransaction();
		// 提交事务
		tuser = session.get(TUser.class, tuser.getId());
		// 释放资源
		ts.commit();
		session.close();
		return tuser;
	}
}