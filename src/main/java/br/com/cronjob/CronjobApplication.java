package br.com.cronjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class CronjobApplication {

	public static void main(String[] args) {
		SpringApplication.run(CronjobApplication.class, args);
	}

}
