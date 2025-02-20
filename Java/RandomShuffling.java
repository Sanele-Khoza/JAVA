/*import java.util.Scanner;
import java.util.Random;

public class RandomShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); // Create Random object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        int[] myList = new int[size];

        // Fill array with random integers between 0 and 100
        for (int i = 0; i < myList.length; i++) {
            myList[i] = rand.nextInt(100); // Random int between 0 and 99
        }

        // Display original array
        System.out.println("Original array: ");
        printArray(myList);

        // Shuffle the array using Fisher-Yates Algorithm
        for (int i = myList.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Random index from 0 to i
            // Swap myList[i] and myList[j]
            int temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }

        // Display shuffled array
        System.out.println("Shuffled array: ");
        printArray(myList);

        input.close();
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line after printing
    }
} */

//without Fisher's Algo

import java.util.Scanner;
import java.util.Random;

public class RandomShuffling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random(); // Create Random object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read array size

        int[] myList = new int[size];

        // Fill array with random integers between 0 and 100
        for (int i = 0; i < myList.length; i++) {
            myList[i] = rand.nextInt(100); // Random int between 0 and 99
        }

        // Display original array
        System.out.println("Original array: ");
        printArray(myList);

        // Shuffle the array by swapping random pairs multiple times
        for (int i = 0; i < myList.length * 2; i++) {  // Shuffle more by repeating swaps
            int index1 = rand.nextInt(myList.length); // Pick a random index
            int index2 = rand.nextInt(myList.length); // Pick another random index

            // Swap myList[index1] and myList[index2]
            int temp = myList[index1];
            myList[index1] = myList[index2];
            myList[index2] = temp;
        }

        // Display shuffled array
        System.out.println("Shuffled array: ");
        printArray(myList);

        input.close();
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); // New line after printing
    }
}
