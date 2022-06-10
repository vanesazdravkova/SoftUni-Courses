package MoreExercises.ForLoops;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weights = Integer.parseInt(scanner.nextLine());

        int sumTons = 0;
        int totalMoney = 0;
        double averageSumPerTon = 0;
        int countMicrobus = 0;
        int countTrucks = 0;
        int countTrains = 0;
        for (int i = 1; i <= weights; i++) {

            int ton = Integer.parseInt(scanner.nextLine());

            if (ton <= 3) {
                totalMoney += 200 * ton;
                countMicrobus += ton;
            } else if (ton >= 4 && ton <= 11) {
                totalMoney += 175 * ton;
                countTrucks += ton;
            } else if (ton >= 12) {
                totalMoney += 120 * ton;
                countTrains += ton;
            }

            sumTons += ton;
        }
        averageSumPerTon = totalMoney / (sumTons * 1.00);
        double microbusPercent = countMicrobus / (sumTons * 1.00) * 100;
        double trucksPercent = countTrucks / (sumTons * 1.00) * 100;
        double trainsPercent = countTrains / (sumTons * 1.00) * 100;

        System.out.printf("%.2f%n", averageSumPerTon);
        System.out.printf("%.2f%%%n", microbusPercent);
        System.out.printf("%.2f%%%n", trucksPercent);
        System.out.printf("%.2f%%%n", trainsPercent);
    }
}
