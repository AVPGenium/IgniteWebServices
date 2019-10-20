package ru.apolyakov.ignite.text_processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@EnableCaching
@ComponentScan("ru.apolyakov.ignite.text_processor.config")
public class TextProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TextProcessorApplication.class, args);
	}

}
