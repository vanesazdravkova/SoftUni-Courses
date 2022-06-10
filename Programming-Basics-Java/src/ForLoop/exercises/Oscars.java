package ForLoop.exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double allJudgesPoints = 0;

        for (int i = 0; i < judges; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            points = judgeName.length() * judgePoints / 2;
            allJudgesPoints += points;

            if (allJudgesPoints + academyPoints > 1250.5) {
                break;
            }

        }

        double totalPoints = allJudgesPoints + academyPoints;

        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, (1250.5 - totalPoints));
        }
    }
}
