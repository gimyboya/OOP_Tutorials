package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

      Scanner input = new Scanner(System.in);

      System.out.println("Please enter the info for your weighted item");
      String name = input.nextLine();
      double price = input.nextDouble();
      double weight = input.nextDouble();

      WeightedItem wItem = new WeightedItem(name,price,weight);

      wItem.toString();

      System.out.println("Please enter the info for your counted item");

      input.next();
      name = input.nextLine();
      double unitprice = input.nextDouble();
      int quantity = input.nextInt();

      CountedItem CItem = new CountedItem(name,unitprice,quantity);

      System.out.println(CItem.toString());

    }
}
