package com.vidshare.model;

import java.sql.Date;
import java.util.UUID;

public class VidModel {

    public String title;
    public String description;
    public String url;
    public Date date;
    public Integer viewCount;
    public String UploaderId;

    public VidModel(String title, String description, String url) {
        this.title = title;
        this.description = description;
        this.url = url;
        this.date = new Date(System.currentTimeMillis());
        this.viewCount = 0;
        this.UploaderId = UUID.randomUUID().toString();
    }

}
