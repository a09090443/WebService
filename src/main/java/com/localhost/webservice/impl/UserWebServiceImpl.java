package com.localhost.webservice.impl;

import javax.jws.WebService;

import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.localhost.webservice.IUserWebService;

/**
 * @author zipe
 *
 */
@WebService(targetNamespace = "http://localhost.com", portName = "UserWebService")
public class UserWebServiceImpl implements IUserWebService {
	public IUserService userService;
	
	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/*
	 * (non-Javadoc)
	 * @see com.localhost.webservice.IUserWebService#autoAddUser(int)
	 */
	@Override
	public String autoAddUser(int quentity) throws Exception {
		User user = new User();

		try {
			for (int i = 0; i < quentity; i++) {
				user.setAccount("account" + i);
				user.setUserName("user" + i);
				user.setPassword("password" + i);
				user.setEmail("user" + 1 + "@localhost.com");
				userService.addUser(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return "Success";
	}

	/* (non-Javadoc)
	 * @see com.localhost.webservice.IUserWebService#addUser(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void addUser(String account, String userName, String password) throws Exception {
		User user = new User();
		user.setAccount(account);
		user.setUserName(userName);
		user.setPassword(password);
		userService.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.localhost.webservice.IUserWebService#delUser(java.lang.String)
	 */
	@Override
	public void delUser(String account) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
