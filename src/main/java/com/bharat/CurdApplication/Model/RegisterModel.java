/**
 * 
 */
package com.bharat.CurdApplication.Model;

import javax.persistence.Entity;


/**
 * @author Bharatkumar
 *
 */
@Entity
public class RegisterModel extends BaseEntity{

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
}
