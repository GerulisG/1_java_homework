package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1 = input.nextInt();

        System.out.print("Enter y1: ");
        int y1 = input.nextInt();

        System.out.print("Enter x2: ");
        int x2 = input.nextInt();

        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        int width = x2 - x1;
        int height = y1 - y2;

        if (width < 0 || height < 0) {
            System.out.println("The coordinates do not match the stated upper-left and lower-right corners.");
        } else {
            int area = width * height;
            int perimeter = 2 * (width + height);

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }

        input.close();
    }
}