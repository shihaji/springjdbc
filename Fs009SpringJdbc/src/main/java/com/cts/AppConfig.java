package com.cts;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/mydatabase");
		ds.setUsername("root");
		ds.setPassword("root");
			
		
		return ds;
		
	}
	
	@Bean
	public JdbcTemplate getTemplate() {
		
		return new JdbcTemplate(getDataSource());
		
	}
	

}
