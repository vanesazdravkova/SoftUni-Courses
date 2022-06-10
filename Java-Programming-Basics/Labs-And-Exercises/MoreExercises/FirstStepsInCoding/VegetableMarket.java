package MoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegiPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegiWeight = Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());

        double sumLeva = vegiPrice * vegiWeight + fruitPrice * fruitWeight;
        double sumEuro = sumLeva / 1.94;

        System.out.printf("%.2f", sumEuro);
    }
}
