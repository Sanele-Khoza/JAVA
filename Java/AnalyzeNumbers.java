import java.util.Scanner; // Import the Scanner class

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt(); // Read the array size

        int[] myList = new int[size]; // Create int array

        // Fill array with random integers between 0 and 100
        for (int i = 0; i < myList.length; i++) {
            myList[i] = (int) (Math.random() * 100); // Cast to int
        }

        // Display generated values
        for(int value: myList){
            System.out.println(value + " ");
        }

        int sum = 0;
        float average;

        for(int i = 0; i < myList.length; i++){
            sum += myList[i];
        }

        average = sum/myList.length;
        System.out.println(average);

        input.close(); // Close Scanner
    }
}
