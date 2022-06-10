package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int liters = Integer.parseInt(scanner.nextLine());

        if (type.equals("Diesel")) {
            if (liters >= 25) {
                System.out.printf("You have enough diesel.");
            } else {
                System.out.printf("Fill your tank with diesel!");
            }
        } else if (type.equals("Gasoline")) {
            if (liters >= 25) {
                System.out.printf("You have enough gasoline.");
            } else {
                System.out.printf("Fill your tank with gasoline!");
            }
        } else if (type.equals("Gas")) {
            if (liters >= 25) {
                System.out.printf("You have enough gas.");
            } else {
                System.out.printf("Fill your tank with gas!");
            }
        } else
            System.out.println("Invalid fuel!");
    }
}
