package com.dream_beans.coffee.models;

import java.util.List;

import  javax.persistence.Column;
import  javax.persistence.Entity;
import  javax.persistence.GeneratedValue;
import  javax.persistence.Id;
import  javax.persistence.ManyToOne;
import  javax.persistence.OneToMany;
import  javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name= "size")
    private String size;

    @Column(name = "price")
    private float price;

    @Column(name = "description")
    private String description;

    @Column(name = "image")
    private String image;

    @OneToMany
   private List<Product> products;

    public Menu() {
    }

    public Menu(String name, String size, float price, String description, String image) {
        
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
        this.size = size;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
