package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.Projections.NaturalPersonMinProjection;
import com.DesafiosBeeCrowd.demo.dto.NaturalPersonMinDTO;
import com.DesafiosBeeCrowd.demo.entities.NaturalPerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NaturalPersonRepository extends JpaRepository<NaturalPerson, Long> {

    @Query(nativeQuery = true, value = "SELECT " +
            "    CONCAT( " +
            "        SUBSTRING(cpf, 1, 3), '.', " +
            "        SUBSTRING(cpf, 4, 3), '.', " +
            "        SUBSTRING(cpf, 7, 3), '-', " +
            "        SUBSTRING(cpf, 10, 2) " +
            "    ) AS cpf " +
            "FROM natural_person")
    List<NaturalPersonMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.NaturalPersonMinDTO(" +
            "CONCAT( SUBSTRING(cpf, 1, 3), '.', " +
                "SUBSTRING(cpf, 4, 3), '.', " +
                "SUBSTRING(cpf, 7, 3), '-', " +
                "SUBSTRING(cpf, 10, 2)) " +
                "AS cpf) " +
            "FROM NaturalPerson obj")
    List<NaturalPersonMinDTO> search2();
}
