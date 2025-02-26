import java.util.Scanner; // Import the Scanner class

public class Practical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to allow inputs from the keyboard
        System.out.println("Enter a name: ");
        String input = scanner.nextLine();
        
        System.out.println("Enter Age:");
        int Age = scanner.nextInt();

        System.out.println("Your name is: " + input +" "+ "Your Age is: " + Age);
        System.out.println("********************************************");
        
        
    }
}