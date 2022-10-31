package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisioningCallBackDto {
	private String message;
	private String callbackid;
	private String guid;
	private String instanceId;
	private String operationId;
	private String status;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCallbackid() {
		return callbackid;
	}
	public void setCallbackid(String callbackid) {
		this.callbackid = callbackid;
	}
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		this.guid = guid;
	}
	public String getInstanceId() {
		return instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}
	public String getOperationId() {
		return operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ProvisioningCallBackDto [message=" + message + ", callbackid=" + callbackid + ", guid=" + guid
				+ ", instanceId=" + instanceId + ", operationId=" + operationId + ", status=" + status + "]";
	}
	

}
