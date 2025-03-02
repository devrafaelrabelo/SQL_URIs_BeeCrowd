package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.LawyerMinDTO;
import com.DesafiosBeeCrowd.demo.projections.LawyerMinProjections;
import com.DesafiosBeeCrowd.demo.repositories.LawyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private LawyerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<LawyerMinProjections> list = repository.search1();
		List<LawyerMinDTO> result1 = list.stream().map(LawyerMinDTO::new).toList();

		for (LawyerMinDTO obj : result1) {
			System.out.println(obj);
		}
	}
}
