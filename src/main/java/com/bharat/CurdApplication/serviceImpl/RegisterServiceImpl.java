/**
 * 
 */
package com.bharat.CurdApplication.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharat.CurdApplication.Model.RegisterModel;
import com.bharat.CurdApplication.bean.Register;
import com.bharat.CurdApplication.bean.RegisterResponse;
import com.bharat.CurdApplication.repo.RegisterRepository;
import com.bharat.CurdApplication.service.RegisterService;

/**
 * @author Bharatkumar
 *
 */
@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	private RegisterRepository registerrepository;
	
	@Override
	public RegisterResponse createRegister(Register register) {
		
System.out.println("SS"+register.getAddress()+register.getEmailId()+register.getMobileNo()+register.getMobileNo());
		
		RegisterModel registermodel = null;
		RegisterResponse registerResponse = register.toValidateForCreateRegister();
		if (!registerResponse.isSuccess) {
			return registerResponse;
		} else {
			registermodel = registerrepository.findByNameAndMobileNo(
					register.getName(), register.getMobileNo());
		}

		if (registermodel != null) {
			return new RegisterResponse(Boolean.FALSE, "Found Duplicate Name, Mobile Number Already created");
		} else {
			registermodel = new RegisterModel();
		}
		BeanUtils.copyProperties(register, registermodel);
		try {
				registerrepository.save(registermodel);
			return new RegisterResponse(Boolean.TRUE, "Created Successfully");
		} catch (Exception e) {
			return new RegisterResponse(Boolean.FALSE, "Something went wrong, Internal server error");
		}
	}

	@Override
	public RegisterResponse editRegister(Register register) {
		// TODO Auto-generated method stub
		RegisterResponse registerResponse = register.toValidateForUpdateRegister();
		if (!registerResponse.isSuccess) {
			return registerResponse;
		}

		Optional<RegisterModel> registermodel = registerrepository.findById(register.getId());
		try {
			if (registermodel.isPresent()) {
				BeanUtils.copyProperties(register, registermodel);
				registerrepository.save(registermodel.get());
				return new RegisterResponse(Boolean.TRUE, "Edited Successfully");
			} else {
				return new RegisterResponse(Boolean.FALSE, "No Records found with the given Register id");
			}
		} catch (Exception e) {
			return new RegisterResponse(Boolean.FALSE, "Something went wrong, Internal server error");
		}
	}

	@Override
	public RegisterResponse deleteRegister(Long id, String calcelationReason) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RegisterModel> showAllRegister() {
		// TODO Auto-generated method stub
		return registerrepository.findAll();
	}

}
