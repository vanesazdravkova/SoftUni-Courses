package MoreExercises.ForLoops;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int totalFans = Integer.parseInt(scanner.nextLine());

        int sectorA = 0;
        int sectorB = 0;
        int sectorV = 0;
        int sectorG = 0;

        for (int i = 1; i <= totalFans; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                sectorA++;
            } else if (sector.equals("B")) {
                sectorB++;
            } else if (sector.equals("V")) {
                sectorV++;
            } else if (sector.equals("G")) {
                sectorG++;
            }
        }

        double percentA = sectorA / (totalFans * 1.00) * 100;
        double percentB = sectorB / (totalFans * 1.00) * 100;
        double percentV = sectorV / (totalFans * 1.00) * 100;
        double percentG = sectorG / (totalFans * 1.00) * 100;
        double percentFans = totalFans / (capacity * 1.00) * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentFans);
    }
}
