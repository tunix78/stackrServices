package com.stackr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class StackrservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StackrservicesApplication.class, args);
	}

}
