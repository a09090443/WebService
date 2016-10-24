package com.localhost.webservice.impl;

import javax.jws.WebService;

import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.localhost.webservice.IUserWebService;

@WebService(targetNamespace = "http://localhost.com", portName = "UserWebService")
public class UserWebServiceImpl implements IUserWebService {
	public IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	@Override
	public Boolean addUser(String userName, String passowrd) throws Exception {
		User user = new User();
		user.setUserId(userName);
		user.setVendorId("sale05");
		user.setUserName(userName);
		user.setPassword(passowrd);
		return userService.addUsers(user);
	}

}
