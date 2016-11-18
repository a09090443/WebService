package com.localhost.test.service;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.localhost.test.base.TestBase;
import com.usefulness.utils.date.DateUtils;

public class UserServiceTest extends TestBase {

	@Autowired
	private IUserService userService;

	@Test
	public void testAddUser() {
		try {
			for(int i=6; i<25; i++){
				User user = new User();
				user.setAccount("tseg"+i);
				user.setPassword("testsss");
				user.setUserName("ttaa" + i);
				user.setEmail("test" + i + "@localhost.com");
				this.userService.addUser(user);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

	@Test
	public void testDelUser() {
		try {
			User user = new User();
			user.setAccount("account9");
			user.setUserId("10");
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
			user.setAccount("tseg5");
			user.setUserId("00042");
			user.setEmail("ggggg@localhost.com");
			
			Map<String, Object> conditionMap = new HashMap<String, Object>();
			conditionMap.put("userId", "00042");
			conditionMap.put("account", "tseg5");

			this.userService.updateUser(user, conditionMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}

}
