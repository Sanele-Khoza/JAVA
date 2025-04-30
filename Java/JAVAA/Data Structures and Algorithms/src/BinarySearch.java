
//Binary Search Algorithm a search that finds a target value within a sorted array
//it eliminates half of the array in the search
//best in large data set

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[100]; //Declaring an array of size 100
		int target; //the value we are searching for 
		
		target = 55;
		
		for(int i = 0; i < array.length; i++) {
			array[i] = i; //assigning values from 0 - 99 in the array
		}
		
		int index = Arrays.binarySearch(array, target);
		
		if(index == -1) {
			System.out.println(target + " +Not found");
		}
		else {
			System.out.println(target +  "Found");
		}
	}

}
  