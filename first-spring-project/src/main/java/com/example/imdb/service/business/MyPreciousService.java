package com.example.imdb.service.business;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.example.imdb.service.PreciousService;

@Service
public class MyPreciousService implements PreciousService {
	private PreciousService self;
	private boolean isSelfProxy;
	@Autowired
	private ApplicationContext container;

	@PostConstruct
	public void init() {
		self = container.getBean(PreciousService.class);
		isSelfProxy = this == self;
		System.err.println("MyPreciousService::init() ==> " + self.getClass());
		System.err.println("MyPreciousService::init() ==> isSelfProxy:" + isSelfProxy);

	}

	@Override
//	@Profile
	public int run(int i) {
		return i * self.sun(i);
	}

	@Override
//	@Profile
	public int sun(int i) {
		return i * i;
	}

}
