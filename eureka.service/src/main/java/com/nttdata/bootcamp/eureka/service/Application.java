package com.nttdata.bootcamp.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Ejercicio 1 Microservicios
 *
 * EurekaServer
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
