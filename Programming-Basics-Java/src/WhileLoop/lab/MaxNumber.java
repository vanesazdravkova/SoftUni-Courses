package WhileLoop.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int maxValue = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);

            if (maxValue < number) {
                maxValue = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxValue);
    }
}
