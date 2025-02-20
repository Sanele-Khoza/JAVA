import java.util.Scanner; // Import the Scanner class

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        double[] myList = new double[size]; // Create array

        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble(); // Read values into the array
        }

        // Display entered values
        System.out.println("You entered: ");
        for (double value : myList) {
            System.out.print(value + " ");
        }

        input.close(); // Close Scanner
    }
}

