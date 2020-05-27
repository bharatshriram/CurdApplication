/**
 * 
 */
package com.bharat.CurdApplication.bean;

import org.springframework.util.StringUtils;



/**
 * @author Bharatkumar
 *
 */
public class Register {
	
	private Long id;
	private String name;
	private String address;
	private String mobileNo;
	private String emailId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public RegisterResponse toValidateForCreateRegister() {
		// TODO Auto-generated method stub
		
		if (StringUtils.isEmpty(this.name)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Name");

		}
		
		if (StringUtils.isEmpty(this.mobileNo)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter the Mobile");

		}
		
		if (StringUtils.isEmpty(this.emailId)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Email");

		}
		
		if (StringUtils.isEmpty(this.address)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Address");

		}
		
		
		return new RegisterResponse(Boolean.TRUE);
	}
	
	public RegisterResponse toValidateForUpdateRegister() {
		// TODO Auto-generated method stub
		if (StringUtils.isEmpty(this.name)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Name");

		}
		
		if (StringUtils.isEmpty(this.mobileNo)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter the Mobile");

		}
		
		if (StringUtils.isEmpty(this.emailId)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Email");

		}
		
		if (StringUtils.isEmpty(this.address)) {
			return new RegisterResponse(Boolean.FALSE, "Please enter Address");

		}
		
		return new RegisterResponse(Boolean.TRUE);
	}
}
