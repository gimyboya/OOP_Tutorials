package com.company;

/**
 * Created by gimy on 4/4/2017.
 */
public class WeightedItem extends PurchasedItem {

  private double weight;

  public WeightedItem(String n, double p, double w){
    super(n,p);
    this.weight = w;
  }

  @Override
  public double getPrice(){
    return super.getPrice() * weight;
  }

  public String toString(){
    System.out.println("Name: " + super.getName());
    System.out.println("Price: " + this.getPrice());
    return "";
  }
}
