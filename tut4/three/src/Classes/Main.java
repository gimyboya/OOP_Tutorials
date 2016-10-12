package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myArray = new int[50];

        for (int i = 0; i < myArray.length; i++){

            myArray[i] = i * 3;//initialize
        }

        System.out.println("5th Element : " + myArray[4]);
        System.out.println("12th Element : " + myArray[11]);
        System.out.println("50th Element : " + myArray[49]);

    }
}
