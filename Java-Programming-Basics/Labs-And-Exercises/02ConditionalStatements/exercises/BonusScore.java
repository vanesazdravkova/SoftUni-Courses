package ConditionalStatements.exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus = bonus + 5;
        } else if (number <= 1000) {
            bonus = number * 0.20;
            System.out.println();
        } else {
            bonus = number * 0.10;
        }

        if (number % 2 == 0) {
            bonus = bonus + 1;
        }

        if (number % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + number);

    }
}
