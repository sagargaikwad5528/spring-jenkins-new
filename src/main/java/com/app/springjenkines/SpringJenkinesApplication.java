package com.app.springjenkines;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkinesApplication {
	
	public static  Logger logger=LoggerFactory.getLogger(SpringJenkinesApplication.class);
	
	
	public void init() {
		logger.info("Application started......");
	}

	public static void main(String[] args) {
		logger.info("Application executed......");
		SpringApplication.run(SpringJenkinesApplication.class, args);
	}

}
