package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO;
import com.DesafiosBeeCrowd.demo.entitites.Customer;
import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT name, street FROM customers WHERE city = :state")
    List<CustomerMinProjection> search1(String state);

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO(obj.name, obj.street) " +
            "FROM Customer obj " +
            "WHERE obj.city = :state")
    List<CustomerMinDTO> search2(String state);
}
