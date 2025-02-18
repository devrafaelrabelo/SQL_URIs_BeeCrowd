package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entitites.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "Select Max(price) AS priceMax, Min(price) AS priceMin from products")
    List<ProductMinProjection> search1();

    @Query("Select new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(MAX(obj.price), MIN(obj.price)) " +
            "from Product obj")
    List<ProductMinDTO> search2();


}
