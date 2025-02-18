package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.RentalMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Rental;
import com.DesafiosBeeCrowd.demo.projections.RentalMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RentalRepository extends JpaRepository<Rental, Long> {

    @Query(nativeQuery = true, value = "SELECT customers.name,rentals.rentals_date  FROM rentals " +
            "JOIN customers ON customers.id = rentals.id_customers " +
            "WHERE extract(month from rentals.rentals_date) = 9")
    List<RentalMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.RentalMinDTO(obj.customer.name, obj.rentals_date) " +
            "FROM Rental obj " +
            "WHERE extract(month from obj.rentals_date) = 9")
    List<RentalMinDTO> search2();
}

