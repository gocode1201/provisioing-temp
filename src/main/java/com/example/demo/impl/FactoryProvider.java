package com.example.demo.impl;

import com.example.demo.inter.AbstractFactory;

public class FactoryProvider {
	
	public static AbstractFactory<?> getFactory(String csp){
		if(csp.equals("aws")) {
			return new AwsFactory();
		}
		else if(csp.equals("az")) {
			return new AzureFactory();
		}
		return null;
	}
	

}
