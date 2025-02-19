package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Customer;
import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query(nativeQuery = true, value = "SELECT id, name FROM customers " +
            "WHERE customers.id NOT IN( " +
            "   SELECT locations.id_customers " +
            "   FROM locations " +
            "   WHERE locations.id_customers = customers.id " +
            ") " +
            "ORDER BY customers.id ASC")
    List<CustomerMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO(obj.id, obj.name) " +
            "FROM Customer obj " +
            "WHERE obj.id NOT IN( " +
            "    SELECT l.customer.id " +
            "    FROM Location l " +
            "    WHERE l.customer.id = obj.id " +
            ") " +
            "ORDER BY obj.id ASC")
    List<CustomerMinDTO> search2();
}
