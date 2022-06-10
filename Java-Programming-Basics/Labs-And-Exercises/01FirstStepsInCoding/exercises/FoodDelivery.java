package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chicken * 10.35;
        double fishPrice = fish * 12.40;
        double vegetarianPrice = vegetarian * 8.15;

        double firstSum = chickenPrice + fishPrice + vegetarianPrice;
        double desert = firstSum * 20 / 100;
        double delivery = 2.50;

        double endSum = firstSum + desert + delivery;

        System.out.println(endSum);
    }
}
