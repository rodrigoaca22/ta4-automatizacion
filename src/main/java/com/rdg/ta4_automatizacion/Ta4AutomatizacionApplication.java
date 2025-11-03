package com.rdg.ta4_automatizacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ta4AutomatizacionApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ta4AutomatizacionApplication.class, args);

		
	}

	public static int suma(int a, int b){ return a + b; }
  	public static int resta(int a, int b){ return a - b; }

}
