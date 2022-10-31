package com.example.demo.dto;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseFileInputDto {
    @JsonProperty("id")
    private String id;

    @JsonProperty("cId")
    private String cId;

    @JsonProperty("version")
    private String version;

    @JsonProperty("customerId")
    private String customerId;

    @JsonProperty("csp")
    private String csp;

    @JsonProperty("tenantId")
    private String tenantId;

    @JsonProperty("command")
    private String command;

    @JsonProperty("timeStamp")
    private String timeStamp;

    @JsonProperty("customerName")
    private String customerName;

    @JsonProperty("tenantName")
    private String tenantName;

    @JsonProperty("customLabels")
    private String[] customLabels;

    @JsonProperty("logPath")
    private String logPath;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCsp() {
		return csp;
	}

	public void setCsp(String csp) {
		this.csp = csp;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String[] getCustomLabels() {
		return customLabels;
	}

	public void setCustomLabels(String[] customLabels) {
		this.customLabels = customLabels;
	}

	public String getLogPath() {
		return logPath;
	}

	public void setLogPath(String logPath) {
		this.logPath = logPath;
	}

	@Override
	public String toString() {
		return "BaseRequest [id=" + id + ", cId=" + cId + ", version=" + version + ", customerId=" + customerId
				+ ", csp=" + csp + ", tenantId=" + tenantId + ", command=" + command + ", timeStamp=" + timeStamp
				+ ", customerName=" + customerName + ", tenantName=" + tenantName + ", customLabels="
				+ Arrays.toString(customLabels) + ", logPath=" + logPath + "]";
	}

    
}
