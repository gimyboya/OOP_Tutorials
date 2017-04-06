package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

      ArrayList<Animal> myArrayList = new ArrayList<Animal>();
      Scanner input = new Scanner(System.in);
      char race;
      int number;

      System.out.println("How many animals do you have?: ");
      number = input.nextInt();

      for (int i = 0; i < number; i++) {
        System.out.println("Is it a Dog or a Cat? (c or d): ");
        race = input.next().charAt(0);

        myArrayList.add(i, new Animal(race));

      }
      int sum = 0;

      for (int i = 0; i < myArrayList.size(); i++) {
        if(myArrayList.get(i).getRace() == 'c' || myArrayList.get(i).getRace() == 'C'){
          sum++;
        }
      }

      System.out.println("You have " + sum + " Cats!!");

    }
}
