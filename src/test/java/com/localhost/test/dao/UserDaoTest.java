package com.localhost.test.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.IUserDao;
import com.localhost.test.base.TestBase;

public class UserDaoTest extends TestBase{
	@Autowired
	private IUserDao userDao;

	@Test
	@Transactional
    @Rollback(true)
	public void testFindMaxUserId() {
		try {
			String userId = userDao.findMaxId();
			System.out.println(userId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(true);
	}
}
