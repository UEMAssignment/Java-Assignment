import java.util.*;

class Rectangle {

	public void area(int height, int width) {
		System.out.println("Area = " + (height * width));
	}

	public void perimeter(int height, int width) {
		System.out.println("Perimeter = " + (2 * (height + width)));
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the height : ");
		int height = sc.nextInt();
		System.out.print("Enter the width : ");
		int width = sc.nextInt();

		r1.area(height, width);
		r1.perimeter(height, width);
	}
}

// Output :

// Enter the height : 4
// Enter the width : 6
// Area = 24
// Perimeter = 20