package com.DesafiosBeeCrowd.demo.repositories;

import java.util.List;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Product;
import com.DesafiosBeeCrowd.demo.projection.ProductMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query(nativeQuery = true, value = "select products.name "
			+ "from products "
			+ "INNER JOIN providers ON products.id_providers = providers.id "
			+ "WHERE products.amount BETWEEN :min AND :max "
			+ "AND providers.name ILIKE CONCAT(:beginName, '%')")
	List<ProductMinProjection> search1(Integer min, Integer max, String beginName );
	
	@Query("select new com.DesafiosBeeCrowd.demo.dto.ProductMinDTO(obj.name) "
			+ "from Product obj "
			+ "WHERE obj.amount BETWEEN :min AND :max "
			+ "AND obj.provider.name LIKE CONCAT(:beginName, '%')")
	List<ProductMinDTO> search2(Integer min, Integer max, String beginName );

}