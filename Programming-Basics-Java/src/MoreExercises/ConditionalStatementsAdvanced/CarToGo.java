package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String classCar = "";
        String typeCar = "";
        double priceCar = 0;

        if (budget <= 100) {
            classCar = "Economy class";
        } else if (budget <= 500) {
            classCar = "Compact class";
        } else {
            classCar = "Luxury class";
        }

        switch (classCar) {
            case "Economy class":
                if (season.equals("Summer")) {
                    typeCar = "Cabrio";
                    priceCar = budget * 0.35;
                } else if (season.equals("Winter")) {
                    typeCar = "Jeep";
                    priceCar = budget * 0.65;
                }
                break;
            case "Compact class":
                if (season.equals("Summer")) {
                    typeCar = "Cabrio";
                    priceCar = budget * 0.45;
                } else if (season.equals("Winter")) {
                    typeCar = "Jeep";
                    priceCar = budget * 0.80;
                }
                break;
            case "Luxury class":
                    typeCar = "Jeep";
                    priceCar = budget * 0.90;
                break;
        }

        System.out.println(classCar);
        System.out.printf("%s - %.2f", typeCar, priceCar);
    }
}
