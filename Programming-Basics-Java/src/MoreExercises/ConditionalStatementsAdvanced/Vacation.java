package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String type = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            type = "Camp";
        } else if (budget <= 3000) {
            type = "Hut";
        } else {
            type = "Hotel";
        }

        switch (type) {
            case "Camp":
                if (season.equals("Summer")) {
                    location = "Alaska";
                    price = budget * 0.65;
                } else if (season.equals("Winter")) {
                    location = "Morocco";
                    price = budget * 0.45;
                }
                break;
            case "Hut":
                if (season.equals("Summer")) {
                    location = "Alaska";
                    price = budget * 0.80;
                } else if (season.equals("Winter")) {
                    location = "Morocco";
                    price = budget * 0.60;
                }
                break;
            case "Hotel":
                if (season.equals("Summer")) {
                    location = "Alaska";
                } else if (season.equals("Winter")) {
                    location = "Morocco";
                }
                price = budget * 0.90;
                break;
        }

        System.out.printf("%s - %s - %.2f", location, type, price);
    }
}
