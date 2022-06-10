package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());

        double profit = 3.25 * magnolia + 4 * hyacinth + 3.50 * roses + 8 * cactus;
        double profitAfterTaxes = profit - (profit * 0.05);

        if (profitAfterTaxes >= price) {
            System.out.printf("She is left with %.0f leva.", Math.floor(profitAfterTaxes - price));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(price - profitAfterTaxes));
        }
    }
}
