package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.LeagueMinDTO;
import com.DesafiosBeeCrowd.demo.projections.LeagueMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.LeagueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private LeagueRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<LeagueMinProjection> list = repository.search1();
		List<LeagueMinDTO> result = list.stream().map(LeagueMinDTO::new).toList();

		for (LeagueMinDTO obj : result) {
			System.out.println(obj);
		}
	}
}
