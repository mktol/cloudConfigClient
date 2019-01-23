package com.sample.cleint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Value("${sample.var}")
	private String tst;
	@Bean
	public CommandLineRunner commandLineRunner(SimpleSerivce simpleSerivce){
		return args -> {
			System.out.println(simpleSerivce.getName());
			System.out.println(tst+" Maks");
		};
	}


}
