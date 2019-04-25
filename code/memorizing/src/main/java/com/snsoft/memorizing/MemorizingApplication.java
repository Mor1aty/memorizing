package com.snsoft.memorizing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="com.snsoft.memorizing.mapper")
@SpringBootApplication
public class MemorizingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemorizingApplication.class, args);
	}

}
