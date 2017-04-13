package com.company;

/**
 * Created by gimy on 4/13/2017.
 */
public class Snake extends Animal {

  public Snake(){}

  @Override
  public void transport(){//notice this is an override
    System.out.println("Go from A to B crawling");
  }

}
