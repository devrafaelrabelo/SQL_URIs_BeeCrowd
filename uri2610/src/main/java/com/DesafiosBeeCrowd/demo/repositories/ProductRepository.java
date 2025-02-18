package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "select ROUND(AVG(price),2) AS price FROM products")
    List<ProductMinProjection> search1();

    @Query("select new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(ROUND(AVG(obj.price),2)) " +
            "FROM Product obj")
    List<ProductMinDTO> search2();
}
