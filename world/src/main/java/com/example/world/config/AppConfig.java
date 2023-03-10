package com.example.world.config;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Scope;

import com.example.world.dao.CountryDao;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@Configuration
@ComponentScan(basePackages= {
		"com.example.world.dao",
		"com.example.world.service"
}
,excludeFilters = {
		@Filter(type = FilterType.ANNOTATION,classes = {Service.class})
}
)
public class AppConfig {
	@Autowired private CountryDao countryDao;
	
   @Bean("continents")
   @Scope("singleton")
   public Set<String> getContinents(){
	   return countryDao.getAllContinents();
	   
   }
}
