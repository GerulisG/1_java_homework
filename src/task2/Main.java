package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Room length: ");
        int length = input.nextInt();

        System.out.print("Room width: ");
        int width = input.nextInt();

        System.out.print("Price per tile: ");
        double price = input.nextDouble();

        if (length <= 0 || width <= 0 || price < 0) {
            System.out.println("Enter positive room dimensions and a non-negative price.");
        } else {
            double roomArea = (double) length * width;
            int tilesToBuy = (int) Math.ceil(roomArea * 1.05);
            double totalCost = tilesToBuy * price;

            System.out.println("Tiles to buy: " + tilesToBuy);
            System.out.printf("Total cost: %.2f%n", totalCost);
        }

        input.close();
    }
}