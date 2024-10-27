package com.vidshare.Service;

import org.springframework.stereotype.Service;
import com.vidshare.model.VidModel;
import java.util.*;

import java.net.MalformedURLException;
import java.net.URL;

@Service 
public class VidService {

    public List<VidModel> allVids = new ArrayList<VidModel>();

    public boolean isValidUrl(String url) {
        try{
            new URL(url);
            return true;
        }
        catch(MalformedURLException e){
            return false;
        }
    }

    public void uploadVideo(String title, String description, String url) {
        if(!isValidUrl(url)){
            System.out.println("Invalid URL");
            return;
        }   
        Boolean exists = false;
        for(VidModel vid : allVids){
            if(vid.url.equals(url)){
                exists = true;
                break;
            }
        }
        if(exists){
            System.out.println("Video already exists");
            return;
        }

        if(title == null || title.equals("")){
            System.out.println("Title cannot be empty");
            return;
        }

        if(description == null || description.equals("")){
            System.out.println("Description cannot be empty");
            return;
        }


        VidModel vid = new VidModel(title, description, url);
        allVids.add(vid);
        System.out.println("Video uploaded successfully");
    }

    public void fetchVidDetails(String title) {
        if(title == null || title.equals("")){
            System.out.println("Title cannot be empty");
            return;
        }
        
        for(VidModel vid : allVids){
            if(vid.title.equals(title)){
                System.out.println("--------------------------------------------------");
                System.out.println("Title: " + vid.title);
                System.out.println("Description: " + vid.description);
                System.out.println("URL: " + vid.url);
                System.out.println("Date: " + vid.date);
                System.out.println("View Count: " + vid.viewCount);
                System.out.println("--------------------------------------------------");
                return;
            }
        }
        System.out.println("Video not found");
    }

    public void watchVideo(String title) {
        for(VidModel vid : allVids){
            if(vid.title.equals(title)){
                vid.viewCount++;
                System.out.println("You can watch the video at: " + vid.url);
                return;
            }
        }
        System.out.println("Video not found");
    }

}
