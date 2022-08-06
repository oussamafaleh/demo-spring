package com.example.demo;

public class Course {

    private long id;
    private String  Name;
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        Name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
