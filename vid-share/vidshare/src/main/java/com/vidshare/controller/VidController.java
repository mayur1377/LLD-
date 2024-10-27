package com.vidshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidshare.Service.VidService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/vid")
public class VidController {

    @Autowired 
    private VidService vidService;

    @PostMapping("/upload")
    public void uploadVideo(@RequestBody String title, @RequestBody String description, @RequestBody String url) {
        vidService.uploadVideo(title, description, url);
    }
    
    @GetMapping("/details")
    public void fetchVidDetails(@RequestBody String title) {
        vidService.fetchVidDetails(title);
    }

    @GetMapping("/watch")
    public void watchVideo(@RequestBody String title) {
        vidService.watchVideo(title);
    }
}
