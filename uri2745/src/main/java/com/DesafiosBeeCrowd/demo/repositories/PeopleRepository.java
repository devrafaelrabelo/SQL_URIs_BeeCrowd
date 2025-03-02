package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.PeopleMinDTO;
import com.DesafiosBeeCrowd.demo.entities.People;
import com.DesafiosBeeCrowd.demo.projections.PeopleMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Long> {

    @Query(nativeQuery = true, value = "SELECT name, ROUND((salary * 0.1), 2) as tax " +
            "FROM people " +
            "WHERE people.salary > 3000")
    List<PeopleMinProjection> search1();


    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.PeopleMinDTO(obj.name, ROUND((obj.salary * 0.1), 2) as tax) " +
            "FROM People obj " +
            "WHERE obj.salary > 3000")
    List<PeopleMinDTO> search2();
}
