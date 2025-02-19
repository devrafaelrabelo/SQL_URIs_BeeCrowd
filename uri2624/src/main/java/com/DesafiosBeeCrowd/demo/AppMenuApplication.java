package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.CustomerMinDTO;
import com.DesafiosBeeCrowd.demo.projections.CustomerMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<CustomerMinProjection> list = repository.search1();
		List<CustomerMinDTO> result1 = list.stream().map(CustomerMinDTO::new).toList();

		for (CustomerMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<CustomerMinDTO> result2 = repository.search2();

		for (CustomerMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
