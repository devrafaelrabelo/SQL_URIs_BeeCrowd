package com.DesafiosBeeCrowd.demo;

import com.DesafiosBeeCrowd.demo.dto.AccountMinDTO;
import com.DesafiosBeeCrowd.demo.projections.AccountMinProjection;
import com.DesafiosBeeCrowd.demo.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AppMenuApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AppMenuApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("SQL");
		List<AccountMinProjection> list = repository.search1();
		List<AccountMinDTO> result1 = list.stream().map(AccountMinDTO::new).toList();

		for (AccountMinDTO obj : result1) {
			System.out.println(obj);
		}


		System.out.println("JPQL");
		List<AccountMinDTO> result2 = repository.search2();

		for (AccountMinDTO obj : result1) {
			System.out.println(obj);
		}
	}
}
