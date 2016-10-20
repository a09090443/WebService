package com.localhost.webservice.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.ws.rs.GET;

import com.localhost.webservice.IHelloWorld;

//@WebService(endpointInterface = "com.localhost.service.HelloWorld")
@WebService(targetNamespace = "http://service.localhost.com/")
public class HelloWorldImpl implements IHelloWorld {

	@GET
	@WebMethod(operationName="sayHi", action="sayHi")
	@SOAPBinding(parameterStyle=ParameterStyle.BARE)
	public String sayHi(String message) {
		System.out.println(message);
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		System.out.println("tests");
		return "SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS";
	}


}
