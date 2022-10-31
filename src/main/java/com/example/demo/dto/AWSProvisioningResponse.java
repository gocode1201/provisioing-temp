package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AWSProvisioningResponse {
	
	@JsonProperty("id")
    private String id;
    
	
    @JsonProperty("operationId")
    private String operationId;

    public String getOperationId() {
        return operationId;
    }
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }
  
	public String getId() {
		// TODO Auto-generated method stub
		return id;		
	}

	public void setId(String id) {
        this.id = id;
    }
	@Override
	public String toString() {
		return "AWSProvisioningResponse [id=" + id + ", operationId=" + operationId + "]";
	}

}
