package com.mydiarySpringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages="com.mydiarySpringboot.controller")
public class MydiaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MydiaryApplication.class, args);
	}

}
