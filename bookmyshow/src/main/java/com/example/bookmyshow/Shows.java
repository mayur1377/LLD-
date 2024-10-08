package com.example.bookmyshow;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Shows {
    public int showId;
    public Date showTime;
    public Movie movie;
    public Screen screen;
    List<Integer> bookedSeats = new ArrayList<>();

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Date getShowTime() {
        return showTime;
    }

    public void setShowTime(Date showTime) {
        this.showTime = showTime;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public List<Integer> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<Integer> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Shows(int showId, Date showTime, Movie movie, Screen screen) {
        this.showId = showId;
        this.showTime = showTime;
        this.movie = movie;
        this.screen = screen;
    }

}
