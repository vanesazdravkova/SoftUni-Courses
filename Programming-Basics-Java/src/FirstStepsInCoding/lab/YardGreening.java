package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters = Double.parseDouble(scanner.nextLine());

        double firstPrice = meters * 7.61;
        double discount = firstPrice * 0.18;
        double finalPrice = firstPrice - discount;

        System.out.printf("The final price is: %f lv.", finalPrice);
        System.out.println();
        System.out.printf("The discount is: %f lv.", discount);
    }
}
