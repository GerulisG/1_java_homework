package task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = input.nextDouble();

        System.out.print("Enter side b: ");
        double b = input.nextDouble();

        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0
                || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("These side lengths do not form a triangle.");
        } else {
            double s = (a + b + c) / 2.0;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.printf("Triangle area: %.2f%n", area);
        }

        input.close();
    }
}