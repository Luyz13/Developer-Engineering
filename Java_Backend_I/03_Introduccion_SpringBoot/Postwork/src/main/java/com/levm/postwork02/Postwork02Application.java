package com.levm.postwork02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Postwork02Application implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(Postwork02Application.class);

	public static void main(String[] args) {
		LOG.info("INICIA LA APLICACION");
		SpringApplication.run(Postwork02Application.class, args);
		LOG.info("FINALIZA LA APLICACION");
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Ejecutando desde la linea de comandos");
		System.out.println("Hola Mundo");
	}
}
