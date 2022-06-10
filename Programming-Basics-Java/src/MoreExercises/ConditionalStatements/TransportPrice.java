package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();

        if (word.equals("day")) {
            if (n < 20) {
                double min = n * 0.79 + 0.70;
                System.out.printf("%.2f", min);
            } if (n >= 20 && n < 100) {
                double min = Math.min(n * 0.79 + 0.70, 0.09 * n);
                System.out.printf("%.2f", min);
            } if (n >= 100) {
                double min = Math.min(0.09 * n, 0.06 * n);
                System.out.printf("%.2f", min);
            }
        } else if (word.equals("night")) {
            if (n < 20) {
                double min = n * 0.9 + 0.70;
                System.out.printf("%.2f", min);
            } if (n >= 20 && n < 100) {
               double min = Math.min(n * 0.9 + 0.70, 0.09 * n);
                System.out.printf("%.2f", min);
            } if (n >= 100) {
                double min = Math.min(0.09 * n, 0.06 * n);
                System.out.printf("%.2f", min);
            }
        }
    }
}
