package com.wedding.website.weddingwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ConfigurationProperties
public class WeddingWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeddingWebAppApplication.class, args);
	}

}
