package fact;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

    System.out.println("Enter a number to calculate it's factorial: ");
    int num = input.nextInt();

    System.out.println("The factorial of the number is: " + fact(num));
  }
	
	public static int fact(int num){
		if(num == 0 || num == 1){
      return 1;
    }else{
      int fact = 1;

      for (int i = num; i > 1; i--){
        fact = fact * i;
      }

      return fact;
    }
	}

}
