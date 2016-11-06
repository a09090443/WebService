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
	public void addUser(@WebParam(name = "account") String account, @WebParam(name = "userName") String userName, @WebParam(name = "password") String password) throws Exception;
	
	@GET
	@WebMethod(operationName = "delUser", action = "delUser")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public void delUser(@WebParam(name = "account") String account) throws Exception;

	@GET
	@WebMethod(operationName = "autoAddUser", action = "autoAddUser")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public String autoAddUser(int quentity) throws Exception;

}