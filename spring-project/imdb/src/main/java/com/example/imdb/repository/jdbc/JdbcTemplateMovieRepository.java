package com.example.imdb.repository.jdbc;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.imdb.entity.Movie;
import com.example.imdb.repository.MovieRepository;

/**
 * 
 * @author tnagihanbolukbas
 *
 */
@Repository
public class JdbcTemplateMovieRepository implements MovieRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<Movie> findOneById(Integer id) {
		Movie movie = jdbcTemplate.queryForObject(SELECT_MOVIE_BY_ID,
				new BeanPropertyRowMapper<Movie>(Movie.class),
				new Object[] { id });
		return Optional.ofNullable(movie);
	}

	@Override
	public List<Movie> findAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Movie save(Movie e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie update(Movie e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> removeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> remove(Movie e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Movie> findAllByYearBetween(int from, int to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MovieRepository findOneById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ifPresent(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ifPresent(MovieRepository movieRepository) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MovieRepository findById(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
