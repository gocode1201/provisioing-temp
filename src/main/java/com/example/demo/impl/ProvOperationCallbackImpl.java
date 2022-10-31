package com.example.demo.impl;

import com.example.demo.dto.CallbackOperationDto;
import com.example.demo.inter.ProvOperationCallback;

public class ProvOperationCallbackImpl implements ProvOperationCallback {

	@Override
	public <T> void onSuccess(CallbackOperationDto<T> body) {
		// TODO Auto-generated method stub
		System.out.println("ON SUCCESS IMPLETED");
		System.out.println(body.toString());

	}

	@Override
	public <T> void onFailure(CallbackOperationDto<T> body) {
		// TODO Auto-generated method stub
		System.out.println("ON FAILURE IMPLETED");
		System.out.println(body.toString());
	}

}
