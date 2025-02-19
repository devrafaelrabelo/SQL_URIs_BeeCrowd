package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.LegalPersonMinDTO;
import com.DesafiosBeeCrowd.demo.projections.LegalPersonMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.LegalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private LegalPersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<LegalPersonMinProjection> list = repository.search1();
		List<LegalPersonMinDTO> result1 = list.stream().map(LegalPersonMinDTO::new).toList();

		for (LegalPersonMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<LegalPersonMinDTO> result2 = repository.search2();

		for (LegalPersonMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
