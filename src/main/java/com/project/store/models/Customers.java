package com.project.store.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long customerID;
  private String firstName;
  private String lastName;
  private String address;
  private String email;
  private String phoneNumber;
  private String otherInfo;

  public Customers(){
  }

  public Customers(Long customerID, String firstName, String lastName, String address, String email, String phoneNumber,
      String otherInfo) {
    this.customerID = customerID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.otherInfo = otherInfo;
  }
  public Long getCustomerID() {
    return customerID;
  }
  public void setCustomerID(Long customerID) {
    this.customerID = customerID;
  }
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
  public String getOtherInfo() {
    return otherInfo;
  }
  public void setOtherInfo(String otherInfo) {
    this.otherInfo = otherInfo;
  }

  @Override
  public String toString() {
    return "Customers [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
        + address + ", email=" + email + ", phoneNumber=" + phoneNumber + ", otherInfo=" + otherInfo + "]";
  }
}
