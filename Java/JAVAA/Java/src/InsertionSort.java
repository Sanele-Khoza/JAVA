
public class InsertionSort {
	
	public static void insertionSort(int[] list) {
		for(int i = 1; i < list.length; i++) {
			int currentElement = list[i];
			int j;
			for(j = i - 1; j>=0 && list[j]>currentElement; j--) {
				list[j + 1] = list[j];
			}
			list[j + 1] = currentElement;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {5, 8, 2, 10, 80, 98, 34, 21, 5};
		insertionSort(list);
		System.out.println("The sorted list is ");
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}

}
