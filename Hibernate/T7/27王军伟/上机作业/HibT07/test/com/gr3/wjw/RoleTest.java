package com.gr3.wjw;

import org.junit.Test;
import com.qhit.lh.gr3.wjw.bean.Role;
import com.qhit.lh.gr3.wjw.bean.User;
import com.qhit.lh.gr3.wjw.servcie.BaseService;
import com.qhit.lh.gr3.wjw.servcie.impl.BaseServiceImpl;

/**
 * @author 王军伟 2017年12月20日
 */
public class RoleTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		// 实例化Role
		Role role = new Role();
		role.setRname("董事长");
		role.setMome("决策权");
		// 获取账户
		User user = (User) baseService.getObjectById(User.class, 1);
		// 建立角色和账户的关系
		role.getUsers().add(user);
		// 执行添加操作
		baseService.add(role);
	}

	@Test
	public void delete() {
		Role role = (Role) baseService.getObjectById(Role.class, 1);

		baseService.delete(role);
	}

	@Test
	public void update() {
		Role role = (Role) baseService.getObjectById(Role.class, 1);
		role.setRname("董事会");

		// 获取账户
		User user1 = (User) baseService.getObjectById(User.class, 1);

		// 建立联系
		role.getUsers().add(user1);

		baseService.update(role);
	}

	@Test
	public void query() {
		Role role = (Role) baseService.getObjectById(Role.class, 1);

		for (User user : role.getUsers()) {
			System.out.println(role.getRname() + "---" + user.getUname());
		}
	}
}
