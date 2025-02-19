package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.OrderMinDTO;
import com.DesafiosBeeCrowd.demo.projections.OrderMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private OrderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<OrderMinProjection> list = repository.search1();
		List<OrderMinDTO> result1 = list.stream().map(OrderMinDTO::new).toList();

		for (OrderMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<OrderMinDTO> result2 = repository.search2();

		for (OrderMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
