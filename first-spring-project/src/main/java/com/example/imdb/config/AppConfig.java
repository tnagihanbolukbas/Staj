package com.example.imdb.config;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.example.imdb.service.Calculator;
import com.example.imdb.service.business.BusinessComponent;

@Configuration
@ComponentScan({ "com.example.imdb.service.business",
	             "com.example.imdb.config",
                 "com.example.imdb.aspect"})

@PropertySource("classpath:database.properties")
@ImportResource({ "classpath:beans.xml" })
@EnableAspectJAutoProxy
//@Import({
//	AnotherConfig.class
//})
public class AppConfig {
	@Value("${database.hostname}")
	private String hostName;
	@Value("${database.port}")
	private int port;
	@Autowired
	private List<Calculator> calculators;
	@Autowired
	private Map<String,Calculator> mapCalculators;
	
	

	@PostConstruct
	public void init() {
		System.err.println(hostName + ":" + port);
		calculators.forEach(calc -> System.out.println(calc.getClass()));
		mapCalculators.forEach((id,calc)->System.out.println(id+":"+calc.getClass()));
	}

	@Bean
	public BusinessComponent businessComponent (List<Calculator> calculators) {
		return new BusinessComponent(calculators);

	}
	
	}
	

