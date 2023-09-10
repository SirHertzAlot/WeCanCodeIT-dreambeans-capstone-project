package com.dream_beans.coffee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long orderId;
    private String[] itemsOrdered;
    private float cost;
}
