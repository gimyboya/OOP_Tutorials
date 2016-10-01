package Classes;

import java.util.Scanner; //never forget our good friend

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner input = new Scanner(System.in); //we create our scanner

        int num = 0; //always initialize :)

        System.out.println("Enter a number please: ");

        num = input.nextInt();


        for (int i = num; i >=0; i--){

            for (int j = i; j >= 0; j--){
                System.out.print(j); //notice the print() function
                //here we print the value of j and decrease it each time
            }

            System.out.println(" "); // we make a line return
        }

    }

}
