package com.example.bookmyshow;

import java.util.*;
import com.example.bookmyshow.Enums.City;


public class TheaterController {
    Map<City , List<Theater>> cityVsTheater;
    List<Theater> allTheaters;

    public TheaterController() {
        this.cityVsTheater = new HashMap<>();
        this.allTheaters = new ArrayList<>();
    }

    public void addTheater(Theater theater){
        allTheaters.add(theater);
        List<Theater> theaters = cityVsTheater.getOrDefault(theater.getCity(), new ArrayList<>());
        theaters.add(theater);
        cityVsTheater.put(theater.getCity(), theaters);
    }

}
