package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.VirusMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Virus;
import com.DesafiosBeeCrowd.demo.projections.VirusMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VirusRepository extends JpaRepository<Virus, Long> {

    @Query(nativeQuery = true, value = "SELECT REPLACE(name, 'H1', 'X') AS name " +
            "FROM virus")
    List<VirusMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.VirusMinDTO(REPLACE(obj.name, 'H1', 'X') AS name) " +
            "FROM Virus obj")
    List<VirusMinDTO> search2();
}
