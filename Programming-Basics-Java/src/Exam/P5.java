package Exam;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int adultsCounter = 0;
        int kidsCounter = 0;

        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);

            if (age <= 16) {
                kidsCounter++;
            } else {
                adultsCounter++;
            }
            input = scanner.nextLine();
        }

        int toysCost = kidsCounter * 5;
        int sweatersCost = adultsCounter * 15;

        System.out.printf("Number of adults: %d%n", adultsCounter);
        System.out.printf("Number of kids: %d%n", kidsCounter);
        System.out.printf("Money for toys: %d%n", toysCost);
        System.out.printf("Money for sweaters: %d%n", sweatersCost);

    }
}
