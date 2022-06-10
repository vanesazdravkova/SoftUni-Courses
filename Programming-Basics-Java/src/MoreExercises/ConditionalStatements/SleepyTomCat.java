package MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int freeDays = Integer.parseInt(scanner.nextLine());

        int playTime = freeDays * 127 + (365 - freeDays) * 63;

        if (playTime >= 30000) {
            System.out.println("Tom will run away");

            int additionalMinutes = playTime - 30000;
            int hours = additionalMinutes / 60;
            int minutes = additionalMinutes % 60;

            System.out.printf("%d hours and %d minutes more for play", hours, minutes);
        } else {
            System.out.println("Tom sleeps well");

            int minutesLeft = 30000 - playTime;
            int hours = minutesLeft / 60;
            int minutes = minutesLeft % 60;

            System.out.printf("%d hours and %d minutes less for play", hours, minutes);
        }
    }
}
