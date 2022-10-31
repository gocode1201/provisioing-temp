package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.ProvWorkloadInputDto;
import com.example.demo.dto.FactoryReqResDto;
import com.example.demo.impl.Service;

@SpringBootApplication
public class ProvisioningApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvisioningApplication.class, args);
		
		
		//generate AWS RB
		ProvWorkloadInputDto input = new ProvWorkloadInputDto();
		input.setCallBackEventId("123");
		input.setGuid("guid");
		input.setCsp("aws");
		
		FactoryReqResDto<ProvWorkloadInputDto> rb = new FactoryReqResDto<>();
		rb.setRequest(input);
		rb.setCsp("aws");
		rb.setOperation("PROV");
		
		
		//generate AZURE RB
		ProvWorkloadInputDto input1 = new ProvWorkloadInputDto();
		input1.setCallBackEventId("123");
		input1.setGuid("guid");
		input1.setCsp("aws");
		
		FactoryReqResDto<ProvWorkloadInputDto> rb1 = new FactoryReqResDto<>();
		rb1.setRequest(input1);
		rb1.setCsp("az");
		rb1.setOperation("PROV");
		
		//Call the services
		Service ser = new Service();
		ser.genericFucntion("PROV", rb);
//		ser.genericFucntion("PROV", rb1);
		
		System.out.println("DONE");
	}

	
}



//
////generate Azure RB
//ProvisioninfRequestAzure az = new ProvisioninfRequestAzure();
//az.setEks("AKS CLISTER");
//az.setVpc("10.15.15.15/20");
//
//Request<ProvisioninfRequestAzure> azrequest = new Request<>();
//azrequest.setBody(az);
//azrequest.setStatus("success");
//azrequest.setCommand("PROV");
//azrequest.setCsp("az");