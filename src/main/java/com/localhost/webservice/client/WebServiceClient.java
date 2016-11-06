package com.localhost.webservice.client;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class WebServiceClient {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		try {
			String url = "http://localhost:8080/webService/ws/UserWebService?wsdl";

			JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
			Client client = dcf.createClient(url);
			Object[] result = client.invoke("autoAddUser", 10);
			for (Object out : result) {
				System.out.println(out);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

}
