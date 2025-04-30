public class MethodOverloading {

	//Method with one parameter 
	public void display(int a) {
		System.out.println("Argument: " + a);
	}
	
	//OverloadedMethod with two parameters 
	public void display(int a, int b) {
		System.out.println("Arguments: " +  a + ", " + b);
	}
	
	//OverloadedMethod with different parameter type
	public void dispaly(String a) {
		System.out.println("String Argument:" + a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object
		MethodOverloading obj = new MethodOverloading();
		
		obj.display(6);
		obj.display(7, 8);
		//obj.display("Sanny");
	}

}
