package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a = 0;
		
		Scanner myNumber = new Scanner(System.in);

        System.out.println("Enter a number of two digits");

        a = myNumber.nextInt();
        
        System.out.println("Magic! we have inverted your number " + (a%10) + (a/10)  );

	}

}
