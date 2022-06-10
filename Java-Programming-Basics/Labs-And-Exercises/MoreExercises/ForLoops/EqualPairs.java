package MoreExercises.ForLoops;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentDouble = 0;
        int previousDouble = 0;
        int maxDif = 0;

        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            if (i > 1) {
              previousDouble = currentDouble;
              currentDouble = number1 + number2;
                if (Math.abs(currentDouble - previousDouble) > maxDif) {
                    maxDif = Math.abs(currentDouble - previousDouble);
                }
            } else {
                currentDouble = number1 + number2;
            }
        }

        if (maxDif > 0) {
            System.out.printf("No, maxdiff=%d", maxDif);
        } else if (maxDif == 0) {
            System.out.printf("Yes, value=%d", currentDouble);
        }
    }
}
