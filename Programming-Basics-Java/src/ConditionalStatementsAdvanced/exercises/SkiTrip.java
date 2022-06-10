package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        double pricePerNight = 0;

        switch (type) {
            case "room for one person":
                pricePerNight = 18.00;
                break;
            case "apartment":
                pricePerNight = 25.00;
                if ((days - 1) < 10) {
                    pricePerNight = pricePerNight * 0.70;
                } else if ((days - 1) >= 10 && (days - 1) <= 15) {
                    pricePerNight = pricePerNight * 0.65;
                } else if ((days - 1) > 15) {
                    pricePerNight = pricePerNight * 0.50;
                }
                break;
            case "president apartment":
                pricePerNight = 35.00;
                if ((days - 1) < 10) {
                    pricePerNight = pricePerNight * 0.90;
                } else if ((days - 1) >= 10 && (days - 1) <= 15) {
                    pricePerNight = pricePerNight * 0.85;
                } else if ((days - 1) > 15) {
                    pricePerNight = pricePerNight * 0.80;
                }
                break;
        }
        double totalPrice = pricePerNight * (days - 1);

        if (grade.equals("positive")) {
            totalPrice = totalPrice + totalPrice * 0.25;
        } else if (grade.equals("negative")) {
            totalPrice = totalPrice - totalPrice * 0.10;
        }

        System.out.printf("%.2f", totalPrice);
    }
}
