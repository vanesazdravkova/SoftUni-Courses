package MoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double h = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());

        double line = (w * 100 - 100) / 70;
        int lineInt = (int)line;
        double column = h * 100 / 120;
        int columnInt = (int)column;
        int workArea = lineInt * columnInt;

        System.out.println(workArea - 3);
    }
}
