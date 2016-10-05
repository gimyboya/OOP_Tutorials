package pkg;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a = 10; //explain scope
		System.out.println(a);*/
		
		/*public static void message(){
			System.out.println("Hello World");
		}*/
		
		message();
		System.out.println(sum(5.3,2));
		System.out.println(max(255,50));
		sumAmbig(1.5,2.3);
		


	}
	public static void message(){
		System.out.println("Hello World");
		
		
	}
	public static double sum(double a, double b){
		return a+b;
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
	
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
	
	public static void sumAmbig(int a, long b){
		System.out.println(a+b);
	}
	
	public static void sumAmbig(long a, int b){
		System.out.println(a+b);
	}
	
	
}

/*public static void message(){
	System.out.println("Hello World");
}*/