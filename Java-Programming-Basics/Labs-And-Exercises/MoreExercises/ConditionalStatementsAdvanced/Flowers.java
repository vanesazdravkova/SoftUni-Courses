package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemum = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double price = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                price = 2 * chrysanthemum + 4.10 * roses + 2.50 * tulips;
                break;
            case "Autumn":
            case "Winter":
                price = 3.75 * chrysanthemum + 4.50 * roses + 4.15 * tulips;
                break;
        }

        if (holiday.equals("Y")) {
            price += price * 0.15;
        }
        if (tulips > 7 && season.equals("Spring")) {
            price -= price * 0.05;
        }
        if (roses >= 10 && season.equals("Winter")) {
            price -= price * 0.10;
        }
        if (chrysanthemum + roses + tulips > 20) {
            price -= price * 0.20;
        }

        System.out.printf("%.2f", price + 2);

    }
}
