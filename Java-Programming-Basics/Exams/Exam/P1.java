package Exam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapterPrice = Integer.parseInt(scanner.nextLine());
        double electricityDayPrice = Double.parseDouble(scanner.nextLine());
        double profitDay = Double.parseDouble(scanner.nextLine());

        int totalVideoCardPrice = 13 * videoCardPrice;
        int totalAdapterPrice = 13 * adapterPrice;
        int totalCost = totalAdapterPrice + totalVideoCardPrice + 1000;

        double profitCardDay = profitDay - electricityDayPrice;
        double totalProfitCard = 13 * profitCardDay;
        double days = totalCost / totalProfitCard;
        int daysInt = (int)Math.ceil(days);

        System.out.println(totalCost);
        System.out.println(daysInt);

    }
}
