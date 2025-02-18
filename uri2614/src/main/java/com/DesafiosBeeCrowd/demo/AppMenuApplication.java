package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.RentalMinDTO;
import com.DesafiosBeeCrowd.demo.projections.RentalMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.RentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private RentalRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<RentalMinProjection> list = repository.search1();
		List<RentalMinDTO> result1 = list.stream().map(RentalMinDTO::new).toList();

		for (RentalMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<RentalMinDTO> result2 = repository.search2();

		for (RentalMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
