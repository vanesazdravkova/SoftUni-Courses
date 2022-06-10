package MoreExercises.NestedLoops;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int endSymbols = 97 + l;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 97; k < endSymbols; k++) {
                    for (int p = 97; p < endSymbols; p++) {
                        for (int o = 1; o <= n; o++) {
                            if (o > i && o > j) {
                                String s1 = Character.toString(k);
                                String s2 = Character.toString(p);
                                System.out.printf("%d%d%s%s%d ", i, j, s1, s2, o);
                            }
                        }
                    }
                }
            }
        }
    }
}
