package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import java.net.Socket;
import java.io.*;

@SpringBootApplication
@EnableHystrix
public class HystrixApplication {

	public static void main(String[] args) throws IOException {

  String ip = "192.168.12.42"; // Noncompliant
     Socket socket = new Socket(ip, 6667);
		SpringApplication.run(HystrixApplication.class, args);
		System.out.println("Hello World!!");
	}

}

