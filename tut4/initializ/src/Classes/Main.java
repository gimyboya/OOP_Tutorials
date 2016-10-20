package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] myArray = new String[5];//declaration creation

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter a word:");

            myArray[i] = input.nextLine();//initialize
        }

        for(String value : myArray){
            System.out.println(value);
        }

	// write your code here
    }

}

