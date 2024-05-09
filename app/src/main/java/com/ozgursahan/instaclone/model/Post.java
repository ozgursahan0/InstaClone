package com.ozgursahan.instaclone.model;

public class Post {

    public String email;
    public String comment;
    public String downloadUrl;
    public String date;

    public Post(String email, String comment, String downloadUrl,String date) {
        this.email=email;
        this.comment=comment;
        this.downloadUrl=downloadUrl;
        this.date=date;
    }

}
