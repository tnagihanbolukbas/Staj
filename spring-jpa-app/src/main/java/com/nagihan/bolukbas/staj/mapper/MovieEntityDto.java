package com.nagihan.bolukbas.staj.mapper;

import java.util.ArrayList;
import java.util.List;

import com.nagihan.bolukbas.staj.dto.MovieDto;
import com.nagihan.bolukbas.staj.entity.Movie;

public class MovieEntityDto {
	public MovieDto convert(Movie movie) {
		MovieDto movieDto = new MovieDto();
		ActorEntityDto converter = new ActorEntityDto();
		movie.SetId(movie.getMovieID());
		movie.setYear(movie.getMovieYear());
		movie.setName(movie.getMovieName());
		movie.setImdb(movie.getMovieImdb());
		return movieDto;
	}

	public List<MovieDto> convert(List<Movie> movie) {
		List<MovieDto> returnList = new ArrayList<>();
		for (Movie movie1 : movie) {
			returnList.add((MovieDto) convert(movie));

		}
		return returnList;
	}

}
