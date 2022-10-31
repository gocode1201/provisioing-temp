package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvWorkloadInputDto {
	@JsonProperty("id")
    private String id;
	
    @JsonProperty("customerId")
    private String customerId;
    
    @JsonProperty("customerName")
    private String customerName;
    
    @JsonProperty("tenantId")
    private String tenantId;
    
    @JsonProperty("tenantName")
    private String tenantName;
    
    @JsonProperty("csp")
    private String csp;

    @JsonProperty("cspRegion")
    private String cspRegion;
    
    @JsonProperty("customerSubscription")
    private String customerSubscription;
    
    @JsonProperty("callBackEventId")
    private String callBackEventId ;
    
    @JsonProperty("rollbackFlag")
    private boolean rollbackFlag;
    
    @JsonProperty("guid")
    private String guid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTenantName() {
		return tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getCsp() {
		return csp;
	}

	public void setCsp(String csp) {
		this.csp = csp;
	}

	public String getCspRegion() {
		return cspRegion;
	}

	public void setCspRegion(String cspRegion) {
		this.cspRegion = cspRegion;
	}

	public String getCustomerSubscription() {
		return customerSubscription;
	}

	public void setCustomerSubscription(String customerSubscription) {
		this.customerSubscription = customerSubscription;
	}

	public String getCallBackEventId() {
		return callBackEventId;
	}

	public void setCallBackEventId(String callBackEventId) {
		this.callBackEventId = callBackEventId;
	}

	public boolean isRollbackFlag() {
		return rollbackFlag;
	}

	public void setRollbackFlag(boolean rollbackFlag) {
		this.rollbackFlag = rollbackFlag;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public String toString() {
		return "AWSinputRequest [id=" + id + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", tenantId=" + tenantId + ", tenantName=" + tenantName + ", csp=" + csp + ", cspRegion=" + cspRegion
				+ ", customerSubscription=" + customerSubscription + ", callBackEventId=" + callBackEventId
				+ ", rollbackFlag=" + rollbackFlag + ", guid=" + guid + "]";
	}
    
}
