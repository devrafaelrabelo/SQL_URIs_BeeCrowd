package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Customer;
import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	
	@Query(nativeQuery = true, value = "SELECT name FROM customers WHERE state= :state")
	List<CustomerMinProjection> search1(String state);

	@Query("SELECT new com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO(obj.name) " +
			"FROM Customer obj " +
			"WHERE obj.state = :state")
	List<CustomerMinDTO> search2(String state);
}
