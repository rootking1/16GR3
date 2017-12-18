package com.qhit.lh.gr3.wjw.t3;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import com.qhit.lh.gr3.wjw.t3.bean.Tdept;
import com.qhit.lh.gr3.wjw.t3.bean.Tuser;
import com.qhit.lh.gr3.wjw.t3.servcie.BaseService;
import com.qhit.lh.gr3.wjw.t3.servcie.impl.BaseServiceImpl;

public class TuserText {
	BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//创建部门
		Tdept tdept = new Tdept();
		tdept.setDname("公关部");
		//添加用户
		Tuser tuser = new Tuser("沉一会", "123456", null);
		tdept.getTusers().add(tuser);
		//执行
		baseService.add(tdept);
	}
	@Test
	public void getall() {
		List<Object> all = baseService.getAll("from Tuser");
		for (Object object : all) {
			System.out.println(object);
		}
	}
	@Test
	public void update() {
		Tdept tdept = (Tdept) baseService.getObjectById(Tdept.class, 2);
		tdept.setDname("天下第一部");
		baseService.update(tdept);
	}
	@Test
	public void delete() {
		Tdept tdept = (Tdept) baseService.getObjectById(Tdept.class, 2);
		baseService.delete(tdept);
	}
}
