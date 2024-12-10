import java.util.Scanner;

public class RectangleCalculations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        // Input the Length and Width of the Rectangle
         System.out.print("Enter the Length of the rectangle: ");
         double length = s.nextDouble();
         System.out.print("Enter the Width of the Rectangle: ");
         double width = s.nextDouble();

        // Calculate the Area And Perimeter of the Rectangle
         double area = length * width;
         double perimeter = 2 * (length + width);

        // Output the Results
         System.out.println("The Area of the Rectangle is: "+area);
         System.out.println("The Perimeter of the Rectangle is: "+perimeter);
    
         s.close();

    }
}
