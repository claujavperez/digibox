package com.digibox.Evaluation.cjp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * 
 * @author Claudio J.Perez
 *
 */

@SpringBootApplication
@EnableSwagger2
public class CjpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjpApplication.class, args);
	}
}


