package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double price = 0;

        if (type.equals("Gas")) {
            price = 0.93 * amount;
            if (card.equals("Yes")) {
                price -= 0.08 * amount;
            }
        } else if (type.equals("Gasoline")) {
            price = 2.22 * amount;
            if (card.equals("Yes")) {
                price -= 0.18 * amount;
            }
        } else if (type.equals("Diesel")) {
            price = 2.33 * amount;
            if (card.equals("Yes")) {
                price -= 0.12 * amount;
            }
        }

        if (amount >= 20 && amount <= 25) {
            System.out.printf("%.2f lv.", price - (price * 0.08));
        } else if (amount > 25) {
            System.out.printf("%.2f lv.", price - (price * 0.1));
        } else {
            System.out.printf("%.2f lv.", price);
        }
    }
}
