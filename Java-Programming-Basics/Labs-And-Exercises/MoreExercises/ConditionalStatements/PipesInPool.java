package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double workP1 = p1 * h;
        double workP2 = p2 * h;

        if (workP1 + workP2 <= v) {
            double percent = (workP1 + workP2) / v * 100;
            double percentP1 = workP1 / (workP1 + workP2) * 100;
            double percentP2 = workP2 / (workP1 + workP2) * 100;

            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percent, percentP1, percentP2);
        } else {
            double overflow = (workP1 + workP2) - v;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }
    }
}
