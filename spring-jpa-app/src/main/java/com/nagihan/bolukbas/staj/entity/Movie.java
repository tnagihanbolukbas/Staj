package com.nagihan.bolukbas.staj.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mvid")
	private String mvId;
	private int year;
	private String name;
	private String imdb;

	public Object getYear() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setYear(Object year) {
		// TODO Auto-generated method stub

	}

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setName(Object name) {
		// TODO Auto-generated method stub

	}

	public Object getImdb() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setImdb(Object imdb) {
		// TODO Auto-generated method stub

	}

	public Object getMovieID() {
		// TODO Auto-generated method stub
		return null;
	}

	public void SetId(Object movieID) {
		// TODO Auto-generated method stub
		
	}

	public Object getMovieYear() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMovieImdb() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getMovieName() {
		// TODO Auto-generated method stub
		return null;
	}

}
