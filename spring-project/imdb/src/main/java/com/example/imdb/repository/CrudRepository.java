package com.example.imdb.repository;

import java.util.List;
import java.util.Optional;

import com.example.imdb.entity.Movie;

/**
 * 
 * @author tnagihanbolukbas
 *
 */
public interface CrudRepository<E, K> {
	Optional<E> findOneById(K id);

	List<E> findAll(int pageNo, int pageSize);

	E save(E e);

	E update(E e);

	Optional<E> removeById(K id);

	Optional<E> remove(E e);

	Optional<Movie> findOneById(Integer id);

	void ifPresent(Object object);

	void ifPresent(MovieRepository movieRepository);

}
