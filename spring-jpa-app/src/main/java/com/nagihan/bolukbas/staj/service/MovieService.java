package com.nagihan.bolukbas.staj.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.nagihan.bolukbas.staj.dto.ActorDto;
import com.nagihan.bolukbas.staj.dto.MovieDto;
import com.nagihan.bolukbas.staj.dto.UpdateMovie;
import com.nagihan.bolukbas.staj.entity.Movie;
import com.nagihan.bolukbas.staj.repository.MovieRepository;

import lombok.var;

@Service
public class MovieService<Actor> {
	MovieRepository movieRepository;
	public HttpStatus getMovie;
	private List<MovieDto> Actor;

	public List<MovieDto> getmovies() {
		MovieDto converter = new MovieDto();
		return converter.convert.findAll();

	}

	public MovieRepository getmovies(Integer integer) {
		MovieDto converter = new MovieDto();
		return converter.convert.findById();
	}

	public void DeleteMovie(Integer id) {
		movieRepository.deleteById(id);
	}

	public boolean updateMovie(UpdateMovie input) {
		Movie movie = movieRepository.findById(input.getId());
		movie.setYear(((Movie) input).getYear());
		movie.setName(((Movie) input).getName());
		movie.setImdb(((Movie) input).getImdb());
		movieRepository.save(movie);
		return true;

	}

	public boolean saveMovie(MovieDto movieDto) {
		Movie movie = new Movie();
		List<Actor> actor1 = new ArrayList<Actor>();
		for (Actor actor: movieDto.getActor()) {
			Actor actor11= new Actor11();
			((Movie) actor11).setYear(ActorDto.getYear());
			((Movie) actor11).setName(ActorDto.getName());
			((Movie) actor11).setImdb(ActorDto.getImdb());
			Actor.add((MovieDto) actor11);

		}
		movie.setYear(movie.getYear());
		movie.setName(movie.getName());
		movie.setImdb(movie.getImdb());
		var mov = movieRepository.save(movie); 
		return true;
		
		
		
		

	}

	public MovieDto getMovie(Integer movieId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void UpdateMovie(UpdateMovie input) {
		// TODO Auto-generated method stub
		
	}

}
