import java.util.Scanner;

    public class CelsiusToFahrenheit{
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            //Input temperature in celsius
            System.out.print("Enter the Temperature in Celsius: ");
            double celsius = s.nextDouble();

            //Calculation from Celsius to Fahrenheit
            double fahrenheit = (celsius * 9 / 5) + 32;

            //Output the Result
            System.out.println("The Temperature in Fahrenheit is: " + fahrenheit);
            
            s.close();
        }
    }