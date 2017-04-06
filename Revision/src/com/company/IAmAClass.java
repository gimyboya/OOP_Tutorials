package com.company;

import javafx.beans.property.SetProperty;

/**
 * Created by gimy on 3/30/2017.
 */
public class IAmAClass {

  private double property1;
  private boolean property2 = true;
  private String name;


  public IAmAClass(){//no-arg constructor
    this.property1 = 20;
    this.name = "No Name";
  }

  public IAmAClass(String n){
    this.name = n;
  }

  public IAmAClass(String n,boolean b, double d){
    this.name = n;
    this.property2 = b;
    this.property1 = d;
  }

  public void setProperty1(double p1){
    this.property1 = p1;
  }

  public double getProperty1(){
    return property1;
  }


  public boolean getProperty2() {
    return property2;
  }

  public void setProperty2(boolean property2) {
    this.property2 = property2;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
