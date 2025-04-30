
//Dynamic Array is an Array that has resize'able capacity
//new String[capacity * 2]
import java.util.ArrayList;

public class DynamicArray {
	
	int size;
	int capacity = 10;
	Object[] array;
	
	public DynamicArray() //Overloaded constructor
	{
		this.array = new Object[capacity];
	}
	public DynamicArray(int capacity) //Overloaded constructor if the user instantiate his own capacity
	{
		this.capacity = capacity;
		this.array = new Object[capacity];
	}

	public void add(Object data) {
		if(size >= capacity) {
			grow();
		}
		array[size] = data;
		size++;
	}
	public void insert(int index, Object data) {
		
	}
	public void delete(Object data) {
		
	}
	public int dearch(Object data) {
		return -1;
	}
	public void grow() {
		
	}
	public void shrink() {
		
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		String string = "";
		for(int i = 0; i < size; i++) {
			string += array[i] + ", ";
		}
		if(string != "") {
			string = "[" +string.substring(0, string.length() - 2 )+ "]";
		}
		else {
			string = "[]";
		}
		return string;
		
	}
	
}
