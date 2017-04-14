package com.ttadvance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.ttadvance"})
public class TTAdvanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TTAdvanceApplication.class, args);
	}
}
