package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Pokemon {

    private @Id int id;
    private String name;
    private String image;

    public Pokemon(int id, String name, String image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public Pokemon() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
