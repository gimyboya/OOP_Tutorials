package pkg;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		String s; //string is an object
		Scanner myString = new Scanner(System.in);

        System.out.println("type anything you want");

        s = myString.nextLine();
        
        System.out.println("you have typed: " + s  );
        System.out.println("and the size of your string is: " + s.length() ); //ctrl+space
        
	}

}
