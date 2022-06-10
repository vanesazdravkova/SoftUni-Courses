package MoreExercises.NestedLoops;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start1 = Integer.parseInt(scanner.nextLine());
        int start2 = Integer.parseInt(scanner.nextLine());
        int difference1 = Integer.parseInt(scanner.nextLine());
        int difference2 = Integer.parseInt(scanner.nextLine());

        for (int i = start1; i <= start1 + difference1; i++) {
            for (int j = start2; j <= start2 + difference2; j++) {
                boolean isFirstNumPrime = true;
                boolean isSecondNumPrime = true;
                for (int k = 2; k <= Math.sqrt(i); k++) {
                    if (i % k == 0) {
                        isFirstNumPrime = false;
                        break;
                    }
                }
                    for (int l = 2; l <= Math.sqrt(j); l++) {
                        if (j % l == 0) {
                            isSecondNumPrime = false;
                            break;
                        }
                    }
                if (isFirstNumPrime && isSecondNumPrime) {
                    System.out.println(String.valueOf(i) + String.valueOf(j));
                }
            }
        }

    }
}
