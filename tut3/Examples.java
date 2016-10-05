package pkg;

/**
 * Created by gimy on 05/10/2016.
 */


public class Main  {


    public static void main(String[] args) {
		
		
	}
	
	
	//overload by data type
	
	public static double sum(double a, double b){
			return a+b;
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
	
	//overload by number of parameters
	
	public static double max(double a, double b){
		if (a > b){
			return a;
		}
		else{
			return b;
		}
	}
	
	public static double max(double a, double b, double c){
		if(a > b){
			if (a > c){
				return a;
			}
			else {
				return c;
			}
		}
		else{
			if (b > c ){
				return b;
			}
			else {
				return c;
			}
		}
	}
	
	//Ambiguous Invocation
	
	public static void sumAmbig(double a, float b){
		System.out.println(a+b);
	}
	
	public static void sumAmbig(float a, double b){
		System.out.println(a+b);
	}
}