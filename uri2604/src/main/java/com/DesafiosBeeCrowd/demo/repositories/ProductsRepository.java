package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.ProductsMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Products;
import com.DesafiosBeeCrowd.demo.projections.ProductsMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Products, Long> {

    @Query(nativeQuery = true, value = "SELECT id, name FROM products WHERE price < :min OR price > :max")
    List<ProductsMinProjection> search1(Integer min, Integer max);

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.ProductsMinDTO(obj.id, obj.name) " +
            "FROM Products obj " +
            "WHERE price < :min OR price > :max")
    List<ProductsMinDTO> search2(Integer min, Integer max);
}
