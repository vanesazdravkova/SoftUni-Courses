package MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < 2 * n; i++) {
                if (i < n) {
                    System.out.printf("%s%s%s", " ".repeat(n - i), "* ".repeat(i), " ".repeat(n - i));
                } else if (i == n) {
                    System.out.printf("%s", "* ".repeat(n));
                } else {
                    System.out.printf("%s%s%s", " ".repeat(i - n), "* ". repeat(2 * n - i), " ".repeat(i - n));
                }
            System.out.println();
        }
    }
}
