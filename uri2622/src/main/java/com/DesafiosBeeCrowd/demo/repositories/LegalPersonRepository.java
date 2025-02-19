package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.LegalPersonMinDTO;
import com.DesafiosBeeCrowd.demo.entities.LegalPerson;
import com.DesafiosBeeCrowd.demo.projections.LegalPersonMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LegalPersonRepository extends JpaRepository<LegalPerson, Long> {

    @Query(nativeQuery = true, value = "SELECT customers.name AS customerName FROM legal_person " +
            "JOIN customers ON customers.id = legal_person.id_customers")
    List<LegalPersonMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.LegalPersonMinDTO(obj.customer.name) " +
            "FROM LegalPerson obj ")
    List<LegalPersonMinDTO> search2();
}
