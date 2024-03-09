import java.util.Scanner;

public class FarenheitToCelcious {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius + " °C");

        scanner.close();
    }
}

// Output :

// Enter temperature in Fahrenheit: 212
// Temperature in Celsius: 100.0 °C