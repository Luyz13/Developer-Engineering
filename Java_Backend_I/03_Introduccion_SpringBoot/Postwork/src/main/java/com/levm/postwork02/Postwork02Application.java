package com.levm.postwork02;

import com.levm.postwork02.entity.Persona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

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
		Persona persona = null;
		String nombre,telefono;
		Scanner entrada = new Scanner( System.in);
		System.out.println("\tRegistro de Personas:");
		System.out.println("Ingresa el nombre ");
		nombre=entrada.nextLine();
		System.out.println("Ingresa el numero telefonico:");
		telefono=entrada.nextLine();
		persona = new Persona(nombre,telefono);
		System.out.println(persona.toString());
	}
}
