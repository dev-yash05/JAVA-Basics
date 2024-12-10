import java.util.Scanner;               

public class TriangleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input the Base and Height of the Triangle
        System.out.print("Enter the Base of the Triangle: ");
        double base = s.nextDouble();
        System.out.print("Enter the Height of the triangle: ");
        double height = s.nextDouble();

        // Calculate the Area of the Triangle
        double area = 0.5 * base * height;
        
        // Output the Result
        System.out.println("The Area of the Triangle is: " +area);

        s.close();
    }
}
