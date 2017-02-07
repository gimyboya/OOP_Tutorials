package pkg;

import java.util.*; // we need to import java.util.scanner before using Scanner object 

public class Main {

	public static void main(String[] args) {

		int a, b;

        a = 0; b = 0;//Initialize

        Scanner myNumber = new Scanner(System.in);

        System.out.println("please enter two numbers to add them");

        a = myNumber.nextInt();
        b = myNumber.nextInt();

        System.out.println("The sum of the two numbers " + a + " and " + b + " is: " + (a+b));
        
	}

}
