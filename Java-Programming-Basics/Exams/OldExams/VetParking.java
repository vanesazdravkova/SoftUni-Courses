package ExampleExam;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int i = 1; i <= days; i++) {
            double priceForTheDay = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    priceForTheDay += 2.50;
                }else if (i % 2 != 0 && j % 2 == 0) {
                    priceForTheDay += 1.25;
                }else {
                 priceForTheDay += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, priceForTheDay);
            totalPrice += priceForTheDay;
        }
        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
