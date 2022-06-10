package MoreExercises.NestedLoops;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lastSectorString = scanner.nextLine();
        int rowsFirstSector = Integer.parseInt(scanner.nextLine());
        int placesOddRow = Integer.parseInt(scanner.nextLine());

        char lastSector = lastSectorString.charAt(0);
        char firstSector = 'A';
        int placesEvenRow = placesOddRow + 2;
        int counter = 0;
        char startSeat = 'a';

        for (char sector = firstSector; sector <= lastSector; sector++) {
            for (int i = 1; i <= rowsFirstSector; i++) {
                if (i % 2 != 0) {
                    for (int j = startSeat; j < startSeat + placesOddRow; j++) {
                        System.out.printf("%c%d%c%n", sector, i, j);
                        counter++;
                    }
                } else {
                    for (int j = startSeat; j < startSeat + placesEvenRow ; j++) {
                        System.out.printf("%c%d%c%n", sector, i, j);
                        counter++;
                    }
                }
            }
            rowsFirstSector++;
        }
        System.out.println(counter);
    }
}
