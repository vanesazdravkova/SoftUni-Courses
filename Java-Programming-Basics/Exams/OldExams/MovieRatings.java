package ExampleExam;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moviesCount = Integer.parseInt(scanner.nextLine());
        double sumRatings = 0;
        double minRating = Double.POSITIVE_INFINITY;
        double maxRating = Double.NEGATIVE_INFINITY;
        String movieHighestRating = "";
        String movieLowestRating = "";

        for (int i = 1; i <= moviesCount; i++) {
            String movieName = scanner.nextLine();;
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings += rating;

            if (minRating > rating) {
                minRating = rating;
                movieLowestRating = movieName;
            }

            if (maxRating < rating) {
                maxRating = rating;
                movieHighestRating = movieName;
            }
        }
        double averageRating = sumRatings / moviesCount;
        System.out.printf("%s is with highest rating: %.1f%n", movieHighestRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieLowestRating, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
