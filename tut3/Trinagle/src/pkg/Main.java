package pkg;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean isValid(double side1, double side2, double side3){
      if(side2 + side3 > side1){
        return true;
      }else if(side3 + side1 > side2){
        return true;
      }else if(side1 + side2 > side3){
        return true;
      }else{
        return false;
      }
    }

  public static double area(double side1, double side2, double side3){
    double area = 0;

    double s = (side1 + side2 + side3)/2;

    area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

    return area;
  }

}
