package com.example.imdb;

import java.io.PrintStream;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.imdb.config.DatabaseConfig;
import com.example.imdb.repository.MovieRepository;

/**
 * 
 * @author tnagihanbolukbas
 *
 */
public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext container = new AnnotationConfigApplicationContext(DatabaseConfig.class);
		MovieRepository repo = container.getBean(MovieRepository.class);
        repo.findById(1).ifPresent(System.out::println());
		container.close();
	}

	private static PrintStream println() {
		// TODO Auto-generated method stub
		return null;
	}
}
