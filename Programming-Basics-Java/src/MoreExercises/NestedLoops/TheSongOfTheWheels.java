package MoreExercises.NestedLoops;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        String password = "";

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if (i * j + k * l == num && i < j && k > l) {
                            counter++;

                            if (counter == 4) {
                                password = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l);
                            }

                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
        System.out.println();
        if (counter >= 4) {
            System.out.printf("Password: %s", password);
        } else {
            System.out.println("No!");
        }
    }
}
