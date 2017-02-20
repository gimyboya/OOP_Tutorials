package pkg;

import java.util.*;

public class Main {

	public static void main(String[] args) {
    Scanner myString = new Scanner(System.in);


		String something; //string is an object


        System.out.println("type anything you want");

        something = myString.nextLine();
        
        System.out.println("you have typed: " + something  );
    System.out.println("and the size of your string is: " + something.length() );
        
	}

}
