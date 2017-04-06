package pkg;

public class Main {

  public static void main(String[] args) {

    Cat famousCat1 = new Cat("Grempy Cat", 2);

    Cat nonfamousCat = new Cat();

    System.out.println(famousCat1.getName());
    System.out.println(famousCat1.getAge());

    System.out.println(nonfamousCat.getName());
    System.out.println(nonfamousCat.getAge());

    Cat[] myCats = new Cat[5];

    for (int i = 0; i < myCats.length; i++) {

      myCats[i] = new Cat();
    }

    myCats[0].getName();


  }
}
