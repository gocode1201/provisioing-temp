package com.example.demo.impl;

import com.example.demo.inter.AbstractFactory;
import com.example.demo.inter.IAwsOperation;

public class AwsFactory implements AbstractFactory<IAwsOperation> {

	@Override
	public IAwsOperation create(String operation) {
		// TODO Auto-generated method stub
		if(operation.equals("PROV")) {
			return new AwsProvisionImpl();
		}
		return null;
	}

}
