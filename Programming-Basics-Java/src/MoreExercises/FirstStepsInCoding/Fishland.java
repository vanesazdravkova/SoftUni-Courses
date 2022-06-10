package MoreExercises.FirstStepsInCoding;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudWeight = Double.parseDouble(scanner.nextLine());
        double safridWeight = Double.parseDouble(scanner.nextLine());
        int midiWeight = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skumriqPrice + (skumriqPrice * 0.6);
        double safridPrice = cacaPrice + (cacaPrice * 0.8);
        double midiPrice = 7.50;

        double sum = palamudWeight * palamudPrice + safridWeight * safridPrice + midiWeight * midiPrice;

        System.out.printf("%.2f", sum);
    }
}
