package pakage;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("enter two numbers:");
		double num1 = input.nextDouble();
		input.nextLine();
		double num2 = input.nextDouble();
		input.nextLine();
		
		System.out.println("wht do you want?");
		
		System.out.println("1- add \t\t\t\t 2-substract");
		System.out.println("3- devide \t\t\t\t 4-reminder");
		
		System.out.println("choose a number (1-4): ");
		
		int choice = input.nextInt();
		
		
		
		choice(choice, num1, num2);

	}
	
	public static double sum(double a, double b){
		return a + b;
	}
	
	public static double substract(double a, double b){
		if(a > b){
			return a - b;
		}else{
			return b - a;
		}
	}
	
	public static double multiply(double a, double b){
		return a * b;
	}
	
	public static double divide(double a, double b){
		if(b == 0){
			System.out.println("We can't devide by Zero!");
			return -1;
		}else{
			System.out.println("the result is " + (a/b));
			return a / b;
		}
	}
	
	public static double reminder(double a, double b){
		if(b == 0){
			System.out.println("We can't devide by Zero!");
			return -1;
		}else{
			return a % b;
		}
	}
	
	public static void choice (int userChoice, double num1, double num2){
		switch (userChoice){
		case 1:
			System.out.println(sum(num1, num2));
			break;
		case 2:
			System.out.println(substract(num1, num2));
			break;
		case 3:
			System.out.println(divide(num1, num2));
			break;
		case 4:
			System.out.println(reminder(num1, num2));
			break;
		}
	}
	
	
	

}
