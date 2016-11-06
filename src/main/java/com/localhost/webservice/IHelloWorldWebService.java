package com.localhost.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.ws.rs.GET;

@WebService(targetNamespace = "http://localhost.com", portName = "HelloWorldWebService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface IHelloWorldWebService {

	@GET
	@WebMethod(operationName = "sayHi", action = "sayHi")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public String sayHi() throws Exception;

	@GET
	@WebMethod(operationName = "hello", action = "hello")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public String hello();

	@GET
	@WebMethod(operationName = "getEcho", action = "getEcho")
	@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
	public String getEcho(@WebParam(name = "test") String test);

}