import java.util.Scanner;

class AreaCalculator {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(int side) {
        return (double) side * side;
    }
}

public class Calculation {
    public static void main(String[] args) {
        // Run sample test case first
        System.out.println("--- Sample Test Case Output ---");
        System.out.println(AreaCalculator.calculateArea(5.0)); // Circle
        System.out.println(AreaCalculator.calculateArea(4, 5)); // Rectangle
        System.out.println(AreaCalculator.calculateArea(4)); // Square
        System.out.println("--------------------------------\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();
                System.out.println("Circle Area: " + AreaCalculator.calculateArea(radius));
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                System.out.println("Rectangle Area: " + AreaCalculator.calculateArea(length, width));
                break;
            case 3:
                System.out.print("Enter side: ");
                int side = sc.nextInt();
                System.out.println("Square Area: " + AreaCalculator.calculateArea(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
