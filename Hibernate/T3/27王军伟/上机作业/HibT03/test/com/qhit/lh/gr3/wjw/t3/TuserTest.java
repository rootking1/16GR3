package com.qhit.lh.gr3.wjw.t3;


import java.util.List;

import org.junit.Test;

import com.qhit.lh.gr3.wjw.t3.bean.Tdept;
import com.qhit.lh.gr3.wjw.t3.bean.Tuser;
import com.qhit.lh.gr3.wjw.t3.servcie.BaseService;
import com.qhit.lh.gr3.wjw.t3.servcie.impl.BaseServiceImpl;

public class TuserText {
	BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		Tdept tdept = new Tdept();
		tdept.setDid(2);
		tdept.setDname("科技城");
		Tuser tuser = new Tuser("jack", "123456", null);
		tuser.setTdept(tdept);
		baseService.add(tuser);
	}
	@Test
	public void getall() {
		List<Object> all = baseService.getAll("from Tuser");
		for (Object object : all) {
			System.out.println(object);
		}
	}
}
