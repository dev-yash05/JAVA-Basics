import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Output the result
        System.out.println("The volume of the sphere is: " + volume);

        scanner.close();
    }
}
