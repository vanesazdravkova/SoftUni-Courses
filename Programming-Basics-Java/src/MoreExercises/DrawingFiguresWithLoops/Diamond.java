package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= (Math.ceil((n * 1.00) / 2) * 2) - 1; i++) {
            if (i == 1 || i == n) {
                if (n % 2 == 0) {
                    System.out.printf("%s**%s", "-".repeat((n / 2) - 1), "-".repeat((n / 2) - 1));
                } else {
                    System.out.printf("%s*%s", "-".repeat((int) (Math.ceil((n * 1.00) / 2)) - 1), "-".repeat((int) (Math.ceil((n * 1.00) / 2)) - 1));
                }
            } else if (i < Math.ceil((n * 1.00) / 2)) {
                if (n % 2 == 0) {
                    System.out.printf("%s*%s*%s", "-".repeat((n / 2) - i), "-".repeat((i - 1) * 2), "-".repeat((n / 2) - i));
                } else {
                    System.out.printf("%s*%s*%s", "-".repeat((int) (Math.ceil((n * 1.00) / 2)) - i), "-".repeat(n - 2 - 2*((int)(Math.ceil((n * 1.00) / 2)) - i)), "-".repeat((int) (Math.ceil((n * 1.00) / 2)) - i));
                }
            } else if (i == Math.ceil((n * 1.00) / 2)) {
                System.out.printf("*%s*", "-".repeat(n - 2));
            } else {
                if (n % 2 == 0) {
                    System.out.printf("%s*%s*%s", "-".repeat(i - (n / 2)), "-".repeat(n - 2 - 2*(i - (n / 2))), "-".repeat(i - (n / 2)));
                } else {
                    System.out.printf("%s*%s*%s", "-".repeat(i - (int) (Math.ceil((n * 1.00) / 2))), "-".repeat(n - 2 - 2*(i - (int)(Math.ceil((n * 1.00) / 2)))), "-".repeat(i - (int) (Math.ceil((n * 1.00) / 2))));
                }
            }
            System.out.println();
        }
    }
}
