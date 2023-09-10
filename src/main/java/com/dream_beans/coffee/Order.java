package com.dream_beans.coffee;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private Long orderId;
    private String[] itemsOrdered;
    private int itemQuantityInOrder;
    private float cost;
    private LocalTime orderDateWithTime = LocalTime.now();

}
