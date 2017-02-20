package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      Scanner userInput = new Scanner(System.in);

      String s;

      System.out.println("Enter anything longer than two characters: ");

      s = userInput.nextLine();

      String output = "" + s.charAt(0) + s.charAt(1);
      System.out.println("The output is " + output + output + output );
    }
}
