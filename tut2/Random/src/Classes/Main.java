package Classes;

public class Main {

    public static void main(String[] args) {

        System.out.println("The random number is .....:");

        double dRandom = 0;

        /* Demonstrate the random() function */

        dRandom = Math.random();

        System.out.println(dRandom);

        /*  int iRandom = 0;
        iRandom = Math.random(); //Demonstrate the casting
        System.out.println(iRandom);   */


        /* ===============

        Solution

         ===============*/

        // to have a random number from 0 to 10:

        double doublRandom = 0;

        doublRandom = Math.random() * 11;

        //to have integers only we need to cast the whole expression

        int random = 0;

        random = (int) (Math.random() * 11);


        // to have upper and lower limits
        int max = 0, min = 0;

        int range = (max - min) + 1;

        random = (int)(Math.random() * range + min);
    }
}
