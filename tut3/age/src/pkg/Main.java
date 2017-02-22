package pkg;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("enter a your age:");

    int age = 0;

    while (!input.hasNextInt()){
      System.out.println("Wrong input please enter an integer!");
      input.next();
    }

    age = input.nextInt();

    checkAge(age);

  }

  public static void checkAge(int num){
    if(num > 120){
      System.out.println("Noo Way!! you are too old!");
    }else if(num < 0){
      System.out.println("Are you not born yet??");
    }
    else {
      System.out.println("your age is: " + num);
    }
  }

}
