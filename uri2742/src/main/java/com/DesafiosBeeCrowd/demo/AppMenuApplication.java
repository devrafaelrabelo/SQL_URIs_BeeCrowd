package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.LifeRegistryMinDTO;
import com.DesafiosBeeCrowd.demo.projections.LifeRegistryMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.LifeRegistryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private LifeRegistryRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<LifeRegistryMinProjection> list = repository.search1();
		List<LifeRegistryMinDTO> result1 = list.stream().map(LifeRegistryMinDTO::new).toList();

		for (LifeRegistryMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<LifeRegistryMinDTO> result2 = repository.search2();

		for (LifeRegistryMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
