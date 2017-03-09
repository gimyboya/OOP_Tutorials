package Classes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String myString;

      System.out.println("Enter a String: ");
      myString = input.nextLine();

      vowels(myString);


    }

    public static void vowels(String s){

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)){
                case 'a':
                    counter++;
                    break;
              case 'A':
                counter++;
                  break;
                case 'e':
                    counter++;
                    break;
                case 'i':
                    counter++;
                    break;
                case 'o':
                    counter++;
                    break;
                case 'u':
                    counter++;
                    break;
            }
        }

        System.out.println("The number of vowels in your String is: " + counter);

    }
}
