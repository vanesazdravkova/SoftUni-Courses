package MoreExercises.ForLoops;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        double sumGrades = 0;
        double averageGrade = 0;
        int countFails = 0;
        int count3to4 = 0;
        int count4to5 = 0;
        int count5to6 = 0;
        for (int i = 1; i <= students; i++) {

            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 2.00 && grade <= 2.99) {
                countFails++;
            } else if (grade >= 3 && grade <= 3.99) {
                count3to4++;
            } else if (grade >= 4 && grade <= 4.99) {
                count4to5++;
            } else if (grade >= 5) {
                count5to6++;
            }

            sumGrades += grade;
        }
        averageGrade = sumGrades / (students * 1.00);
        double failsPercent = countFails / (students * 1.00) * 100;
        double threeTo4Percent = count3to4 / (students * 1.00) * 100;
        double fourTo5Percent = count4to5 / (students * 1.00) * 100;
        double topStudentsPercent = count5to6 / (students * 1.00) * 100;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", fourTo5Percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", threeTo4Percent);
        System.out.printf("Fail: %.2f%%%n", failsPercent);
        System.out.printf("Average: %.2f%n", averageGrade);
    }
}