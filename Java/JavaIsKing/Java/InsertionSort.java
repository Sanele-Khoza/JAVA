public class InsertionSort {
    //Method For Sorting
    public static void insertionSort(int[] list)//it takes an array of integers (int[] list) as inputs and return no vlue
    {
        for(int i = 1; i < list.length; i++)//This Outer loop iterates through the array from the second element to the last element
        {
            int currentElement = list[i];//assign the value at i to the variable currentElement
            int k;
            for(k = i - 1; k >= 0 && list[k]>currentElement; k--)/*Begins at the index before i and moves backwards (k--) 
            and the element at k is greater than currentElement */ 
            {
                list[k+1] = list[k]; //the element at index k is shifted one position to the right 
            }
            list[k + 1] = currentElement;//after the inner loop currentElement is inserted at index (k + 1)
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 3, 6, 1, 9, 1, 0, 5};
        insertionSort(list); //calling the method and passing  list array as argument
        for(int i = 0; i<list.length; i++){
            System.out.print(list[i]+ " ");
        }
    }
  }