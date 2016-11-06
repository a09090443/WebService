package com.localhost.service;

import java.util.Map;

import com.localhost.model.User;

public interface IUserService {
	public void addUser(User user) throws Exception;

	public void delUser(User user) throws Exception;

	public void updateUser(User user, Map<String, Object> conditionMap) throws Exception;
}
