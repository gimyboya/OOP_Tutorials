package Pkg;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Parking[] parkingToday = new Parking[300]; // we declare and create our array but notice that we didn't create objects inside it yet

        System.out.println("How many vehicles we have today ? (enter an integer no more than 300): ");

        int numberOfVehicles = 0;

        int type = 0;
        int hours = 0;

        double todayFees = 0;

        while (!input.hasNextInt()){
            System.out.println("Please enter an integer and nothing else");
            input.next();

        }

        numberOfVehicles = input.nextInt();


        for (int i = 0; i < numberOfVehicles ; i++) { // this is a loop to create the vehicles inside the array


            do{
                System.out.println("What is the type of vehicle? : (1-Car    2-Motorbike): ");

                while (!input.hasNextInt()){
                    System.out.println("Please enter the numbers 1 or 2");
                    input.next();

                }
                type = input.nextInt();
            }while (type != 1 && type != 2);



            System.out.println("How many hours is it parked?: (enter an integer) ");
            while (!input.hasNextInt() ){
                System.out.println("Please enter an integer and nothing else");
                input.next();

            }

            hours = input.nextInt();

            parkingToday[i] = new Parking(type, hours);
        }

        for (int i = 0; i < numberOfVehicles; i++) { // this is a loop to calculate the fees of all the vehicles

            todayFees = todayFees + parkingToday[i].getFees();
        }

        System.out.println("The total fees for today are: " + todayFees);




    }
}
