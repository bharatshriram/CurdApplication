/**
 * 
 */
package com.bharat.CurdApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bharat.CurdApplication.Model.RegisterModel;


/**
 * @author Bharatkumar
 *
 */
@Repository
public interface RegisterRepository extends JpaRepository<RegisterModel, Long> {

	RegisterModel findByNameAndMobileNo(String name, String mobileNo);

}
