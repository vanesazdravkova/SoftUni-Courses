package MoreExercises.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorBikers = Integer.parseInt(scanner.nextLine());
        int seniorBikers = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();

        double charitySum = 0;

        switch (type) {
            case "trail":
                charitySum = juniorBikers * 5.50 + seniorBikers * 7;
                charitySum -= charitySum * 0.05;
                break;
            case "cross-country":
                charitySum = juniorBikers * 8 + seniorBikers * 9.50;
                charitySum -= charitySum * 0.05;
                if (juniorBikers + seniorBikers >= 50) {
                    charitySum -= charitySum * 0.25;
                }
                break;
            case "downhill":
                charitySum = juniorBikers * 12.25 + seniorBikers * 13.75;
                charitySum -= charitySum * 0.05;
                break;
            case "road":
                charitySum = juniorBikers * 20 + seniorBikers * 21.50;
                charitySum -= charitySum * 0.05;
                break;
        }

        System.out.printf("%.2f", charitySum);

    }
}
