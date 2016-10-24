package com.localhost.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.GET;

@WebService(targetNamespace = "http://localhost.com", portName = "UserWebService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IUserWebService {
	
	@GET
	@WebMethod(operationName = "addUser", action = "addUser")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public Boolean addUser(@WebParam(name = "userName") String userName, @WebParam(name = "passowrd") String passowrd) throws Exception;

}