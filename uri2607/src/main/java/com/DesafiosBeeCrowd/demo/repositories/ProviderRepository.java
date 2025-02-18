package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProviderMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Provider;
import com.DesafiosBeeCrowd.demo.projections.ProviderMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProviderRepository extends JpaRepository<Provider, Long> {

    @Query(nativeQuery = true, value = "SELECT city FROM providers " +
            "ORDER BY city ASC")
    List<ProviderMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProviderMinDTO(obj.city) " +
            "FROM Provider obj " +
            "ORDER BY city ASC")
    List<ProviderMinDTO> search2();
}
