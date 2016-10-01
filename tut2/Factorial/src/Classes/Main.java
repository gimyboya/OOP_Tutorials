package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in);

        int num;
        int fact = 1;

        System.out.println("Please enter a number");

        num = input.nextInt();

        if((num == 0) || (num == 1)){
            System.out.println("The factorial number is: 1");
        }else{
            for (int i = num; i > 1; i--){
               fact = fact * i;
            }
            System.out.println("The factorial number is: " + fact);
        }

    }
}
