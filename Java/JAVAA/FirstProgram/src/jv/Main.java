package jv;

//import java.util.scannner;

public class Main {
	
	static void Message() {
		System.out.println("Hello Sanele");
	}
	
	static int sum(int a, int b){
		return a + b;
	}
	
	static double sum(double a, double b){
		return a + b;
	}
	
	static void messageString(String name){
		System.out.println("Hello " + name + "!");
	}
	void msg() {
		System.out.println("non-static method called");
	}
	int x = 24;
	
	
	public static void main(String[] args) {
		Message();//Np Object needed
		//int add = sum(5, 4);
		double add = sum(5.3, 4.6);
		//System.out.println("Sum is: " + add);
		System.out.println("Sum is: " + add);
		messageString("Sanelee"); //Passing an argument
		
		Main obj = new Main();
		obj.msg();
		System.out.println("Sanele's Age is " + obj.x);
		
	}
	
}
