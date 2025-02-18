package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.CategorySumDTO;
import com.DesafiosBeeCrowd.demo.projections.CategorySumProjection;
import com.DesafiosBeeCrowd.demo.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<CategorySumProjection> list = repository.search1();
		List<CategorySumDTO> result1 = list.stream().map(CategorySumDTO::new).toList();

		for (CategorySumDTO obj : result1) {
			System.out.println(obj);
		}


		System.out.println("JPQL");
		List<CategorySumDTO> result2 = repository.search2();

		for (CategorySumDTO obj : result1) {
			System.out.println(obj);
		}
	}
}
