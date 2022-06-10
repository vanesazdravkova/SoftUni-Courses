package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrape = x * y;
        double wine = totalGrape * 0.4 / 2.5;

        if (wine >= z) {
            System.out.printf("Good harvest this year! Total wine: %d liters.", (int)Math.floor(wine));
            System.out.println();
            System.out.printf("%d liters left -> %d liters per person.", (int)Math.ceil(wine - z), (int)Math.ceil((wine - z) / workers));
        } else {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int)Math.floor(z - wine));
        }
    }
}
