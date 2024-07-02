package com.movieflix.service;

import java.util.List;

import com.movieflix.entities.Movie;
import com.movieflix.entities.User;

public interface MovieService {
	
	public String addMovie(Movie mov);
	
	
	public List<Movie> viewMovie();


	

}
