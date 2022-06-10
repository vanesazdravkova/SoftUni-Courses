package MoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = Math.PI * Math.pow(r, 2);
        double calculatedPerimeter = 2 * Math.PI * r;

        System.out.printf("%.2f", calculatedArea);
        System.out.println();
        System.out.printf("%.2f", calculatedPerimeter);
    }
}
