package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        int num = 0;

        System.out.println("Please enter a number:");

        num = input.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++){

            if (num%i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println( num + " is a prime number");
        }
        else{

            System.out.println( num + " is not a prime number");
        }
    }
}
