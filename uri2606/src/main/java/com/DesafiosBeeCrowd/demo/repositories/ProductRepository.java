package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projection.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT products.id, products.name from products " +
            "INNER JOIN categories ON products.id_categories = categories.id " +
            "WHERE categories.name LIKE CONCAT(:state, '%')")
    List<ProductMinProjection> search1(String state);

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.id, obj.name) " +
            "FROM Product obj " +
            "JOIN obj.category c " +
            "WHERE c.name LIKE CONCAT(:state, '%')")
    List<ProductMinDTO> search2(String state);
}
