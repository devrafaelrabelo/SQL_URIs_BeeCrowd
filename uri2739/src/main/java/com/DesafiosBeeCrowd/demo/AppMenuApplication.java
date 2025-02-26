package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.LoanMinDTO;
import com.DesafiosBeeCrowd.demo.projections.LoanMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private LoanRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		System.out.println("SQL");
		List<LoanMinProjection> list = repository.search1();
		List<LoanMinDTO> result1 = list.stream().map(LoanMinDTO::new).toList();
		for (LoanMinDTO obj : result1) {
			System.out.println(obj);
		}

		System.out.println("JPQL");
		List<LoanMinDTO> result2 = repository.search2();

		for (LoanMinDTO obj : result2) {
			System.out.println(obj);
		}
	}
}
