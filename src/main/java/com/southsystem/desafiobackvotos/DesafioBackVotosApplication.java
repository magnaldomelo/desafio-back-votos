package com.southsystem.desafiobackvotos;

import com.google.gson.Gson;
import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class DesafioBackVotosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioBackVotosApplication.class, args);
	}

	@Bean
	public Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}

	@Bean
	public Gson gson() {
		return new Gson();
	}
}
