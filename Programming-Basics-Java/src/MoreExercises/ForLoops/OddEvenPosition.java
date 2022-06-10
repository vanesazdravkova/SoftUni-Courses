package MoreExercises.ForLoops;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = Double.MAX_VALUE;
        double oddMax = -Double.MAX_VALUE;
        double evenSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = -Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double currentNumber = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += currentNumber;
                if (currentNumber > evenMax) {
                    evenMax = currentNumber;
                }
                if (currentNumber < evenMin) {
                    evenMin = currentNumber;
                }
            } else {
                oddSum += currentNumber;
                if (currentNumber > oddMax) {
                    oddMax = currentNumber;
                }
                if (currentNumber < oddMin) {
                    oddMin = currentNumber;
                }
            }
        }
        System.out.printf("OddSum=%.2f,%n", oddSum);
        if (n == 0) {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }
        System.out.printf("EvenSum=%.2f,%n", evenSum);
        if (n <= 1) {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }
    }
}
