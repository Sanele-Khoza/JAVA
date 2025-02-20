import java.util.Scanner; // Import the Scanner class

public class RandomVariables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        double[] myList = new double[size]; // Create array

        // Fill array with random values between 0 and 100
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 100;
        }

        // Display generated values
        System.out.println("Generated random values: ");
        for (double value : myList) {
            System.out.printf("%.2f ", value); // Format to 2 decimal places
        }

        input.close(); // Close Scanner
    }
}
