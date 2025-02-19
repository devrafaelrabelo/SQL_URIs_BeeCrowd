package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projections.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true,value = "SELECT products.name AS productName, providers.name AS providerName, categories.name AS categoryName FROM products " +
            "JOIN providers ON products.id_providers = providers.id " +
            "JOIN categories ON products.id_categories = categories.id " +
            "WHERE providers.name = 'Sansul SA' AND categories.name = 'Imported'")
    List<ProductMinProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name, obj.provider.name, obj.category.name) " +
            "FROM Product obj " +
            "WHERE obj.provider.name = 'Sansul SA' AND obj.category.name = 'Imported'")
    List<ProductMinDTO> search2();
}
