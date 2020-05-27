/**
 * 
 */
package com.bharat.CurdApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bharat.CurdApplication.Model.RegisterModel;
import com.bharat.CurdApplication.bean.Register;
import com.bharat.CurdApplication.bean.RegisterResponse;
import com.bharat.CurdApplication.service.RegisterService;


/**
 * @author Bharatkumar
 *
 */
@RestController
@RequestMapping("registerController")
public class RegisterController {

	
	@Autowired
	private RegisterService registerService;
	
	@PostMapping("/create-register")
	public RegisterResponse createRegister(@RequestBody Register register) {
		/*{
			
			"name":"Bharat Shriram",
			"mobileNo":"7276115482",
			"emailId":"bhrtsriram@gmail.com",
			"address":"Nanded"
			
		}*/
		return registerService.createRegister(register);
	}
	
	@PostMapping("/edit-register")
	public RegisterResponse editRegister(@RequestBody Register register) {
		return registerService.editRegister(register);
	}
	
	@GetMapping("/delete-register/{id}/{calcelationReason}")
	public RegisterResponse deleteRegister(@RequestParam Long id, @RequestParam String calcelationReason) {
		return registerService.deleteRegister(id,calcelationReason);
	}
	
	@GetMapping("/show-all-register")
	public List<RegisterModel> showAllRegister() {
		return registerService.showAllRegister();
	}
}
