package com.example.contenttrack;

public interface ContentPopularity {
 
    void increasePopularity(int contendId);
    void decreasePopularity(int contendId);
    int mostPopular();
    int getPopularity(int contendId);
}
