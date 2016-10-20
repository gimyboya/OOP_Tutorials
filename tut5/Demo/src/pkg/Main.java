package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cat famousCat1 = new Cat("chouchou", 2);

        Cat nonfamousCat = new Cat();

        System.out.println(famousCat1.getName() + " " + famousCat1.getAge());
        System.out.println(famousCat1.numberOfCats);
        System.out.println(nonfamousCat.numberOfCats);


    }
}
