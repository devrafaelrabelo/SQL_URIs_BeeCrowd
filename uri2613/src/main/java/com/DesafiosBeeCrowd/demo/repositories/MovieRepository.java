package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.MovieMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Movie;
import com.DesafiosBeeCrowd.demo.projections.MovieMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(nativeQuery = true, value = "SELECT movies.id, movies.name FROM movies " +
            "INNER JOIN prices on movies.id_prices = prices.id " +
            "WHERE prices.value < 2")
    List<MovieMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.MovieMinDTO(obj.id, obj.name) " +
            "FROM Movie obj " +
            "JOIN obj.price p " +
            "WHERE p.value < 2")
    List<MovieMinDTO> search2();
}
