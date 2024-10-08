package com.example.bookmyshow;

public class Movie {
    int movieId;
    String movieName;
    String movieGenre;

    public Movie(int movieId, String movieName, String movieGenre) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieGenre = movieGenre;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
