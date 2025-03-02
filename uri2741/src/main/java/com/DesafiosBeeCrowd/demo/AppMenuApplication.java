package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.StudentMinDTO;
import com.DesafiosBeeCrowd.demo.projections.StudentMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<StudentMinProjection> list = repository.search1();
		List<StudentMinDTO> result1 = list.stream().map(StudentMinDTO::new).toList();

		for (StudentMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<StudentMinDTO> result2 = repository.search2();

		for (StudentMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
