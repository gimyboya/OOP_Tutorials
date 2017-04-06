package com.company;

/**
 * Created by gimy on 4/4/2017.
 */
public class PurchasedItem {
  private String name;
  private double price;
  private double unitPrice;

  public PurchasedItem(){

  }
  public PurchasedItem(String n, double p){
    this.name = n;
    this.price = p;
  }

  public PurchasedItem(double up, String n){
    this.name = n;
    this.unitPrice = up;
  }


  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double getUnitPrice() {
    return unitPrice;
  }
}
