package MoreExercises.NestedLoops;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int total = Integer.parseInt(scanner.nextLine());

        char aA = 35;
        char bB = 64;
        int count = 1;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (count > total) {
                    return;
                }
                System.out.printf("%c%c%d%d%c%c|", aA, bB, i, j, bB, aA);

                aA++;
                bB++;
                count++;

                if (aA > 55) {
                    aA = 35;
                }
                if (bB > 96) {
                    bB = 64;
                }
            }
        }
    }
}