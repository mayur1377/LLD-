package com.example.contenttrack;

public class Main {
    public static void main(String[] args) {
        ContentPopularityImpl contentPopularity = new ContentPopularityImpl();

        contentPopularity.increasePopularity(1);
        
        contentPopularity.decreasePopularity(1);
        
        int maxPopularity = contentPopularity.mostPopular();
        System.out.println("Max popularity: " + maxPopularity);
    }
}