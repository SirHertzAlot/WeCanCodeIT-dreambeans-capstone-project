package com.dreambeans.coffee.models;

import jakarta.persistence.*;

import java.util.Collection;




@Entity
public class Menu {

    @Id
    @GeneratedValue
    protected long id;

    protected String name;

  

  

    protected String description;

    protected String image;

    @OneToMany(mappedBy = "menu", orphanRemoval = true)
    private Collection<Product> products;



    public Menu() {
    }

    public Menu(String name, String description, String image) {
        this.name = name;
        
        this.description = description;
        this.image = image;
        
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
