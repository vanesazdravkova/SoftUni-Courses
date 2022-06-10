package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scanner.nextLine());

        double shoes = pricePerYear - (pricePerYear * 40 / 100);
        double outfit = shoes - (shoes * 20 / 100);
        double ball = outfit / 4;
        double accessories = ball / 5;

        double sum = pricePerYear + shoes + outfit + ball + accessories;

        System.out.println(sum);
    }
}
