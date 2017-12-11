package com.qhit.lh.gr3.wjw.user.service.impl;

import java.util.List;

import com.qhit.lh.gr3.wjw.user.bean.TUser;
import com.qhit.lh.gr3.wjw.user.dao.impl.TUserDaoImpl;
import com.qhit.lh.gr3.wjw.user.service.TUserService;

/**
 * @author 王军伟 
 * 业务方法 
 * 创建时间:2017年12月11日下午2:23:06
 */
public class TUserIerviceImpl implements TUserService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qhit.lh.gr3.wjw.user.service.TUserService#add(com.qhit.lh.gr3.wjw.user.
	 * bean.TUser)
	 */
	@Override
	public void add(TUser tuser) {
		new TUserDaoImpl().add(tuser);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qhit.lh.gr3.wjw.user.service.TUserService#del(com.qhit.lh.gr3.wjw.user.
	 * bean.TUser)
	 */
	@Override
	public void del(TUser tuser) {
		new TUserDaoImpl().del(tuser);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.qhit.lh.gr3.wjw.user.service.TUserService#update(com.qhit.lh.gr3.wjw.user
	 * .bean.TUser)
	 */
	@Override
	public void update(TUser tuser) {
		new TUserDaoImpl().update(tuser);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.qhit.lh.gr3.wjw.user.service.TUserService#getall()
	 */
	@Override
	public List<TUser> getall(String from) {
		return new TUserDaoImpl().getall(from);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.wjw.user.service.TUserService#get(com.qhit.lh.gr3.wjw.user.bean.TUser)
	 */
	@Override
	public TUser get(TUser tuser) {
		return new TUserDaoImpl().get(tuser);
	}

}
