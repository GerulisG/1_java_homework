package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Average books read per month (v): ");
        int v = input.nextInt();

        System.out.print("Average library visitors per year (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("The number of visitors per year must be greater than zero.");
        } else {
            double k = 12.0 * v / n;
            System.out.println("Average books read per visitor per year: " + k);
        }

        input.close();
    }
}