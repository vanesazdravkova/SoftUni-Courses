package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double sandPerc = Double.parseDouble(scanner.nextLine());

        double volume = length * width * height;
        double volumeLiters = volume / 1000;
        double liters = volumeLiters * (1 - (sandPerc / 100));

        System.out.println(liters);

    }
}
