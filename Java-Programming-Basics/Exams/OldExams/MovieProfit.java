package ExampleExam;

import java.util.Scanner;

public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sumForOneDay = tickets * ticketPrice;
        double totalIncome = sumForOneDay * days;
        totalIncome = totalIncome * ((100 - percent) / 100.0);

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, totalIncome);

    }
}
