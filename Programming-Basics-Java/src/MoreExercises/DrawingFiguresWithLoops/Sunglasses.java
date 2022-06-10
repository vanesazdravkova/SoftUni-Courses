package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.printf("%s%s%s", "*".repeat(2 * n), " ".repeat(n), "*".repeat(2 * n));
            } else if (i == Math.ceil((n * 1.00) / 2)) {
                System.out.printf("*%s*%s*%s*", "/".repeat(2*n - 2), "|".repeat(n), "/".repeat(2*n - 2));
            } else {
                System.out.printf("*%s*%s*%s*", "/".repeat(2*n - 2), " ".repeat(n), "/".repeat(2*n - 2));
            }
            System.out.println();
        }
    }
}
