package com.localhost.service.impl;

import java.util.Date;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.IUserDao;
import com.localhost.model.User;
import com.localhost.service.IUserService;

@Transactional
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	private Integer maxId;

	public void addUser(User user) throws Exception {
		Integer newId = 0;
		if (null == maxId) {
			maxId = userDao.findMaxId();
		}
		newId = maxId + 1;

		Date getTime = new Date();

		user.setUserId(newId);
		user.setRegisterTime(getTime);
		user.setLastActiveTime(getTime);
		try {
			userDao.save(user);
			maxId += 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delUser(User user) throws Exception {
		try {
			userDao.delete(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User user, Map<String, Object> conditionMap) throws Exception {
		try {
			userDao.update(user, conditionMap);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

}
