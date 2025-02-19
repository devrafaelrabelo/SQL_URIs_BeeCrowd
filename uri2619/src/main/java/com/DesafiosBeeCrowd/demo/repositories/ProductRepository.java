package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT products.name AS productName, providers.name AS providerName, products.price AS productPrice FROM products " +
            "JOIN providers ON providers.id = products.id_providers " +
            "JOIN categories ON categories.id = products.id_categories " +
            "WHERE products.price > 1000 AND categories.name = 'Super Luxury'")
    List<ProductMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name, obj.provider.name, obj.price) " +
            "FROM Product obj " +
            "WHERE obj.price > 1000 AND obj.category.name = 'Super Luxury'")
    List<ProductMinDTO> search2();
}
