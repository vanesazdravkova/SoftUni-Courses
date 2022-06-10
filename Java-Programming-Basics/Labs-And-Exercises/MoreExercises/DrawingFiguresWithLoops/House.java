package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i > Math.ceil((n * 1.00) / 2)) {
                System.out.printf("|%s|", "*".repeat(n - 2));
            } else if ((i == Math.ceil(n * 1.00) / 2)) {
                System.out.printf("%s", "*".repeat(n));
            } else if (i == 1) {
                if (n % 2 == 0) {
                    System.out.printf("%s%s%s", "-".repeat(n / 2 - i), "*".repeat(2), "-".repeat(n / 2 - i));
                } else {
                    System.out.printf("%s%s%s", "-".repeat((int)(Math.ceil((n * 1.00) / 2) - i)), "*".repeat(1), "-".repeat((int)(Math.ceil((n * 1.00) / 2) - i)));
                }
            } else {
                if (n % 2 == 0) {
                    System.out.printf("%s%s%s", "-".repeat(n / 2 - i), "*".repeat(2*i), "-".repeat(n / 2 - i));
                } else {
                    System.out.printf("%s%s%s", "-".repeat((int)(Math.ceil((n * 1.00) / 2) - i)), "*".repeat(2*i - 1), "-".repeat((int)(Math.ceil((n * 1.00) / 2) - i)));
                }
            }
            System.out.println();
        }
    }
}
