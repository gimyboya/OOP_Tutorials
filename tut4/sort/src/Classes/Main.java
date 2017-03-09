package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);// create a scanner

        System.out.println("How many numbers do you have?: ");

        while (!input.hasNextInt()){
            System.out.println("Enter an integer!!!: ");
            input.next();
        }

        int size = input.nextInt();

        int[] myArray = new int[size];

        for (int i = 0; i < myArray.length; i++) {

            /*System.out.println("Enter a number");

            while (!input.hasNextInt()){
                System.out.println("Enter an integer!!!: ");
                input.next();
            }

            myArray[i] = input.nextInt();*/

            myArray[i] = (int)(Math.random() * 101);
        }

        java.util.Arrays.sort(myArray); //built in sort function only (ascending order)



        System.out.print("Array in  ascending order:");

        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        //Bubble sort

        bubbleSort(myArray);

        System.out.print("Array in  descending order:");


        for (int i : myArray) {
            System.out.print(i + " ");
        }

        System.out.println(" ");

        System.out.println("what value do you want to find in your array?: ");

        while (!input.hasNextInt()){
            System.out.println("Enter an integer!!!: ");
            input.next();
        }

        int value = input.nextInt();

        System.out.println("The element is in the index: " + searchIndex(myArray, value));

    }

    public static void bubbleSort(int[] arr){
        boolean sorted = false;
        int scope = arr.length;

        while(!sorted){
            sorted = true;
            for (int i = 0; i < scope-1 ; i++) { //Descending

                if(arr[i] < arr[i+1]){

                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    sorted = false;
                }
            }
            scope--;
        }
    }

    public static int searchIndex(int[] arr, int value){
        boolean found = false;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == value){
                found = true;
              index = i;
                break;
            }
        }

        if(found){
            return index;
        }else{
            System.out.println("Value not found!");
            return -1;
        }
    }
}
