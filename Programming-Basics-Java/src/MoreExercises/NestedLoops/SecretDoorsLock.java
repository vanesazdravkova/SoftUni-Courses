package MoreExercises.NestedLoops;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxHundreds = Integer.parseInt(scanner.nextLine());
        int maxDecimals = Integer.parseInt(scanner.nextLine());
        int maxUnits = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= maxHundreds; i++) {
            for (int j = 1; j <= maxDecimals; j++) {
                for (int k = 1; k <= maxUnits; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {
                        System.out.printf("%d %d %d%n", i, j, k);
                    }
                }
            }
        }
    }
}
