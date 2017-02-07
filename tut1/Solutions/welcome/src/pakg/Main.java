package pakg;


import java.io.FileInputStream;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter a real number: ");
                double number = input.nextInt();

                // Display the result
                System.out.println(
                        "The number entered is " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (" +
                        "Incorrect input: an integer is required)");
                input.nextLine(); // discard input
            }
        } while (continueInput);

    }

}







//the naming conventions
//the "." convention