package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookMyShowApplication {
	
	public void m1()
	{
		System.out.println("m1 method");
	}

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);
		System.out.println("hello world");
	}

}
