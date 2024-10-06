package com.iu.teschner.geisternetze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan ("com.iu.teschner.geisternetze")
public class GeisternetzeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeisternetzeApplication.class, args);
	}

}
