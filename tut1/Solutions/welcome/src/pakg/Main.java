package pakg;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int num = 0;
      int sum = 0;

      System.out.println("Enter a number");

      num = input.nextInt();

      sum = sum + num; // add the number to the sum variable

      System.out.println("Enter another number");

      num = input.nextInt(); //take another number

      sum = sum + num;

      System.out.println("the result of the sum is: " + sum);



    }

}







//the naming conventions
//the "." convention