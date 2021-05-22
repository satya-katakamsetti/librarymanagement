package com.lms.squad4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication(scanBasePackages={
"com.lms.squad4.config","com.lms.squad4.serviceImpl","com.lms.squad4.repositoryImpl"})
public class Squad4Application {

	public static void main(String[] args) {
		SpringApplication.run(Squad4Application.class, args);
	}

}
