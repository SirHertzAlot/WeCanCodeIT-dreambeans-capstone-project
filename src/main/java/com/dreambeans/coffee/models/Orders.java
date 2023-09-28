package com.dreambeans.coffee.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue

    private long ordersId;
    private long customerId;
    private String customerName;
    private String itemsOrdered;
    private int itemQuantity;
    private float cost;
    private String orderedTime;
    private String orderedDate;
    
    public Orders() {
    }

    public Orders(long customerId, String customerName, String itemsOrdered, int itemQuantity, float cost,
            String orderedTime, String orderedDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.itemsOrdered = itemsOrdered;
        this.itemQuantity = itemQuantity;
        this.cost = cost;
        this.orderedTime = orderedTime;
        this.orderedDate = orderedDate;
    }

    public long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(long ordersId) {
        this.ordersId = ordersId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(String itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getOrderedTime() {
        return orderedTime;
    }

    public void setOrderedTime(String orderedTime) {
        this.orderedTime = orderedTime;
    }

    public String getOrderedDate() {
        return orderedDate;
    }

    public void setOrderedDate(String orderedDate) {
        this.orderedDate = orderedDate;
    }

   
}
