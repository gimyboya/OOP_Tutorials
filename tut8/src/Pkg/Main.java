package Pkg;

public class Main {

    public static void main(String[] args) {

        Animal basilisk = new Snake();

        basilisk.transport(); // here it's a dynamic binding

        Food Harry_Potter = new Human();

        Food A_Simple_Rat = new Food();

        basilisk.eat(A_Simple_Rat);

        basilisk.eat(Harry_Potter);/* here is static binding or method matching where the compiler already decided
                                    to choose the super class method eat() on compilation time

                                    NOTE: Widening happens before boxing (if any).
                                    So Human will become FOOD and call that methods.
                                    */





    }
}
