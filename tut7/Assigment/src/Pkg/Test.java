package Pkg;

public class Test {

    public static void main(String[] args) {

        Account acount1 = new Account(1122,20000,4.5);

        acount1.withdraw(2500);
        acount1.deposit(3000);

        System.out.println(acount1.getMonthlyInterest());
        System.out.println("this account was created om : " + acount1.getDateCreated());

    }
}
