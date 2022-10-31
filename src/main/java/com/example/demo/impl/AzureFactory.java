package com.example.demo.impl;

import com.example.demo.inter.AbstractFactory;
import com.example.demo.inter.IAzureOperation;

public class AzureFactory implements AbstractFactory<IAzureOperation> {

	@Override
	public IAzureOperation create(String operation) {
		// TODO Auto-generated method stub
		if(operation.equals("PROV")) {
			return new AzureProvisioningImpl();
		}
		return null;
	}

}
