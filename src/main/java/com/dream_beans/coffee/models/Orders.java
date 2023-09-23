package com.dream_beans.coffee.models;

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

    protected Orders(){}

    public Orders(long ordersId, long customerId, String customerName, String itemsOrdered, int itemQuantity, float cost, String orderedTime, String orderedDate){
        ordersId = this.ordersId;
        customerId = this.customerId;
        customerName = this.customerName;
        itemsOrdered = this.itemsOrdered;
        itemQuantity = this.itemQuantity;
        cost = this.cost;
        orderedTime = this.orderedTime;
        orderedDate = this.orderedDate;
    }

    @Override
    public String toString() {
        return String.format("Order id: [orderId=%d] Customer Name: [customerName=%d] Items in Order: [itemsOrdered=%d] Cost: [cost=%d]  Time Ordered: [orderTime=%d] Date Ordered: [orderDate=%d]",
                ordersId, customerName, itemsOrdered, cost, orderedDate, orderedTime);
    }

    public long getOrderId() {
        return ordersId;
    }

    public void setOrderId(long orderId) {
        this.ordersId = orderId;
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

    public int getItemQuantityInOrder() {
        return itemQuantity;
    }

    public void setItemQuantityInOrder(int itemQuantityInOrder) {
        this.itemQuantity = itemQuantityInOrder;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getOrderTime() {
        return orderedTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderedTime = orderTime;
    }

    public String getOrderDate() {
        return orderedDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderedDate = orderDate;
    }
}
