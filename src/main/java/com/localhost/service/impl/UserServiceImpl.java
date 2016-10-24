package com.localhost.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.IUserDao;
import com.localhost.model.User;
import com.localhost.service.IUserService;

@Transactional
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public Boolean addUsers(User user) throws Exception {
		try {
			userDao.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
