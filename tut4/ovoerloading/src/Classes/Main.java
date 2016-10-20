package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 10;

        iPrintHeloos(a);

    }

    public static void iPrintHeloos(int times){

        for (int i = 0; i < times; i++) {
            System.out.println("Hello");

        }

    }

}
