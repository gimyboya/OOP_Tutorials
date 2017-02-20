package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

		double r = 0;
		final double pi = 3.14;
		


        System.out.println("type your circle radius");

        r = input.nextDouble();
        
        //System.out.println("your circle area is " + (pi * r * r)  );
        System.out.println("your circle area is " + (pi * Math.pow(r, 2))  );

	}

}
