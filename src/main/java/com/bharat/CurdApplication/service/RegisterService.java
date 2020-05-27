/**
 * 
 */
package com.bharat.CurdApplication.service;

import java.util.List;

import com.bharat.CurdApplication.Model.RegisterModel;
import com.bharat.CurdApplication.bean.Register;
import com.bharat.CurdApplication.bean.RegisterResponse;

/**
 * @author Bharatkumar
 *
 */
public interface RegisterService {

	RegisterResponse createRegister(Register register);

	RegisterResponse editRegister(Register register);

	RegisterResponse deleteRegister(Long id, String calcelationReason);

	List<RegisterModel> showAllRegister();


}
