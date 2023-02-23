package com.example.imdb.service.business;

import java.util.concurrent.TimeUnit;

import com.example.imdb.aspect.Profile;
import com.example.imdb.service.Calculator;

public class CalculatorService implements Calculator {

	@Override
	@Profile(unit = TimeUnit.MILLISECONDS)
	public double power(double x, double y) {
		System.err.println("CalculatorService::power()is running...");
		return Math.pow(x, y);
	}

}
