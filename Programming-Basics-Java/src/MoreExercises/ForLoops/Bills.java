package MoreExercises.ForLoops;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityTotal = 0;
        double otherTotal = 0;

        for (int i = 1; i <= months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());

            double other = electricityBill + 20 + 15 + (electricityBill + 20 + 15) * 0.2;

            electricityTotal += electricityBill;
            otherTotal += other;
        }

        double waterTotal = 20 * months;
        double internetTotal = 15 * months;
        double average = (electricityTotal + waterTotal + internetTotal + otherTotal) / months;

        System.out.printf("Electricity: %.2f lv%n", electricityTotal);
        System.out.printf("Water: %.2f lv%n", waterTotal);
        System.out.printf("Internet: %.2f lv%n", internetTotal);
        System.out.printf("Other: %.2f lv%n", otherTotal);
        System.out.printf("Average: %.2f lv%n", average);
    }
}
