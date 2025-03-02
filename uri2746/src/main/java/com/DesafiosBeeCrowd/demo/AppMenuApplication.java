package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.VirusMinDTO;
import com.DesafiosBeeCrowd.demo.projections.VirusMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.VirusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private VirusRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<VirusMinProjection> list = repository.search1();
		List<VirusMinDTO> result1 = list.stream().map(VirusMinDTO::new).toList();

		for (VirusMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<VirusMinDTO> result2 = repository.search2();

		for (VirusMinDTO obj : result1) {
			System.out.println(obj);
		}
	}
}
