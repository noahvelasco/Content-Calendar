package com.noahv.contentcalendar;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.noahv.contentcalendar.model.Content;
import com.noahv.contentcalendar.model.Status;
import com.noahv.contentcalendar.model.Type;
import com.noahv.contentcalendar.repository.ContentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// ConfigurableApplicationContext context =
		// SpringApplication.run(Application.class, args);
		// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository) {
		return args -> {
			// insert data into the database
			Content content = new Content(null, "zzz", "zzz", Status.IDEA, Type.ARTICLE,
					LocalDateTime.now(), null, "");

			repository.save(content);
		};
	}

}
