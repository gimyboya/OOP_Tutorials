package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //create a scanner

        String[] myArray = new String[5];//declaration creation

        for (int i = 0; i <= myArray.length - 1 ; i++){

            System.out.println("Enter a word:");

            myArray[i] = input.nextLine();//initialize
        }

        for(String word : myArray){
          System.out.println(word);
        }

	// write your code here
    }

}

