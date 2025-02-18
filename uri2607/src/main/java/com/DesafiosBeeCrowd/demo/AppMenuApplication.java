package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.ProviderMinDTO;
import com.DesafiosBeeCrowd.demo.projections.ProviderMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private ProviderRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<ProviderMinProjection> list = repository.search1();
		List<ProviderMinDTO> result1 = list.stream().map(ProviderMinDTO::new).toList();

		for (ProviderMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<ProviderMinDTO> result2 = repository.search2();

		for (ProviderMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
