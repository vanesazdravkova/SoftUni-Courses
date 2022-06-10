package FirstStepsInCoding.lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double centimeters = a * 2.54;
        System.out.println(centimeters);
    }
}
