package com.dream_beans.coffee.models;
import javax.persistence.Entity;

import javax.persistence.Id;

import jakarta.persistence.GeneratedValue;

@Entity
public class Product { 
    @Id
    @GeneratedValue
    private long id;

    private int price;
    private String description;
    private String name;
    private String size;
    
    public Product(int price, String description, String name, String size) {
        
        this.price = price;
        this.description = description;
        this.name = name;
        this.size = size;
    }


    public Product() {
    }

    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
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
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}


