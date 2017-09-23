package com.lea.mobilerest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
        log.error("NOT_FOUND");
		SpringApplication.run(Application.class, args);
	}
}