package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {


            System.out.println("Enter an integer Number: ");

            while (!input.hasNextInt()){
                System.out.println("I said an integer Number!!: ");
                input.next();
            }

            myArray[i] = input.nextInt();

        }

        int max = myArray[0];
        int min = myArray[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > max){

                max = myArray[i];
                maxIndex = i;
            }

            if(myArray[i] < min){
                min = myArray[i];
                minIndex = i;
            }
        }

        System.out.println("Largest element index is: " + maxIndex);
        System.out.println("Smallest element index is: " + minIndex);

        System.out.println(maxIndex + "th index before is: " + myArray[maxIndex]);
        System.out.println(minIndex + "th index before is: " + myArray[minIndex]);

        /* here is a trik to swap without using a temporary variable */

        myArray[minIndex] =  myArray[minIndex] + myArray[maxIndex]; // a = a + b
        myArray[maxIndex] = myArray[minIndex] - myArray[maxIndex]; // b = a - b
        myArray[minIndex] = myArray[minIndex] - myArray[maxIndex]; // a = a - b

        System.out.println(maxIndex + "th index after is: " + myArray[maxIndex]);
        System.out.println(minIndex + "th index after is: " + myArray[minIndex]);


    }
}
