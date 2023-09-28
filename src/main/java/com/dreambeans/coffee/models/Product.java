package com.dreambeans.coffee.models;
import javax.persistence.Entity;

import javax.persistence.Id;

import jakarta.persistence.GeneratedValue;

@Entity
public class Product { 
    @Id
    @GeneratedValue
    private long id;

    private double price;
    private String description;
    private String name;
    private String image;
    
    public Product(double price, String description, String name, String image) {
        
        this.price = price;
        this.description = description;
        this.name = name;
        this.image = image;
    }


    public Product() {
    }

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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


