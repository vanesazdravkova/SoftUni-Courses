package PreExam;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int distance = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double transportPrice = 0;
        double overPriceKG = 0;
        double overPriceKM = 0;
        double totalOverprice = 0;

        switch (type) {
            case "standard":
                if (weight < 1) {
                    price = distance * 0.03;
                } else if (weight < 10) {
                    price = distance * 0.05;
                }else if (weight < 40) {
                    price = distance * 0.10;
                }else if (weight < 90) {
                    price = distance * 0.15;
                }else if (weight < 150) {
                    price = distance * 0.20;
                }
                break;
            case "express":
                if (weight < 1) {
                    transportPrice = distance * 0.03;
                    overPriceKG = 0.03 * 0.80;
                    overPriceKM = weight * overPriceKG;
                    totalOverprice = distance * overPriceKM;
                    price = transportPrice + totalOverprice;
                } else if (weight < 10) {
                    transportPrice = distance * 0.05;
                    overPriceKG = 0.05 * 0.40;
                    overPriceKM = weight * overPriceKG;
                    totalOverprice = distance * overPriceKM;
                    price = transportPrice + totalOverprice;
                }else if (weight < 40) {
                    transportPrice = distance * 0.10;
                    overPriceKG = 0.10 * 0.05;
                    overPriceKM = weight * overPriceKG;
                    totalOverprice = distance * overPriceKM;
                    price = transportPrice + totalOverprice;
                }else if (weight < 90) {
                    transportPrice = distance * 0.15;
                    overPriceKG = 0.15 * 0.02;
                    overPriceKM = weight * overPriceKG;
                    totalOverprice = distance * overPriceKM;
                    price = transportPrice + totalOverprice;
                }else if (weight < 150) {
                    transportPrice = distance * 0.20;
                    overPriceKG = 0.20 * 0.01;
                    overPriceKM = weight * overPriceKG;
                    totalOverprice = distance * overPriceKM;
                    price = transportPrice + totalOverprice;
                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);
    }
}
