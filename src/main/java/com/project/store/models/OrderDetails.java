package com.project.store.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderDetails {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long orderDetailID;
  @ManyToOne
  @JoinColumn(name = "orderID")
  private Orders order;
  @ManyToOne
  @JoinColumn(name = "productID")
  private Products product;
  private int quantity;
  private BigDecimal unitPrice;

  public OrderDetails(){};

  public Long getOrderDetailID() {
    return orderDetailID;
  }

  public void setOrderDetailID(Long orderDetailID) {
    this.orderDetailID = orderDetailID;
  }

  public Orders getOrder() {
    return order;
  }

  public void setOrder(Orders order) {
    this.order = order;
  }

  public Products getProduct() {
    return product;
  }

  public void setProduct(Products product) {
    this.product = product;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(BigDecimal unitPrice) {
    this.unitPrice = unitPrice;
  }


  public OrderDetails(Long orderDetailID, Orders order, Products product, int quantity, BigDecimal unitPrice) {
    this.orderDetailID = orderDetailID;
    this.order = order;
    this.product = product;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  @Override
  public String toString() {
    return "OrderDetails [orderDetailID=" + orderDetailID + ", order=" + order + ", product=" + product + ", quantity="
        + quantity + ", unitPrice=" + unitPrice + "]";
  }

}
