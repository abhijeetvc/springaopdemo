package com.aopdemo.springaopdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringaopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringaopdemoApplication.class, args);
	}

}
