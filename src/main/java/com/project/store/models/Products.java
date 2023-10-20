package com.project.store.models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long productID;
  private String productName;
  private String description;
  private BigDecimal price;
  private String category;
  private String brand;
  private String model;

  public Products(){};

  public Products(Long productID, String productName, String description, BigDecimal price, String category,
      String brand, String model) {
    this.productID = productID;
    this.productName = productName;
    this.description = description;
    this.price = price;
    this.category = category;
    this.brand = brand;
    this.model = model;
  }
  public Long getProductID() {
    return productID;
  }
  public void setProductID(Long productID) {
    this.productID = productID;
  }
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }
  public String getBrand() {
    return brand;
  }
  public void setBrand(String brand) {
    this.brand = brand;
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Products [productID=" + productID + ", productName=" + productName + ", description=" + description
        + ", price=" + price + ", category=" + category + ", brand=" + brand + ", model=" + model + "]";
  }
}
