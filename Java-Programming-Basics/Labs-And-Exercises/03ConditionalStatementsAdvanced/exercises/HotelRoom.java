package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
                priceStudio = 50.00;
                priceApartment = 65.00;
                if (nights > 7 && nights <= 14) {
                    priceStudio = priceStudio * 0.95;
                } else if (nights > 14) {
                    priceStudio = priceStudio * 0.70;
                    priceApartment = priceApartment * 0.90;
                }
                break;
            case "June":
            case "September":
                    priceStudio = 75.20;
                    priceApartment = 68.70;
                if (nights > 14) {
                    priceStudio = priceStudio * 0.80;
                    priceApartment = priceApartment * 0.90;
                }
                break;
            case "July":
            case "August":
                    priceStudio = 76.00;
                    priceApartment = 77.00;
                if (nights > 14) {
                    priceApartment = priceApartment * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.", priceApartment * nights);
        System.out.println();
        System.out.printf("Studio: %.2f lv.", priceStudio * nights);
    }
}
