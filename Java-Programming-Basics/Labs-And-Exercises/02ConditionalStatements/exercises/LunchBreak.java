package ConditionalStatements.exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String series = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int totalTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = totalTime / 8.00;
        double relaxTime = totalTime / 4.00;

        double remainingTime = totalTime - (lunchTime + relaxTime);

        if (remainingTime >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", series, Math.ceil(remainingTime - episodeTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", series, Math.ceil(episodeTime - remainingTime));
        }

    }
}
