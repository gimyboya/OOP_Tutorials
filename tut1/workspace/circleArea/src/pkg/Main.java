package pkg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r = 0;
		final double pi = 3.14;
		
		Scanner input = new Scanner(System.in);

        System.out.println("type your circle raduis");

        r = input.nextDouble();
        
        //System.out.println("your circle area is " + (pi * r * r)  );
        System.out.println("your circle area is " + (pi * Math.pow(r, 2))  );

	}

}
