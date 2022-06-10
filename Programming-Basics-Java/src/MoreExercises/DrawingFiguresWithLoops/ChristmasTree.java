package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= n; i++) {
            System.out.printf("%s%s | %s%s", " ".repeat(n - i), "*".repeat(i), "*".repeat(i), " ".repeat(n - i));
            System.out.println();
        }
    }
}
