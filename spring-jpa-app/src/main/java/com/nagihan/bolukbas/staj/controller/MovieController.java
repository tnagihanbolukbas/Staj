package com.nagihan.bolukbas.staj.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagihan.bolukbas.staj.dto.MovieDto;
import com.nagihan.bolukbas.staj.dto.UpdateMovie;
import com.nagihan.bolukbas.staj.service.MovieService;

@RestController
public class MovieController {
	MovieService movieService;

	public ResponseEntity<List<MovieDto>> getMovie() {
		return new ResponseEntity<List<MovieDto>>(movieService.getMovie);
	}

	public MovieDto getMovieById(@PathVariable("movieId") Integer MovieId) {
		return movieService.getMovie(MovieId);
	}
	
	public void deleteMovie(@PathVariable("movieId")Integer movieId) {
		movieService.DeleteMovie(movieId);
	}
	public void updateMovie(@RequestBody UpdateMovie input) {
		movieService.UpdateMovie(input);
	}
	public Boolean saveMovie(@RequestBody MovieDto movie){
		return movieService.saveMovie(movie);
	}

}
