package MoreExercises.WhileLoops;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int expectedSum = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 1;
        int cashCount = 0;
        int cashSum = 0;
        int cardCount = 0;
        int cardSum = 0;
        int totalSum = 0;

        while (!input.equals("End")) {
            int price = Integer.parseInt(input);

            if (counter % 2 == 1) {
                if (price <= 100) {
                    cashCount++;
                    cashSum += price;
                    totalSum += price;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            } else {
                if (price >= 10) {
                    cardCount++;
                    cardSum += price;
                    totalSum += price;
                    System.out.println("Product sold!");
                } else {
                    System.out.println("Error in transaction!");
                }
            }
            if (totalSum >= expectedSum) {
                break;
            }

            counter++;
            input = scanner.nextLine();
        }

        if (totalSum >= expectedSum) {
            System.out.printf("Average CS: %.2f%n", (cashSum * 1.00) / cashCount);
            System.out.printf("Average CC: %.2f", (cardSum * 1.00) / cardCount);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
