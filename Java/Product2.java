import java.util.Scanner; // Import the Scanner class

public class Product2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to allow inputs from the keyboard

        String Product;
        int quantity;
        double price;
        double total;

        System.out.println("What would you want: ");
        Product = scanner.nextLine();
        System.out.println("How much is it: ");
        price = scanner.nextDouble();
        System.out.println("How many do you want: ");
        quantity = scanner.nextInt();

        System.out.println("Your Order is: ");
        System.out.println("-----------------");
        System.out.println("Product: " + Product);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

        total = quantity*price;

        System.out.println("Your total order is: " +"R" + total);
    }
}