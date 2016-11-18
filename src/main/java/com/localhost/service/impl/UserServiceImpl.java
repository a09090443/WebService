package com.localhost.service.impl;

import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.localhost.dao.IUserDao;
import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.usefulness.utils.date.DateUtils;

@Transactional
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	private Integer maxId;

	public void addUser(User user) throws Exception {
		Integer newId = 0;
		if (null == maxId) {
			String userId = userDao.findMaxId();
			if(userId.equals("0")){
				maxId = 0;
			}else{
				maxId = Integer.valueOf(userId);
			}
		}
		newId = maxId + 1;
		String getTime = DateUtils.getCurrentDate("yyyy-MM-dd hh:mm:ss");
		String formatStr = "%05d";
		String newIdStr = String.format(formatStr, newId);
		user.setUserId(newIdStr);
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
