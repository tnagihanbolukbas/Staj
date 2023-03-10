package com.example.world;

import java.util.Arrays;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.world.config.AppConfig;
import com.example.world.dao.CityDao;
import com.example.world.dao.CountryDao;
import com.example.world.dao.WorldDao;
import com.example.world.domain.City;
import com.example.world.domain.Country;

public class App {
	public static void main(String[] args) {
		try (ConfigurableApplicationContext container = 
				new AnnotationConfigApplicationContext(AppConfig.class)) 
		{ 
			CountryDao countryDao = 
					container.getBean(CountryDao.class);
			CityDao cityDao = container.getBean(CityDao.class);
			countryDao.findCountriesByContinent("Asia")
			          .stream()
			          .map(Country::getName)
			          .forEach(System.err::println);
			System.err.println(countryDao.getClass());
			System.err.println(cityDao.getClass());
			cityDao.findCitiesByCountryCode("NLD")
			       .stream()
			       .map(City::getName)
			       .forEach(System.err::println);
			System.err.println("=======================");
			Map<String,Object> components =
					container.getBeansOfType(Object.class);
			components.forEach((id,comp)->{
				System.err.println(
						String.format("%s: %s", 
								id,comp.getClass()
								       .getName()));
			});
			System.err.println(Arrays.toString(container.getAliases("elma")));
		WorldDao worldDao =	container.getBean("apple",WorldDao.class);
		
			worldDao.getAllContinents().forEach(System.err::println);	       


		}
	}
}
