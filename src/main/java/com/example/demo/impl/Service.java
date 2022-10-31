package com.example.demo.impl;

import com.example.demo.dto.FactoryReqResDto;
import com.example.demo.inter.AbstractFactory;
import com.example.demo.inter.IAwsOperation;
import com.example.demo.inter.IAzureOperation;

public class Service {

	
	public <T> String genericFucntion(String operation, FactoryReqResDto<T> request) {
		String csp = request.getCsp();
		switch (csp) {
		case "az":
			AbstractFactory<?> abs1 = FactoryProvider.getFactory(csp);
			IAzureOperation op1 = (IAzureOperation) abs1.create(operation);
			op1.execute(request);
			break;
		case "aws":
			AbstractFactory<?> abs = FactoryProvider.getFactory(csp);
			IAwsOperation op = (IAwsOperation) abs.create(operation);
			FactoryReqResDto<?> awsResponse = op.execute1(request);
			System.out.println("SEND BACK RESPONSE IMMEDIATELY -> "+awsResponse.toString());
			break;
		}
		
		return "succes";
	}
}
