package Exam;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locations; i++) {
            double expectation = Double.parseDouble(scanner.nextLine());

            double totalGold = 0;

            int days = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= days; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());

                totalGold += goldPerDay;
            }

            double averageGold = totalGold / days;

            if (averageGold >= expectation) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageGold);
            }else {
                System.out.printf("You need %.2f gold.%n", expectation - averageGold);
            }
        }

    }
}
