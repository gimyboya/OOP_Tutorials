package Pkg;

import java.util.Date;

/**
 * Created by gimy on 11/9/2016.
 */
public class Account {

    private int id = 0;
    private double balance = 0;
    private double anualrate = 0;
    private  Date dateCreated;

    public Account(){}//ne-arg

    public Account(int id,double b,double r){

        this.anualrate = r;
        this.balance = b;
        this.dateCreated = new Date();
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnualrate() {
        return anualrate;
    }

    public void setAnualrate(double anualrate) {
        this.anualrate = anualrate;
    }

    public double getMonthlyInterestRate(){
        return (this.getAnualrate() / 12 / 100);
    }

    public double  getMonthlyInterest(){
        return this.balance * this.getMonthlyInterestRate();
    }

    public void withdraw(double amount){
        this.balance = this.balance - amount;
        System.out.println("your Balance now is: " + this.balance);
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("the Balance now is: " + this.balance);
    }

    public Date getDateCreated() {
        return dateCreated;
    }
}
