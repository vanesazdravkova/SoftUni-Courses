package MoreExercises.NestedLoops;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int males = Integer.parseInt(scanner.nextLine());
        int females = Integer.parseInt(scanner.nextLine());
        int tablesMax = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        for (int i = 1; i <= males; i++) {
            for (int j = 1; j <= females; j++) {
                if (counter > tablesMax) {
                    break;
                } else {
                    System.out.printf("(%d <-> %d) ", i, j);
                    counter++;
                }
            }
        }
    }
}
