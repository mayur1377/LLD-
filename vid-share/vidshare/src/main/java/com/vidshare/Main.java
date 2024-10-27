package com.vidshare;

import com.vidshare.Service.VidService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create a new VidService object
        VidService vidService = new VidService();

        // Upload a video
        vidService.uploadVideo("My first video", "This is my first video", "https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        // Fetch video details
        vidService.fetchVidDetails("My first video");

        // Watch video
        vidService.watchVideo("My first video");

        // Fetch video details again
        vidService.fetchVidDetails("My first video");

        // Upload the same video again
        vidService.uploadVideo("My first video", "This is my first video", "https://www.youtube.com/watch?v=dQw4w9WgXcQ");

        // Fetch video details again
        vidService.fetchVidDetails("My first video");

    }
}