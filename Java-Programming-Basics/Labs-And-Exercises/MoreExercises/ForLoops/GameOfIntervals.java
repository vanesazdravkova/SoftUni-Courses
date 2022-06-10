package MoreExercises.ForLoops;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moves = Integer.parseInt(scanner.nextLine());

        double result = 0;
        int countInvalid = 0;
        int count9 = 0;
        int count19 = 0;
        int count29 = 0;
        int count39 = 0;
        int count50 = 0;
        for (int i = 1; i <= moves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0 || number > 50) {
                result = result / 2;
                countInvalid++;
            } else if (number <= 9) {
                result += number * 0.2;
                count9++;
            } else if (number <= 19) {
                result += number * 0.3;
                count19++;
            } else if (number <= 29) {
                result += number * 0.4;
                count29++;
            } else if (number <= 39) {
                result += 50;
                count39++;
            } else if (number <= 50) {
                result += 100;
                count50++;
            }
        }

        double percentInvalid = countInvalid / (moves * 1.00) * 100;
        double percent9 = count9 / (moves * 1.00) * 100;
        double percent19 = count19 / (moves * 1.00) * 100;
        double percent29 = count29 / (moves * 1.00) * 100;
        double percent39 = count39 / (moves * 1.00) * 100;
        double percent50 = count50 / (moves * 1.00) * 100;

        System.out.printf("%.2f%n", result);
        System.out.printf("From 0 to 9: %.2f%%%n", percent9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent50);
        System.out.printf("Invalid numbers: %.2f%%%n", percentInvalid);
    }
}
