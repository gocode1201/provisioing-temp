package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(with = JsonFormat.Feature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvisioningRequestAzure {
	@JsonProperty("vpc")
    private String vpc;

    @JsonProperty("eks")
    private String eks;

    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public String getEks() {
        return eks;
    }

    public void setEks(String eks) {
        this.eks = eks;
    }

    @Override
    public String toString() {
        return "ProvisioingRequestAWS{" +
                "vpc='" + vpc + '\'' +
                ", eks='" + eks + '\'' +
                '}';
    }
}
