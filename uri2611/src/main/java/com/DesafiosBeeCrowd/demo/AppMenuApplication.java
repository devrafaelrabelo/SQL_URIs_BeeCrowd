package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.MovieMinDTO;
import com.DesafiosBeeCrowd.demo.projection.MovieMinProjection;
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
		List<MovieMinProjection> list = repository.search1("Action");
		List<MovieMinDTO> result1 = list.stream().map(MovieMinDTO::new).toList();

		for(MovieMinDTO obj : result1) {
			System.out.println(obj);
		}


		List<MovieMinDTO> result2 = repository.search2("Action");
		for(MovieMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
