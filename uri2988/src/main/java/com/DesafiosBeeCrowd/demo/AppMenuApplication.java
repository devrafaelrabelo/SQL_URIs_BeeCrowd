package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.MatchMinDTO;
import com.DesafiosBeeCrowd.demo.projections.MatchMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private MatchRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<MatchMinProjection> list = repository.search1();
		List<MatchMinDTO> result1 = list.stream().map(MatchMinDTO::new).toList();

		for (MatchMinDTO obj : result1) {
			System.out.println(obj);
		}
	}
}
