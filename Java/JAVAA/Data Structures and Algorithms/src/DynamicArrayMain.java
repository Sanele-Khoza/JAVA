
public class DynamicArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicArray dynamicArray = new DynamicArray(6);
		
		dynamicArray.add("A");
		dynamicArray.add("B");
		dynamicArray.add("C");
		
		System.out.println(dynamicArray);
		System.out.println("Empty: " + dynamicArray.isEmpty());
	}

}
