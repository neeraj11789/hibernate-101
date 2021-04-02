package com.neeraj.hibernate101;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.neeraj.hibernate101.dao.StudentRepository;
import com.neeraj.hibernate101.domain.Student;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Hibernate101Application {

	public static void main(String[] args) {
		SpringApplication.run(Hibernate101Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(StudentRepository repository) {
		return (args) -> {
			// save a few customers
			repository.save(new Student("Jack", "Bauer"));
			repository.save(new Student("Chloe", "O'Brian"));
			repository.save(new Student("Kim", "Bauer"));
			repository.save(new Student("David", "Palmer"));
			repository.save(new Student("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Student customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			Student customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			log.info(customer.toString());
			log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Bauer").forEach(bauer -> {
				log.info(bauer.toString());
			});
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			//  log.info(bauer.toString());
			// }
			log.info("");
		};
	}

}
