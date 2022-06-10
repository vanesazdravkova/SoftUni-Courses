package NestedLoops.exercises;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int currentNumber = 0;
        boolean flag = false;

        for (int rows = 1; rows <= number; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                currentNumber++;
                if (currentNumber > number) {
                    flag = true;
                    break;
                }
                System.out.print(currentNumber + " ");
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
