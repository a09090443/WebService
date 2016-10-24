package com.localhost.webservice.impl;

import javax.jws.WebService;

import com.localhost.model.User;
import com.localhost.service.IUserService;
import com.localhost.webservice.IHelloWorldWebService;

@WebService(targetNamespace = "http://localhost.com", portName = "HelloWorldWebService")
// @Path("/HelloWorld")
// @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class HelloWorldWebServiceImpl implements IHelloWorldWebService {
	public IUserService userService;

	public IUserService getUserService() {
		return userService;
	}

	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

	public String sayHi() throws Exception{
		// System.out.println(aaaa);IHelloWorld
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		return "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
	}

	public String getEcho(String test) {
		System.out.println("tests222");
		System.out.println("tests222");
		System.out.println("tests222");
		System.out.println("tests222");
		System.out.println("tests222");
		return null;
	}

	@Override
	public String hello() {
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		System.out.println("aaaaaaaa");
		return null;
	}

}
