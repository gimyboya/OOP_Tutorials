package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        int num = 0;
        int formula = 0;

        System.out.println("Enter a number of 3 Digits: ");

        num = input.nextInt();

      /*
      test values:
      371
      153
      370
      407
       */

        int temp = num;

        for(int i = 100; i >= 1; i /= 10){ // we start from 100 and we devide each time by 10

            formula = (int) (formula + Math.pow((temp/i),3)); // we calculate the number

            temp = temp % i;
        }

        if (formula == num ){
            System.out.println("Success");
        }else {
            System.out.println("Booo!!!");
        }

    }
}
