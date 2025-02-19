package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.ProductMinDTO;
import com.DesafiosBeeCrowd.demo.projection.ProductMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("SQL");
		List<ProductMinProjection> list = repository.search1(10,20, "p");
		List<ProductMinDTO> result1 = list.stream().map(ProductMinDTO::new).toList();

		for(ProductMinDTO obj : result1) {
			System.out.println(obj);
		}


		System.out.println("JPQL");
		List<ProductMinDTO> result2 = repository.search2(10, 20, "P");
		for(ProductMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
