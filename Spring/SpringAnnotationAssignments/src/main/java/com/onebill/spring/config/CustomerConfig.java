package com.onebill.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.onebill.spring.bean.Customer;

@Configuration
public class CustomerConfig {
	
	@Bean
	public static  Customer getCustomer() {
		return new Customer();
	}
}
