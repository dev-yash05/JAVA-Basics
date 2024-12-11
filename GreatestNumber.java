import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        // Determine the greatest number
        double greatest;
        if (num1 > num2 && num1 > num3) {
            greatest = num1;
        } else if (num2 > num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Output the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
}
