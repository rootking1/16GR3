//package com.qhit.lh.gr3.wjw.common.utils;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;
//
///**
// * @author 王军伟 类说明：SessionFactory工厂类 创建时间:2018年1月9日下午11:46:08
// */
//final public class HibernateSessionFactory {
//	private static SessionFactory sessionfactory;
//	private static ServiceRegistry serviceRegistry;
//	private static Configuration configuration;
//
//	static {
//		// 创建Configuration对象 调用.configure()方法 ,默认class/hibernate.cfg.xml
//		configuration = new Configuration().configure();
//		// 创建服务对象
//		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
//		// 创建sessionFactory工厂
//		sessionfactory = configuration.buildSessionFactory(serviceRegistry);
//	}
//
//	/**
//	 * 获取session对象
//	 * 
//	 * @return
//	 */
//	// 注意：在使用openSession()方法获取session后。用完session后要session.close()
//	public static Session getSession() {
//		// 返回session对象
//		Session openSession = sessionfactory.openSession();
//		return openSession;
//	}
//
//	/**
//	 * 获取session对象
//	 * 
//	 * @return
//	 */
//	// 注意：在使用getCurrentSession()方法获取session后。用完session后session自动关闭
//	public static Session getCurrentSession() {
//		// 返回session对象
//		return sessionfactory.getCurrentSession();
//	}
//}
package com.qhit.lh.gr3.wjw.common.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory sessionfactory;
	private static Configuration configuration;
	static {
		configuration = new Configuration().configure("hibernate.cfg.xml");
		sessionfactory = configuration.buildSessionFactory();
	}
	
	public static Session getSession() {
		return sessionfactory.openSession();
	}
}

