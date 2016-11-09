package Pkg;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        ArrayList<Account> Accounts = new ArrayList<Account>();

        for (int i = 0; i < 10; i++) {
            Accounts.add(i,new Account(i,100,4.5));
        }



        do{
            int id = -1;
            do{
                System.out.println("Please enter your account ID [0 - 9] : ");

                while (!input.hasNextInt()){
                    System.out.println("Please enter an Integer");
                    input.next();
                }

                id = input.nextInt();

            }while (id > 9 || id < 0);

            boolean exit = false;

            do{
                int choice = -1;

                System.out.println("Main menu");
                System.out.println("1:check balance");
                System.out.println("2:withdraw");
                System.out.println("3:deposit");
                System.out.println("4:exit");


                do{
                    System.out.println("Enter a choice [1 - 4] : ");

                    while (!input.hasNextInt()){
                        System.out.println("Please enter an Integer");
                        input.next();
                    }

                    choice = input.nextInt();

                }while (choice > 4 || choice < 1);

                if(choice == 1){
                    System.out.println("Your Balance is : " + Accounts.get(id).getBalance());
                }else if(choice == 2){
                    double amount = 0;
                    System.out.println("What is the amount you want to withdraw? : ");

                    while (!input.hasNextDouble()){
                        System.out.println("Please enter a correct number");
                        input.next();
                    }

                    amount = input.nextDouble();

                    if(amount > Accounts.get(id).getBalance()){
                        System.out.println("Sorry your account only has " + Accounts.get(id).getBalance());
                    }else{
                        Accounts.get(id).withdraw(amount);
                        System.out.println("Your account is now " + Accounts.get(id).getBalance());
                    }

                }else if(choice == 3){

                    System.out.println("What is the amount you want to deposit? : ");

                    double amount = 0;

                    while (!input.hasNextDouble()){
                        System.out.println("Please enter a correct number");
                        input.next();
                    }

                    amount = input.nextDouble();

                    Accounts.get(id).deposit(amount);

                    System.out.println("Your Balance is now : " + Accounts.get(id).getBalance());

                }else if(choice == 4){
                    exit = true;
                }

            }while (!exit);



        }while(true);



    }
}
