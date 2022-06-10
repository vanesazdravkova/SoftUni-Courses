package MoreExercises.NestedLoops;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char c1 = scanner.next().charAt(0);
        char c2 = scanner.next().charAt(0);
        char c3 = scanner.next().charAt(0);
        int counter = 0;

        for (char i = c1; i <= c2; i++) {
            for (char j = c1; j <= c2; j++) {
                for (char k = c1; k <= c2; k++) {
                    if (i != c3 && j != c3 && k != c3) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
