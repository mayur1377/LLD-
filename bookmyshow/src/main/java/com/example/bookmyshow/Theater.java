package com.example.bookmyshow;

import java.util.ArrayList;
import java.util.List;

import com.example.bookmyshow.Enums.City;

public class Theater {
    public int theaterId;
    public String address;
    City city;
    List<Screen> screen = new ArrayList<>();
    List<Shows> shows = new ArrayList<>();

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Screen> getScreen() {
        return screen;
    }

    public void setScreen(List<Screen> screen) {
        this.screen = screen;
    }

    public List<Shows> getShows() {
        return shows;
    }

    public void setShows(List<Shows> shows) {
        this.shows = shows;
    }

    public Theater(int theaterId, String address, City city) {
        this.theaterId = theaterId;
        this.address = address;
        this.city = city;
    }




}
