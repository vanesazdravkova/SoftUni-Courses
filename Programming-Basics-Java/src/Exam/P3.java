package Exam;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String breed = scanner.nextLine();
        String gender = scanner.nextLine();

        double humanMonths = 0;
        int catMonths = 0;

        switch (breed) {
            case "British Shorthair":
                if (gender.equals("m")) {
                    humanMonths = 13 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 14 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            case "Siamese":
                if (gender.equals("m")) {
                    humanMonths = 15 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 16 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            case "Persian":
                if (gender.equals("m")) {
                    humanMonths = 14 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 15 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            case "Ragdoll":
                if (gender.equals("m")) {
                    humanMonths = 16 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 17 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            case "American Shorthair":
                if (gender.equals("m")) {
                    humanMonths = 12 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 13 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            case "Siberian":
                if (gender.equals("m")) {
                    humanMonths = 11 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                } else {
                    humanMonths = 12 * 12;
                    catMonths = (int)Math.floor(humanMonths / 6);
                }
                break;
            default:
                System.out.printf("%s is invalid cat!", breed);
                break;
        }

        if (breed.equals("British Shorthair") || breed.equals("Siamese") || breed.equals("Persian") || breed.equals("Ragdoll") ||
                breed.equals("American Shorthair") || breed.equals("Siberian")) {
            System.out.printf("%d cat months", catMonths);
        }

    }
}
