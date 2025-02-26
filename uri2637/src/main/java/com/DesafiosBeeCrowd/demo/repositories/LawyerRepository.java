package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.entities.Lawyer;
import com.DesafiosBeeCrowd.demo.projections.LawyerMinProjections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LawyerRepository extends JpaRepository<Lawyer, Long> {


    @Query(nativeQuery = true, value = "(SELECT name, customers_number " +
            "FROM lawyers " +
            "ORDER BY customers_number ASC " +
            "LIMIT 1) " +
            "UNION ALL " +
            "(SELECT name, customers_number " +
            "FROM lawyers " +
                "WHERE customers_number = (" +
                "SELECT MAX(customers_number) " +
                "FROM lawyers)) " +
            "UNION ALL " +
            "(SELECT 'Average', ROUND(AVG(customers_number),0) " +
            "FROM lawyers)")
    List<LawyerMinProjections> search1();
}
