package com.semicolonAfrica.SemiColonNetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SemiColonNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemiColonNetworkApplication.class, args);
	}

}
