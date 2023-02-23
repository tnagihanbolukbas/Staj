package com.example.imdb.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.imdb.service.Calculator;
import com.example.imdb.service.CalculatorQualifier;
import com.example.imdb.service.CalculatorType;
import com.example.imdb.service.MovieService;
import com.example.imdb.service.SequenceService;
import com.example.imdb.service.business.CalculatorService;

@Configuration
public class AnotherConfig {
	@Autowired
	private List<Calculator> calculators;
	@Autowired
	private MovieService movieSrv1;
	@Bean   ("simpleCalc")
	@Scope("prototype")
	@Lazy
	@CalculatorQualifier(CalculatorType.SIMPLE)
	public Calculator calculator(SequenceService seqSrv,MovieService movieSrv2) {
		System.err.println(seqSrv.nextId("test-sequence"));
		System.err.println(movieSrv1.findMovieById(1));
		System.err.println(movieSrv2.findMovieById(1));

		return new CalculatorService();
	}
	public List<Calculator> getCalculators() {
		return calculators;
	}
	public void setCalculators(List<Calculator> calculators) {
		this.calculators = calculators;
	}

}
