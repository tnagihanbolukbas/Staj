package com.example.imdb.service.business;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.imdb.service.Calculator;
import com.example.imdb.service.CalculatorQualifier;
import com.example.imdb.service.CalculatorType;

@Service
public class CalculatorClient {
	@Autowired 
	@CalculatorQualifier(CalculatorType.COMPLEX)
	private Calculator calc;
	
	@PostConstruct
	public void init() {
		System.err.println(calc.getClass().getSimpleName());
	}
	
	

}
