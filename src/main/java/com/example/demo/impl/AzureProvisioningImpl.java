package com.example.demo.impl;

import com.example.demo.dto.FactoryReqResDto;
import com.example.demo.inter.IAzureOperation;

public class AzureProvisioningImpl implements IAzureOperation {

	@Override
	public <T> void execute(FactoryReqResDto<T> request) {
		// TODO Auto-generated method stub
		System.out.println("INSIDE AZURE EXEC " + request.toString());
	} 

}
