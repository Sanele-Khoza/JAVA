import java.util.Scanner; // Import the Scanner class

public class SummingElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        int[] myList = new int[size]; // Create int array
        int total = 0; // Variable to store sum

        // Fill array with random integers between 0 and 100, and calculate sum
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100); // Cast to int
            total += myList[i]; // Add element to total
        }

        // Display generated values
        System.out.println("Generated random integers: ");
        for (int value : myList) {
            System.out.print(value + " ");
        }

        // Display the sum
        System.out.println("\nTotal sum: " + total);

        input.close(); // Close Scanner
    }
}
