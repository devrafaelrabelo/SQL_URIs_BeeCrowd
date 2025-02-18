package com.DesafiosBeeCrowd.demo.repositories;

import com.DesafiosBeeCrowd.demo.dto.CategorySumDTO;
import com.DesafiosBeeCrowd.demo.entities.Category;
import com.DesafiosBeeCrowd.demo.projections.CategorySumProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query(nativeQuery = true, value = "SELECT categories.name, SUM(products.amount) FROM products " +
            "INNER JOIN categories ON products.id_categories = categories.id " +
            "GROUP BY categories.name ")
    List<CategorySumProjection> search1();

    @Query("SELECT new com.DesafiosBeeCrowd.demo.dto.CategorySumDTO(c.name, SUM(obj.amount)) " +
            "FROM Product obj " +
            "JOIN obj.category c " +
            "GROUP BY c.name ")
    List<CategorySumDTO> search2();
}
