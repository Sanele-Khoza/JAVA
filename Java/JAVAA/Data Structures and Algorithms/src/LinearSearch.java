
public class LinearSearch {

	//Linear Search do not need to be sorted
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,8,23,56,9,76,23,4,66};
		
		int index = linearSearch(array, 6);
		
		if(index != -1)
		{
			System.out.println("Element found at index " + index);
		} else {
			System.out.println("Element not found");
		}
	}

	public static int linearSearch(int[] array, int value)
	{
		// TODO Auto-generated method stub
		for(int i = 0; i <array.length; i++) 
		{
			if(array[i] == value) 
			{
				return i;//if element is found
			}
		}
		return -1;//if element not found after the iteration;
	}

}
