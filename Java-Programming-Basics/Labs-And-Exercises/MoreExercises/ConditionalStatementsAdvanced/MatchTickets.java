package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double leftSum = 0;

        if (people > 0 && people <= 4) {
            leftSum = budget - budget * 0.75;
        } else if (people >= 5 && people <= 9) {
            leftSum = budget - budget * 0.6;
        } else if (people >= 10 && people <= 24) {
            leftSum = budget - budget * 0.5;
        } else if (people >= 25 && people <= 49) {
            leftSum = budget - budget * 0.4;
        } else if (people >= 50) {
            leftSum = budget - budget * 0.25;
        }

        switch (category) {
            case "VIP":
                if (leftSum >= people * 499.99) {
                    System.out.printf("Yes! You have %.2f leva left.", leftSum - people * 499.99);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", people * 499.99 - leftSum);
                }
                break;
            case "Normal":
                if (leftSum >= people * 249.99) {
                    System.out.printf("Yes! You have %.2f leva left.", leftSum - people * 249.99);
                } else {
                    System.out.printf("Not enough money! You need %.2f leva.", people * 249.99 - leftSum);
                }
                break;
        }
    }
}
