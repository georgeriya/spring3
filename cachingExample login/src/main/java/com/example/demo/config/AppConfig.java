package com.example.demo.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Payment;

@Configuration
@EnableCaching
public class AppConfig {

	@Bean
	public Payment ram() {
		return new Payment(202,"Ram",4500);
	}
	
	@Bean
	public Payment shyam() {
		return new Payment(203,"Shyam",5500);
	}
	
	@Bean
	public Payment magesh() {
		return new Payment(204,"Magesh",6500);
	}
}
