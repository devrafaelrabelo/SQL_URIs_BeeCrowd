package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.Projections.NaturalPersonMinProjection;
import com.DesafiosBeeCrowd.demo.dto.NaturalPersonMinDTO;
import com.DesafiosBeeCrowd.demo.repositories.NaturalPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private NaturalPersonRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("SQL");
		List<NaturalPersonMinProjection> list = repository.search1();
		List<NaturalPersonMinDTO> result1 = list.stream().map(NaturalPersonMinDTO::new).toList();

		for (NaturalPersonMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<NaturalPersonMinDTO> result2 = repository.search2();

		for (NaturalPersonMinDTO obj : result2) {
			System.out.println(obj);
		}


	}
}
