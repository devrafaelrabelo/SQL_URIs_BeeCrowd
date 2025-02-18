package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT providers.name AS providerName, products.name " +
            "FROM products " +
            "INNER JOIN providers ON products.id_providers = providers.id " +
            "WHERE id_categories = :number")
    List<ProductMinProjection> search1(Integer number);

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name, obj.provider.name) " +
            "FROM Product obj " +
            "WHERE obj.category.id = :number")
    List<ProductMinDTO> search2(Integer number);
}
