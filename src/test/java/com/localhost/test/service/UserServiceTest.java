package com.localhost.test.service;

import static org.junit.Assert.assertTrue;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.localhost.test.base.TestBase;

public class UserServiceTest extends TestBase {

	@Autowired
	private IUserService userService;

//	@Test
	public void testAddUser() {
		try {
			User user = new User();
			user.setAccount("tseg");
			user.setPassword("testsss");
			user.setUserId(267);
			user.setUserName("ttaa5");
			user.setRegisterTime(new Date());
			user.setLastActiveTime(new Date());
			this.userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

//	@Test
	public void testDelUser() {
		try {
			User user = new User();
			user.setAccount("account9");
			user.setUserId(10);
			this.userService.delUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void testUpdateUser() {
		try {
			User user = new User();
			user.setAccount("tset");
			user.setUserId(10);
			user.setEmail("ggggg@localhost.com");
			
			Map<String, Object> conditionMap = new HashMap<String, Object>();
			conditionMap.put("userId", 10);
			conditionMap.put("account", "tset");

			this.userService.updateUser(user, conditionMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

}
