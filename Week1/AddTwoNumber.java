import java.util.*;

class AddTwoNumber {
	public int add(int n1, int n2) {
		int c = n1 + n2;
		return c;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AddTwoNumber add1 = new AddTwoNumber();
		System.out.print("Enter the 1st and 2nd number : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int result = add1.add(n1, n2);
		System.out.println("Result is : " + result);
	}
}

// Output :

// Enter the 1st and 2nd number : 40 60
// Result is : 100