package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int plastic = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hoursWork = Integer.parseInt(scanner.nextLine());

        double plasticPrice = (plastic + 2) * 1.50;
        double paintPrice = (paint + (paint * 10 / 100.00)) * 14.50;
        double thinnerPrice = thinner * 5.00;
        double plasticBags = 0.40;

        double sumMaterials = plasticPrice + paintPrice + thinnerPrice + plasticBags;
        double workPrice = hoursWork * (sumMaterials * 30 / 100);

        double sum = sumMaterials + workPrice;

        System.out.println(sum);

    }
}
