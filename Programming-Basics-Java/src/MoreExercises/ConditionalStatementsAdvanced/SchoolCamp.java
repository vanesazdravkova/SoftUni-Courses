package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    price = nights * 9.60 * students;
                    sport = "Judo";
                } else if (groupType.equals("girls")) {
                    price = nights * 9.60 * students;
                    sport = "Gymnastics";
                }else if (groupType.equals("mixed")) {
                    price = nights * 10 * students;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    price = nights * 7.20 * students;
                    sport = "Tennis";
                } else if (groupType.equals("girls")) {
                    price = nights * 7.20 * students;
                    sport = "Athletics";
                } else if (groupType.equals("mixed")) {
                    price = nights * 9.50 * students;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    price = nights * 15 * students;
                    sport = "Football";
                } else if (groupType.equals("girls")) {
                    price = nights * 15 * students;
                    sport = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    price = nights * 20 * students;
                    sport = "Swimming";
                }
                break;
        }

        if (students >= 10 && students < 20) {
            price = price * 0.95;
        } else if (students >= 20 && students < 50) {
            price = price * 0.85;
        } else if (students >= 50) {
            price = price * 0.50;
        }

        System.out.printf("%s %.2f lv.", sport, price);
    }
}
