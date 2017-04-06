package com.company;

/**
 * Created by gimy on 4/4/2017.
 */
public class CountedItem extends PurchasedItem {
  private int quantity;

  public CountedItem(String n, double up, int q){
    super(up,n);
    this.quantity = q;
  }

  @Override
  public double getPrice(){
    return super.getUnitPrice() * quantity;
  }

  public String toString(){
    return " Name: " + super.getName() + "\n" + "Price: " + this.getPrice();
  }
}
