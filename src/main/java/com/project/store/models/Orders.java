package com.project.store.models;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;
    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customers customer;
    private Date orderDate;
    private String orderStatus;
    private String shippingOptions;
    private BigDecimal totalAmount;

    public Orders(){};

    public Orders(Long orderID, Customers customer, Date orderDate, String orderStatus, String shippingOptions,
        BigDecimal totalAmount) {
      this.orderID = orderID;
      this.customer = customer;
      this.orderDate = orderDate;
      this.orderStatus = orderStatus;
      this.shippingOptions = shippingOptions;
      this.totalAmount = totalAmount;
    }

    public Long getOrderID() {
      return orderID;
    }

    public void setOrderID(Long orderID) {
      this.orderID = orderID;
    }

    public Customers getCustomer() {
      return customer;
    }

    public void setCustomer(Customers customer) {
      this.customer = customer;
    }

    public Date getOrderDate() {
      return orderDate;
    }

    public void setOrderDate(Date orderDate) {
      this.orderDate = orderDate;
    }

    public String getOrderStatus() {
      return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
      this.orderStatus = orderStatus;
    }

    public String getShippingOptions() {
      return shippingOptions;
    }

    public void setShippingOptions(String shippingOptions) {
      this.shippingOptions = shippingOptions;
    }

    public BigDecimal getTotalAmount() {
      return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
      return "Orders [orderID=" + orderID + ", customer=" + customer + ", orderDate=" + orderDate + ", orderStatus="
          + orderStatus + ", shippingOptions=" + shippingOptions + ", totalAmount=" + totalAmount + "]";
    }

    
}