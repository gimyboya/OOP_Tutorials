package fact;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean error = false;
		
		System.out.println("enter a your age:");
		
		
		do{
			int age = input.nextInt();
			input.nextLine();
		}while()
		
		
		checkAge(age);

	}
	
	public static void checkAge(int num){
		if(num > 120){
			System.out.println("NOO Way!! you are too old!");
		}else if(num < 0){
			System.out.println("Are you not born yet??");
		}
		else {
			System.out.println("your age in: " + num);
		}
	}

}
