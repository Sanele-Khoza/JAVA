import java.util.Scanner; // Import the Scanner class

public class Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to allow inputs from the keyboard

        String Drink = "Drink";
        int quantity;
        double price = 15.50;
        double total;

        System.out.println("How many  Drinks do you want: ");

        quantity = scanner.nextInt();

        System.out.println("Your Order is: ");
        System.out.println("-----------------");
        System.out.println("Product: " + Drink);
        System.out.println("Quantity: " + quantity);

        total = quantity*price;

        System.out.println("Your total order is: " +"R" + total);

    }
}