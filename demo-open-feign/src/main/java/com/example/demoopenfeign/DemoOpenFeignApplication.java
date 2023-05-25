package com.example.demoopenfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenFeignApplication.class, args);
	}

}
