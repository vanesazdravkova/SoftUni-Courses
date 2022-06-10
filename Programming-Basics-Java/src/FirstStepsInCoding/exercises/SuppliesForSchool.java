package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensPackets = Integer.parseInt(scanner.nextLine());
        int markersPackets = Integer.parseInt(scanner.nextLine());
        int chemicalLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pensPackets * 5.80;
        double markersPrice = markersPackets * 7.20;
        double chemicalPrice = chemicalLiters * 1.20;
        double sum = pensPrice + markersPrice + chemicalPrice;

        double endSum = sum - (sum * discount / 100);

        System.out.println(endSum);
    }
}
