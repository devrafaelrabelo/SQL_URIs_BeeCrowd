package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.ScoreMinDTO;
import com.DesafiosBeeCrowd.demo.projections.ScoreMinProjections;
import com.DesafiosBeeCrowd.demo.repositories.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private ScoreRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<ScoreMinProjections> list = repository.search1();
		List<ScoreMinDTO> result1 = list.stream().map(ScoreMinDTO::new).toList();

		for (ScoreMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<ScoreMinDTO> result2 = repository.search2();

		for (ScoreMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
