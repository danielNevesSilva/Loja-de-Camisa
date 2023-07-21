package br.com.lojadecamisa.servlet.model;

import java.util.Date;

public class Post {

    private String id;
    private String username;
    private Date date;
    private String title;
    private String body;

    private String image;

    public Post (){

    }

    public Post(String id, String username, String title, String body, String image) {
        this.id = id;
        this.username = username;
        this.title = title;
        this.body = body;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
