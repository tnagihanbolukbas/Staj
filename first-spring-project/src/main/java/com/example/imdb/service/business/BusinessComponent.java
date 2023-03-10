package com.example.imdb.service.business;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import com.example.imdb.aspect.Profile;
import com.example.imdb.service.Calculator;

public class BusinessComponent {
private final List <Calculator> allCalculators;
private final AtomicLong counter = new AtomicLong(0);
private final int size;
public BusinessComponent(List<Calculator> allCalculators) {
	this.allCalculators = allCalculators;
	this.size= allCalculators.size();
}

@Profile(unit = TimeUnit.MICROSECONDS)
   public void fun(int i) {
	   long index = counter.getAndIncrement() % size;
	   System.err.println(i+":"+allCalculators.get((int)index).power(3,4));
   }
}
