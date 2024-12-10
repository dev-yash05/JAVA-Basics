import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = s.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        s.close();
    }
}
