package pkg;

public class Main {

    public static void main(String[] args) {
	    int[] myArray = new int[6];

      for (int i = 0; i < myArray.length; i++) {
        myArray[i] = (int)(Math.random()* (10 + i));
      }

      System.out.println("Before:");
      for (int i : myArray) {
        System.out.print(i + " ");

      }
      System.out.println("");
      sorting(myArray);
      System.out.println("After:");
      for (int i : myArray) {
        System.out.print(i + " ");
      }
    }

    public static Object sorting(int[] array){
      java.util.Arrays.sort(array);
      return array;
    }
}
