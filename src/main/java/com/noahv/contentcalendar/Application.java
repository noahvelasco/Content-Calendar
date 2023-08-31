package com.noahv.contentcalendar;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.noahv.contentcalendar.config.ContentCalendarProperties;
import com.noahv.contentcalendar.model.Content;
import com.noahv.contentcalendar.model.Status;
import com.noahv.contentcalendar.model.Type;
import com.noahv.contentcalendar.repository.ContentRepository;

@EnableConfigurationProperties(ContentCalendarProperties.class)
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
}
