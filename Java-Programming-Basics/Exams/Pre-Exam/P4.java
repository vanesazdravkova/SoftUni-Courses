package PreExam;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double litersTotal = 0;
        double gradesTotal = 0;

        for (int i = 1; i <= n; i++) {
            double litersToday = Double.parseDouble(scanner.nextLine());
            double gradesToday = Double.parseDouble(scanner.nextLine());

            litersTotal += litersToday;
            gradesToday = litersToday * gradesToday;
            gradesTotal += gradesToday;
        }

        double averageGrades = gradesTotal / litersTotal;

        System.out.printf("Liter: %.2f%n", litersTotal);
        System.out.printf("Degrees: %.2f%n", averageGrades);

        if (averageGrades < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageGrades <= 42) {
            System.out.println("Super!");
        } else if (averageGrades > 42) {
            System.out.println("Dilution with distilled water!");
        }

    }
}
