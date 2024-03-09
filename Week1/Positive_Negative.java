import java.util.*;

class Positive_Negative {
	int number;

	public void check(int number) {
		if (number > 0) {
			System.out.println(number + " is a positive number.");
		} else if (number == 0) {
			System.out.println(number + " is neither positive nor negative.");
		} else {
			System.out.println(number + " is a negative number.");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Positive_Negative pn = new Positive_Negative();
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		pn.check(number);
	}
}

// Output :

// Enter a number:-1
// -1 is a negative number.

// Enter a number:2
// 2 is a positive number.

// Enter a number:0
// 0 is neither positive nor negative.