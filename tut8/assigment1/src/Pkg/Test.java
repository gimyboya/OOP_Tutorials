package Pkg;

import java.util.Date;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        String address;
        String phone;
        String email;
        String office;
        double salary;
        Date date_hired = new Date();
        String office_hours;
        String rank;

        System.out.println("enter the information : ");

        name = input.nextLine();
        address = input.nextLine();
        phone = input.nextLine();
        email = input.nextLine();
        office = input.nextLine();
        salary = input.nextDouble();
        input.nextLine();
        office_hours = input.nextLine();
        rank = input.nextLine();

        Faculty_member tertour = new Faculty_member(name,address,phone,email,office,salary,date_hired,office_hours,rank);
        tertour.toString();

        String myString = "hello";



    }
}
