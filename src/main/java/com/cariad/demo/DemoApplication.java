package com.cariad.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		BasicMath m = new BasicMath();
		int r = m.add(40, 2);
		System.out.println("the result is: " + r);
	}

}
