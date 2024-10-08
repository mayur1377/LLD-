package com.example.bookmyshow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.bookmyshow.Enums.City;

public class MovieController {

    Map<City , List<Movie>> cityMovieMap;
    List<Movie> movies;

    public MovieController() {
        this.cityMovieMap = new HashMap<>();
        this.movies = new ArrayList<>();
    }


}
