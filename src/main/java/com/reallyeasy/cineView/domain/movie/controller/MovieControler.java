package com.reallyeasy.cineView.domain.movie.controller;

import com.reallyeasy.cineView.domain.movie.entity.Movie;
import com.reallyeasy.cineView.domain.movie.service.MovieService;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/movies")
public class MovieControler {
    private final MovieService movieService;


    public MovieControler(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(Model model) {
        return movieService.getallmovies();
    }
}
