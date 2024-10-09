package com.example.contenttrack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTests {

    @Test  
    public void decreasePopularityTest() {
        ContentPopularityImpl contentPopularity = new ContentPopularityImpl();
        contentPopularity.increasePopularity(1);
        contentPopularity.increasePopularity(1);
        contentPopularity.decreasePopularity(1);
        assertEquals(1, contentPopularity.getPopularity(1), "Popularity should decrease to 1 after decreasing once");
    }

    @Test
    public void increasePopularityTest() {
        ContentPopularityImpl contentPopularity = new ContentPopularityImpl();
        contentPopularity.increasePopularity(1);
        contentPopularity.increasePopularity(1);
        assertEquals(2, contentPopularity.getPopularity(1), "Popularity should increase to 2 after increasing twice");
    }

    @Test
    public void mostPopularTest() {
        ContentPopularityImpl contentPopularity = new ContentPopularityImpl();
        contentPopularity.increasePopularity(1);
        contentPopularity.increasePopularity(1);
        contentPopularity.increasePopularity(2);
        assertEquals(1, contentPopularity.mostPopular(), "Content ID 1 should be the most popular");
    }

    @Test
    public void getPopularityTest() {
        ContentPopularityImpl contentPopularity = new ContentPopularityImpl();
        contentPopularity.increasePopularity(1);
        assertEquals(1, contentPopularity.getPopularity(1), "Popularity should be 1 after increasing once");
    }
}
