package com.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movieflix.entities.Movie;
import com.movieflix.repository.MovieRepository;

@Service
public class MovieServiceImplementation implements MovieService {
	
	@Autowired
	MovieRepository movrepo;

	@Override
	public String addMovie(Movie mov) {
		movrepo.save(mov);
		return "Movie Added";
	}

	@Override
	public List<Movie> viewMovie() {
		List<Movie> movieList = movrepo.findAll();
		return movieList;
	}

}
