package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.PeopleMinDTO;
import com.DesafiosBeeCrowd.demo.projections.PeopleMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private PeopleRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<PeopleMinProjection> list = repository.search1();
		List<PeopleMinDTO> result1 = list.stream().map(PeopleMinDTO::new).toList();

		for (PeopleMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<PeopleMinDTO> result2 = repository.search2();

		for (PeopleMinDTO obj : result1) {
			System.out.println(obj);
		}

	}
}
