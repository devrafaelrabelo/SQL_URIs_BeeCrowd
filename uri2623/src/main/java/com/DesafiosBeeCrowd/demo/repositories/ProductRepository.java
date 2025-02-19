package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT products.name AS productName, categories.name AS categoryName FROM products " +
            "JOIN categories ON categories.id = products.id_categories " +
            "WHERE products.amount > 100  AND products.id_categories IN (1,2,3,6,9) " +
            "ORDER BY categories.id ASC")
    List<ProductMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name, obj.category.name) " +
            "FROM Product obj " +
            "WHERE obj.amount > 100  AND obj.category.id IN (1,2,3,6,9) " +
            "ORDER BY obj.category.id ASC")
    List<ProductMinDTO> search2();

}
