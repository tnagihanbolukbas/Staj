package com.example;

import java.util.stream.IntStream;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.imdb.config.AppConfig;
import com.example.imdb.service.Calculator;
import com.example.imdb.service.LotteryService;
import com.example.imdb.service.MovieService;
import com.example.imdb.service.PreciousService;
import com.example.imdb.service.business.BusinessComponent;

public class App {
	public static void main(String[] args) {
//		-Dspring.profiles.active=test
//		try-with-resources
		try (ConfigurableApplicationContext container =
//    new ClassPathXmlApplicationContext("spring-min-config.xml"))
				new AnnotationConfigApplicationContext(AppConfig.class)) {
//			MovieService movieSrv = container.getBean(MovieService.class);
//			movieSrv.findAllMoviesByYearRange(1970, 1979).forEach(System.out::println);
//			System.out.println("App: "+container.getBean(LotteryService.class).draw(1, 50, 6));
//			System.err.println("App: "+container.getBean("simpleCalc", Calculator.class).power(2, 10));
//			System.err.println("App: "+container.getBean("complexCalc", Calculator.class).power(2, 10));
//			System.err.println("App: "+container.getBean("complexCalc", Calculator.class).power(2, 10));
//			System.err.println("App: "+container.getBean("complexCalc", Calculator.class).power(2, 10));
//			System.err.println("App: "+container.getBean("complexCalc", Calculator.class).power(2, 10));
//			System.err.println("App: "+container.getBean(Calculator.class).power(2, 10));
//			BusinessComponent businesComp = container.getBean(BusinessComponent.class);
//			IntStream.range(0, 100).parallel().forEach(businesComp::fun);
//            Object o = container.getBean(BusinessComponent.class);
//            System.err.println(o.getClass());
//            Object p = container.getBean("complexCalc",Calculator.class);
//            System.err.println(p.getClass());
           PreciousService srv = container.getBean(PreciousService.class);
            System.err.println("App:: line 45 0 ==> "+srv.getClass());
            System.err.println(srv.run(42));

		}
		

// container.close()
	}

}
