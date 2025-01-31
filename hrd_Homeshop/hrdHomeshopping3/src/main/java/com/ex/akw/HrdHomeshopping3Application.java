package com.ex.akw;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HrdHomeshopping3Application {

	public static void main(String[] args) {
		SpringApplication.run(HrdHomeshopping3Application.class, args);
	}

	private static final Logger logger = LoggerFactory.getLogger(HrdHomeshopping3Application.class);
	
	@Bean
	CommandLineRunner testDBCon(DataSource dataSource) {
		return arg -> {
			try {
				dataSource.getConnection().close();
				logger.info("^^^^^ DB 연결 성공 ^^^^^");
			} catch (Exception e) {
				// TODO: handle exception
				logger.error("ㅠㅠㅠㅠㅠ DB 연결 실패 ㅠㅠㅠㅠㅠ", e);
			}
		};
	}
}
