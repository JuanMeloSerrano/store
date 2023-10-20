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
public class Payments {
  @Id  
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long paymentID;
  @ManyToOne
  @JoinColumn(name = "orderID")
  private Orders order;
  private String paymentMethod;
  private Date paymentDate;
  private BigDecimal paymentAmount;
  private String paymentStatus;

  public Payments() {}

  public Payments(Long paymentID, Orders order, String paymentMethod, Date paymentDate, BigDecimal paymentAmount,
      String paymentStatus) {
    this.paymentID = paymentID;
    this.order = order;
    this.paymentMethod = paymentMethod;
    this.paymentDate = paymentDate;
    this.paymentAmount = paymentAmount;
    this.paymentStatus = paymentStatus;
  }

  public Long getPaymentID() {
    return paymentID;
  }

  public void setPaymentID(Long paymentID) {
    this.paymentID = paymentID;
  }

  public Orders getOrder() {
    return order;
  }

  public void setOrder(Orders order) {
    this.order = order;
  }

  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public BigDecimal getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(BigDecimal paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public String getPaymentStatus() {
    return paymentStatus;
  }

  public void setPaymentStatus(String paymentStatus) {
    this.paymentStatus = paymentStatus;
  }

  @Override
  public String toString() {
    return "Payments [paymentID=" + paymentID + ", order=" + order + ", paymentMethod=" + paymentMethod
        + ", paymentDate=" + paymentDate + ", paymentAmount=" + paymentAmount + ", paymentStatus=" + paymentStatus
        + "]";
  };

  
}
