package com.food.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.DispatcherServlet;

@ComponentScan(basePackages = "com.food.delivery.service")
@SpringBootApplication
public class FoodDeliveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDeliveryApplication.class, args);
	}
	
	@Bean
	public ServletRegistrationBean<DispatcherServlet> configureWebXml(DispatcherServlet dispatcherservlet){
		ServletRegistrationBean<DispatcherServlet> servlet = new ServletRegistrationBean<DispatcherServlet>(dispatcherservlet);
		servlet.addUrlMappings("/food/*");
		return servlet;	
		
	}

}
