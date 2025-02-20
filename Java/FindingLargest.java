import java.util.Scanner; // Import Scanner class

public class FindingLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        int[] myList = new int[size]; // Create int array

        // Fill array with random integers between 0 and 100
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100); // Generate random int
        }

        // Find the maximum value
        int max = myList[0]; // Assume first element is max
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i]; // Update max if a larger value is found
            }
        }

        // Display generated values
        System.out.println("Generated random integers: ");
        for (int value : myList) {
            System.out.print(value + " ");
        }

        // Display the maximum value
        System.out.println("\nMaximum value: " + max);

        input.close(); // Close Scanner
    }
}
