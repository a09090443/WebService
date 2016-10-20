package com.localhost.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.GET;

@WebService(targetNamespace = "http://service.localhost.com/")
public interface IHelloWorld {
	
	@GET
	@WebMethod(operationName="sayHi",action="sayHi")
	@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.BARE)
	public String sayHi(@WebParam(name="message") String message);

}