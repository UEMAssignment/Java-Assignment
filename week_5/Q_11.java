package week_5;

import java.lang.Math;
import java.util.Scanner;

class Circle {
    private double radius;
    private String color;

    // Default constructor
    Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius parameter
    Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Q_11 {
    public static void main(String[] args) {
        // Using default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius of the Circle: ");
        double radius = sc.nextDouble();
        sc.close();
        // Using constructor with radius parameter
        Circle circle2 = new Circle(radius);
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
    }
}
