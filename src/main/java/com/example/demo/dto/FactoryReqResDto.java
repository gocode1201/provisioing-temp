package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FactoryReqResDto<T> {
	
	private T body;
	private String operation;
	private String csp;

	public T getRequest() {
		return body;
	}

	public void setRequest(T request) {
		this.body = request;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getCsp() {
		return csp;
	}

	public void setCsp(String csp) {
		this.csp = csp;
	}

	@Override
	public String toString() {
		return "GenericRB [request=" + body + ", operation=" + operation + ", csp=" + csp + "]";
	}

	
	

}
