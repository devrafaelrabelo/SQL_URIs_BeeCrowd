package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.ProductsMinDTO;
import com.DesafiosBeeCrowd.demo.projections.ProductsMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {
	@Autowired
	private ProductsRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("SQL");
		List<ProductsMinProjection> result1 = repository.search1(10, 100);

		for (ProductsMinProjection obj : result1) {
			System.out.println(obj.getId() + " | " + obj.getName());
		}

		System.out.println("JPQL");
		List<ProductsMinDTO> result2 = repository.search2(10, 100);

		for (ProductsMinDTO obj : result2) {
			System.out.println(obj);
		}

	}
}
