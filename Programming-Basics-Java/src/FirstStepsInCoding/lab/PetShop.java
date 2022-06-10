package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsFoodCount = Integer.parseInt(scanner.nextLine());
        int catsFoodCount = Integer.parseInt(scanner.nextLine());

        double dogsFoodPrice = dogsFoodCount * 2.50;
        double catsFoodPrice = catsFoodCount * 4;
        double receipt = dogsFoodPrice + catsFoodPrice;

        System.out.println(receipt + " lv.");
    }
}
