package MoreExercises.WhileLoops;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int detergent = bottles * 750;

        String input = scanner.nextLine();
        int counter = 1;
        int dishCounter = 0;
        int potCounter = 0;
        boolean enoughDetergent = true;

        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);

            if (counter % 3 == 0) {
                if (detergent >= dishes * 15) {
                    detergent -= dishes * 15;
                    potCounter += dishes;
                } else {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", dishes * 15 - detergent);
                    enoughDetergent = false;
                    break;
                }
            } else {
                if (detergent >= dishes * 5) {
                    detergent -= dishes * 5;
                    dishCounter += dishes;
                } else {
                    System.out.printf("Not enough detergent, %d ml. more necessary!", dishes * 5 - detergent);
                    enoughDetergent = false;
                    break;
                }
            }

            counter++;
            input = scanner.nextLine();
        }

        if (enoughDetergent) {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", dishCounter, potCounter);
            System.out.printf("Leftover detergent %d ml.", detergent);
        }
    }
}
