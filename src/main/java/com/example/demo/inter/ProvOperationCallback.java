package com.example.demo.inter;

import com.example.demo.dto.CallbackOperationDto;

public interface ProvOperationCallback {
	public <T> void onSuccess(CallbackOperationDto<T> body);
	public <T> void onFailure(CallbackOperationDto<T> body);

}
