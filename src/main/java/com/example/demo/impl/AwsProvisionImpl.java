package com.example.demo.impl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.example.demo.dto.AWSProvisioningResponse;
import com.example.demo.dto.FactoryReqResDto;
import com.example.demo.dto.ProvWorkloadInputDto;
import com.example.demo.dto.ProvisioningRequestAWS;
import com.example.demo.dto.Request;
import com.example.demo.inter.IAwsOperation;
import com.example.demo.thread.ProvisioingThread;

public class AwsProvisionImpl implements IAwsOperation{
	ExecutorService exec = Executors.newFixedThreadPool(2);
	


	@Override
	public <T> FactoryReqResDto<?> execute1(FactoryReqResDto<T> req) {
		// TODO Auto-generated method stub
		ProvWorkloadInputDto awsInput = (ProvWorkloadInputDto) req.getRequest();
		System.out.println("INSIDE AWS PROV execute " + awsInput.toString());
		
		// create a new input script file
		ProvisioningRequestAWS aws = new ProvisioningRequestAWS();
		aws.setEks("EKS CLISTER");
		aws.setVpc("10.12.12.12/20");
		
		Request<ProvisioningRequestAWS> request = new Request<>();
		request.setBody(aws);
		request.setStatus("success");
		request.setCommand("PROV");
		request.setCsp("aws");
		request.setCommand(req.getOperation());
		
		ProvisioingThread thread = new ProvisioingThread();
		thread.setCallbackid(awsInput.getCallBackEventId());
		thread.setGuid(awsInput.getGuid());
		thread.setOperation("1");
		exec.execute(thread);
		
		AWSProvisioningResponse response = new AWSProvisioningResponse();
		response.setId("123");
		response.setOperationId("1234");
		FactoryReqResDto<AWSProvisioningResponse> awsResponse = new FactoryReqResDto<>();
		awsResponse.setRequest(response);
		return awsResponse;
	}

}
