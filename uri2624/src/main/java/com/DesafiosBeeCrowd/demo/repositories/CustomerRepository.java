package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Customer;
import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(nativeQuery = true, value = "SELECT COUNT(DISTINCT city ) FROM customers")
    List<CustomerMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO(COUNT(DISTINCT obj.city)) " +
            "FROM Customer obj")
    List<CustomerMinDTO> search2();
}
