package com.dreambeans.coffee.models;

public class ProductDto {
    private Long id;
    private double price;
    private String description;
    private String name;
    private String image;
    private Long menuId;
    
    
    public ProductDto(Long id, double price, String description, String name, String image, Long menuId) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.name = name;
        this.image = image;
        this.menuId = menuId;
    }


    public Long getId() {
        return id;
    }


    public double getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }


    public String getName() {
        return name;
    }


    public String getImage() {
        return image;
    }


    public Long getMenuId() {
        return menuId;
    }
    



}
