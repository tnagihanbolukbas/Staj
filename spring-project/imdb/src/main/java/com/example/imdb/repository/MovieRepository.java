package com.example.imdb.repository;

import java.util.Optional;
import java.util.stream.Stream;

import com.example.imdb.entity.Movie;

/**
 * 
 * @author tnagihanbolukbas
 *
 */
public interface MovieRepository extends CrudRepository<Movie, Integer> {
	String SELECT_MOVIE_BY_ID = 
			"SELECT MOVIEID,TITLE,YEAR,IMDB FROM MOVIES WHERE MOVIEID=?";

	Stream<Movie> findAllByYearBetween(int from, int to);

	MovieRepository findOneById(int i);

	@Override
	default Optional<Movie> findOneById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	} 

	void ifPresent(MovieRepository movieRepository
			);

	MovieRepository findById(int i);

		void ifPresent(Object movieRepository);






}
