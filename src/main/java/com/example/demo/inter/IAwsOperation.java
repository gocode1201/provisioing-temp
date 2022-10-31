package com.example.demo.inter;

import com.example.demo.dto.FactoryReqResDto;

public interface IAwsOperation {
	<T> FactoryReqResDto<?> execute1(FactoryReqResDto<T> request);
}
