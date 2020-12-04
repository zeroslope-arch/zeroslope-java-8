package com.zeroslope.api.config;

import com.zeroslope.domain.repositories.SampleRepository;
import com.zeroslope.domain.services.SampleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class BeanConfig {

	@Autowired
	private Environment environment;

	@Bean 
	public SampleRepository sampleRepository(){
		String connectionString = environment.getProperty("spring.datasource.url");
		return new SampleRepository(connectionString);
    }
    
    @Bean 
	public SampleService sampleService(){
		return new SampleService();
	}

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

}