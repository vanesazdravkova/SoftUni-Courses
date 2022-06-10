package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double i = Double.parseDouble(scanner.nextLine());

        while (i >= 0) {
            i *= 2;
            System.out.printf("Result: %.2f", i);
            System.out.println();
            i = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Negative number!");
    }
}
