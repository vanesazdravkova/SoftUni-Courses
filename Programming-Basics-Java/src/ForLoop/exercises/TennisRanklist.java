package ForLoop.exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int games = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int win = 0;

        for (int i = 1; i <= games; i++) {
            String type = scanner.nextLine();
            ;
            if (type.equals("W")) {
                points += 2000;
                win++;
            } else if (type.equals("F")) {
                points += 1200;
            } else if (type.equals("SF")) {
                points += 720;
            }
        }

        double percentWin = win * 1.00 / games * 100;
        int totalPoints = startPoints + points;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", points / games);
        System.out.printf("%.2f%%", percentWin);
    }
}
