package com.dream_beans.coffee.models;

import  javax.persistence.Column;
import  javax.persistence.Entity;
import  javax.persistence.GeneratedValue;
import  javax.persistence.Id;
import  javax.persistence.Table;

@Entity
@Table(name = "Coffee_Costumer")
public class Costumer {


    @Id
    @GeneratedValue
    private long id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private char password;

    public Costumer() {
    }

    

    public Costumer(String userName, char password) {
        this.userName = userName;
        this.password = password;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }



    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    
    
}
