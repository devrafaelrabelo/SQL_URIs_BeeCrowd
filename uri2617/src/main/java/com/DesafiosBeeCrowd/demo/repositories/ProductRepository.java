package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT products.name AS ProductName, providers.name AS ProviderName FROM products " +
            "JOIN providers ON providers.id = products.id_providers " +
            "WHERE providers.name = 'Ajax SA'")
    List<ProductMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name , obj.provider.name) " +
            "FROM Product obj " +
            "WHERE obj.provider.name = 'Ajax SA'")
    List<ProductMinDTO> search2();
}
