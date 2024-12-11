import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the amount
        System.out.print("Enter the purchase amount: ");
        double amount = scanner.nextDouble();

        // Initialize discount
        double discount = 0;

        // Determine discount based on conditions
        if (amount >= 5000) {
            discount = amount * 0.15; // 15% discount
        } else if (amount >= 3000) {
            discount = amount * 0.10; // 10% discount
        } else if (amount > 1000) {
            discount = amount * 0.05; // 5% discount
        } else {
            discount = 0; // No discount
        }

        // Calculate final amount after discount
        double finalAmount = amount - discount;

        // Output the results
        System.out.println("Original Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount after Discount: " + finalAmount);

        scanner.close();
    }
}
