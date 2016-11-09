package Pkg;

import java.util.Scanner;

public class TestPurchase {

    public static void main(String[] args) {

        String name;
        double uPrice;
        double weight;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Weighted Item Information :");

        System.out.println("Name : ");
        name = input.nextLine();

        System.out.println("Unite Price : ");
        uPrice = input.nextDouble();
        input.nextLine();

        System.out.println("Weight : ");
        weight = input.nextInt();
        input.nextLine();

        WeighedItem Wi = new WeighedItem(name,uPrice,weight);

        System.out.println(Wi.toString());



    }
}
