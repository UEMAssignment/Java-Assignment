import java.util.*;

class CelciusToFarenheit {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the tempeature in celcius : ");
		float celcius = sc.nextFloat();
		float farenheit = ((9 * celcius) / 5) + 32;

		System.out.println("In Celcius : " + celcius + " & In Farenheit : " + farenheit);

	}
}

// Output :

// Enter the tempeature in celcius : 100
// In Celcius : 100.0 & In Farenheit : 212.0