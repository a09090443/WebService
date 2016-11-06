package com.localhost.webservice.impl;

import javax.jws.WebService;

import com.localhost.service.IUserService;
import com.localhost.webservice.IHelloWorldWebService;

/**
 * @author zipe
 *
 */
@WebService(targetNamespace = "http://localhost.com", portName = "HelloWorldWebService")
public class HelloWorldWebServiceImpl implements IHelloWorldWebService {
	public IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	/* (non-Javadoc)
	 * @see com.localhost.webservice.IHelloWorldWebService#sayHi()
	 */
	public String sayHi() throws Exception {
		System.out.println("Success!!");
		return "SayHi";
	}

	/* (non-Javadoc)
	 * @see com.localhost.webservice.IHelloWorldWebService#getEcho(java.lang.String)
	 */
	public String getEcho(String test) {
		System.out.println("Success!!" + test);
		return "GetEcho";
	}

	/* (non-Javadoc)
	 * @see com.localhost.webservice.IHelloWorldWebService#hello()
	 */
	@Override
	public String hello() {
		System.out.println("Success!!");
		return "Hello";
	}

}
