package ForLoop.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (maxValue < number) {
                maxValue = number;
            }

            if (minValue > number) {
                minValue = number;
            }

        }
        System.out.println("Max number: " + maxValue);
        System.out.println("Min number: " + minValue);
    }
}
