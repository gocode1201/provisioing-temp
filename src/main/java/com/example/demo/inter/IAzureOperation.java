package com.example.demo.inter;

import com.example.demo.dto.FactoryReqResDto;

public interface IAzureOperation {
	
	<T> void execute(FactoryReqResDto<T> request);

}
