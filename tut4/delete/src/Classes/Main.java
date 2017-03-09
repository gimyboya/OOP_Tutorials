package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] myArray = new String[5];

        for (int i = 0; i < myArray.length; i++){
            System.out.println("Enter a word:");

            myArray[i] = input.nextLine();//initialize
        }

        removeDuplicates(myArray);//invoking the function


    }



    public static void removeDuplicates(String[] arr){

        String[] result = new String[arr.length];

        result[0] = arr[0];

        boolean duplicate = false;

        int counter = 1;

        for (int i = 1; i < arr.length; i++) {

            result[counter] = arr[i];

            for (int j = (counter-1); j >= 0; j--) {

                if( result[j].matches(arr[i]) ){
                    duplicate = true;
                }

            }

            if(!duplicate){
                counter++; //we increment the counter to write in a new index
            }else if( duplicate && i == (arr.length-1) ){
                counter--; //we don't need a duplicate at the end of the array
            }else if(duplicate){
                duplicate = false; //we will not increment the counter to override the value
            }

        }

        for (int i = 0; i <= counter; i++) {

            System.out.println( (i+1) + "th String is: " + result[i]);

        }
    }

}
