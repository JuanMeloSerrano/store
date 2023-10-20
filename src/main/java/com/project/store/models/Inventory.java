package com.project.store.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Inventory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long inventoryID;
  @ManyToOne
  @JoinColumn(name = "productID")
  private Products product;
  private int stockQuantity;
  private Date lastStockUpdate;

  public Inventory(){};
  
  public Inventory(Long inventoryID, Products product, int stockQuantity, Date lastStockUpdate) {
    this.inventoryID = inventoryID;
    this.product = product;
    this.stockQuantity = stockQuantity;
    this.lastStockUpdate = lastStockUpdate;
  }

  public Long getInventoryID() {
    return inventoryID;
  }

  public void setInventoryID(Long inventoryID) {
    this.inventoryID = inventoryID;
  }

  public Products getProduct() {
    return product;
  }

  public void setProduct(Products product) {
    this.product = product;
  }

  public int getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
  }

  public Date getLastStockUpdate() {
    return lastStockUpdate;
  }

  public void setLastStockUpdate(Date lastStockUpdate) {
    this.lastStockUpdate = lastStockUpdate;
  }

  @Override
  public String toString() {
    return "Inventory [inventoryID=" + inventoryID + ", product=" + product + ", stockQuantity=" + stockQuantity
        + ", lastStockUpdate=" + lastStockUpdate + "]";
  }

  
}
