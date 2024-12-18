package com.ex.LifeLine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LifeLineApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeLineApplication.class, args);
	}

}
