package Pkg;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);

        Parking[] parkingToday = new Parking[300];

        System.out.println("How many vehicles we have today ? (enter an integer no more than 300): ");

        int numberOfVehicules = 0;

        int type = 0;
        int hours = 0;

        double todayFees = 0;



        numberOfVehicules = input.nextInt();


        for (int i = 0; i < numberOfVehicules ; i++) {

            System.out.println("What is the type of vehicle? : (1-Car    2-Motorbike): ");
            while (!input.hasNextInt() ){
                System.out.println("Please enter an integer and nothing else");
                input.next();

            }

            type = input.nextInt();

            System.out.println("How many hours is it parked?: (enter an integer) ");
            while (!input.hasNextInt() ){
                System.out.println("Please enter an integer and nothing else");
                input.next();

            }

            hours = input.nextInt();

            parkingToday[i] = new Parking(type, hours);
        }



    }
}
