package ExampleExam;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }
        double totalPrice = nights * pricePerNight;
        budget = budget - budget * percent / 100;

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        }else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
