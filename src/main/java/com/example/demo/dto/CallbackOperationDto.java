package com.example.demo.dto;

public class CallbackOperationDto<T> {
	private T body;

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "CallbackOperationDto [body=" + body + "]";
	}
	
	
}
