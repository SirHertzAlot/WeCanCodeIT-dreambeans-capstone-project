package com.dream_beans.coffee.models;

import java.util.Collection;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Coffee_Inventory")
public class Inventory {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String imageUrl;

    @Column(name = "amount", nullable = true)
    private int amount;

    protected Inventory() {

    }

    @OneToMany(mappedBy = "Inventory")
    private Collection<Menu> coffee;

    public Inventory(long id, String name, int amount, String imageUrl) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.imageUrl = imageUrl;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
