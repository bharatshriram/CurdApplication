/**
 * 
 */
package com.bharat.CurdApplication.bean;

import java.util.List;


/**
 * @author Bharatkumar
 *
 */
public class RegisterResponse {

	public boolean isSuccess;
	public String messageString;
	public Object responseObject;
	
	public RegisterResponse(Boolean isSuccess, String messageString) {
		this.isSuccess = isSuccess;
		this.messageString = messageString;
	}
	
	public RegisterResponse(Boolean isSuccess, String messageString, Object responseObject) {
		this.isSuccess = isSuccess;
		this.messageString = messageString;
		this.responseObject = responseObject;
	}

	public RegisterResponse(Boolean isSuccess, List<Register> register) {
		this.isSuccess = isSuccess;
		this.responseObject = register;
	}

	public RegisterResponse(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
}
