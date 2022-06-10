package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodKG = Integer.parseInt(scanner.nextLine());
        double dailyDogFood = Double.parseDouble(scanner.nextLine());
        double dailyCatFood = Double.parseDouble(scanner.nextLine());
        double dailyTurtleFood = Double.parseDouble(scanner.nextLine());

        double neededFood = (dailyDogFood + dailyCatFood + dailyTurtleFood / 1000) * days;

        if (foodKG >= neededFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodKG - neededFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(neededFood - foodKG));
        }
    }
}
