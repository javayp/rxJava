package com.rx.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.rx")
public class RxJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RxJavaApplication.class, args);
	}
}
