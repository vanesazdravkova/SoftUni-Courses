package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
                if (i == 1 || i == n) {
                    System.out.printf("+ %s+%n", "- ".repeat(n - 2));
                } else {
                    System.out.printf("| %s|%n", "- ".repeat(n - 2));
                }
        }
    }
}
