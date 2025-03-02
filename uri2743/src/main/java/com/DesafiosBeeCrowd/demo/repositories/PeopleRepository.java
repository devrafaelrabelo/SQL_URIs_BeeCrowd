package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.PeopleMinDTO;
import com.DesafiosBeeCrowd.demo.entities.People;
import com.DesafiosBeeCrowd.demo.projections.PeopleMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Long> {

    @Query(nativeQuery = true, value = "SELECT name, LENGTH(name) as length " +
            "FROM people " +
            "ORDER BY length DESC")
    List<PeopleMinProjection> search1();


    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.PeopleMinDTO(obj.name, LENGTH(obj.name) as length) " +
            "FROM People obj " +
            "ORDER BY length DESC")
    List<PeopleMinDTO> search2();
}
