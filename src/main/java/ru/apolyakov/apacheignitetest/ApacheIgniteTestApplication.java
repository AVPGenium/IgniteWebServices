package ru.apolyakov.apacheignitetest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableCaching
public class ApacheIgniteTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheIgniteTestApplication.class, args);
	}

}
