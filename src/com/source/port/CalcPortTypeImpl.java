package com.source.port;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.source.Calc;
import com.source.ObjectFactory;

@WebService(name = "Calc", targetNamespace = "http://source.com")
@XmlSeeAlso({ ObjectFactory.class })
public class CalcPortTypeImpl implements Calc {

	@WebMethod
	@WebResult(name = "addReturn", targetNamespace = "http://source.com")
	@RequestWrapper(localName = "add", targetNamespace = "http://source.com", className = "com.source.Add")
	@ResponseWrapper(localName = "addResponse", targetNamespace = "http://source.com", className = "com.source.AddResponse")
	public int add(
			@WebParam(name = "a", targetNamespace = "http://source.com") int a,
			@WebParam(name = "b", targetNamespace = "http://source.com") int b) {
		return a + b;
	}

	@WebMethod
	@WebResult(name = "subReturn", targetNamespace = "http://source.com")
	@RequestWrapper(localName = "sub", targetNamespace = "http://source.com", className = "com.source.Sub")
	@ResponseWrapper(localName = "subResponse", targetNamespace = "http://source.com", className = "com.source.SubResponse")
	public int sub(
			@WebParam(name = "a", targetNamespace = "http://source.com") int a,
			@WebParam(name = "b", targetNamespace = "http://source.com") int b) {
		return a - b;
	}

}
