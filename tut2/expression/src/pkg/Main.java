package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

      int x;

      System.out.println("Enter the value of x: ");
      Scanner input = new Scanner(System.in);

      x = input.nextInt();

      double result = (Math.pow(x,7) + (2 * Math.pow(x,6)) + Math.pow(x,5))/(Math.pow(x,3)*Math.pow((x+1),8));

      System.out.println("the result is " + result);
    }
}
