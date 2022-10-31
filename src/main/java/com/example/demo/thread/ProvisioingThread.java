package com.example.demo.thread;

import com.example.demo.dto.CallbackOperationDto;
import com.example.demo.dto.ProvisioningCallBackDto;
import com.example.demo.dto.ProvisioningRequestAWS;
import com.example.demo.dto.Request;
import com.example.demo.impl.ProvOperationCallbackImpl;
import com.example.demo.inter.ProvOperationCallback;

public class ProvisioingThread implements Runnable{
	
	ProvOperationCallback callback = new ProvOperationCallbackImpl();
	
	
	private String cmd;
	private String operation;
	private String guid;
	private String callbackid;

	public void setCmd(String cmd) {
		this.cmd = cmd;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public void setCallbackid(String callbackid) {
		this.callbackid = callbackid;
	}

	@Override
	public void run() {
		//provisioing
		if(operation.equals("1")) {
			//generate the input file dto.
			ProvisioningRequestAWS aws = new ProvisioningRequestAWS();
			aws.setEks("EKS CLISTER");
			aws.setVpc("10.15.15.15/20");
			
			Request<ProvisioningRequestAWS> awsrequest = new Request<>();
			awsrequest.setBody(aws);
			awsrequest.setStatus("success");
			awsrequest.setCommand("PROV");
			awsrequest.setCsp("aws");
			
			System.out.println("INPUT FILE IS "+awsrequest.toString());
			
			//call the script
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				
			}
			//call GMS regerstarion
			//call RVLT bucket
			
			//callback on success.
			ProvisioningCallBackDto response = new ProvisioningCallBackDto();
			response.setCallbackid(callbackid);
			response.setGuid(guid);
			response.setMessage("SUCCESSFUL");
			CallbackOperationDto<ProvisioningCallBackDto> call = new CallbackOperationDto<>();
			call.setBody(response);
			callback.onSuccess(call);
			
		} 
		//de-prov
		else {
			
		}
		
	}

}
