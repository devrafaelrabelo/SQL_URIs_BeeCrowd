package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.MovieMinDTO;
import com.DesafiosBeeCrowd.demo.entities.Movie;
import com.DesafiosBeeCrowd.demo.projections.MovieMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {


	@Autowired
	private MovieRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<MovieMinProjection> list = repository.search1();
		List<MovieMinDTO> result1 = list.stream().map(MovieMinDTO::new).toList();

		for (MovieMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<MovieMinDTO> result2 = repository.search2();

		for (MovieMinDTO obj : result1) {
			System.out.println(obj);
		}

	}
}
