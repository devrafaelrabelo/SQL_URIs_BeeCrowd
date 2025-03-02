package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.LifeRegistryMinDTO;
import com.DesafiosBeeCrowd.demo.entities.LifeRegistry;
import com.DesafiosBeeCrowd.demo.projections.LifeRegistryMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LifeRegistryRepository extends JpaRepository<LifeRegistry, Long> {

    @Query(nativeQuery = true, value = "SELECT life_registry.name, ROUND((omega * 1.618), 3) AS FatorN " +
            "FROM life_registry " +
            "INNER JOIN dimensions on life_registry.dimensions_id = dimensions.id " +
            "WHERE dimensions.name in ('C875', 'C774') AND life_registry.name LIKE '%Richard%' " +
            "ORDER BY life_registry.omega ASC")
    List<LifeRegistryMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.LifeRegistryMinDTO(obj.name, ROUND((obj.omega * 1.618), 3) AS FatorN) " +
            "FROM LifeRegistry obj " +
            "WHERE obj.dimension.name in ('C875', 'C774') AND obj.name LIKE '%Richard%' " +
            "ORDER BY obj.omega ASC")
    List<LifeRegistryMinDTO> search2();
}
