package com.noahv.contentcalendar;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		ConfigurableApplicationContext context  = SpringApplication.run(Application.class, args);
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		SpringApplication.run(Application.class, args);
	}

}
