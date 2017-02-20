package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);

      double f = 0;
      double c = 0;

      System.out.println("Enter the temperature in fahrenheit");

      f = userInput.nextDouble();

      c = (f-32) * 5/9; // the formula

      System.out.println("the temperature in celsius is :" + c);
    }
}
