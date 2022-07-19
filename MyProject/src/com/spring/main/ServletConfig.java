package com.spring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.spring.main.controller", "com.spring.main.service" ,"com.spring.main.model","com.spring.main.persistence"})
public class ServletConfig implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver view = new InternalResourceViewResolver();
		view.setPrefix("WEB-INF/jsps/");
		view.setSuffix(".jsp");
		return view;
	}

	@Bean
	public DriverManagerDataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/pget_june_main");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}

}
