package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double percentage = 0;
        double comission = 0;

        switch (town){
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.07;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.08;
                }else if (sales > 10000) {
                    percentage = 0.12;
                } else {
                    System.out.println("error");
                }

                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.075;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.10;
                }else if (sales > 10000) {
                    percentage = 0.13;
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    percentage = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    percentage = 0.08;
                } else if (sales > 1000 && sales <= 10000) {
                    percentage = 0.12;
                }else if (sales > 10000) {
                    percentage = 0.145;
                } else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
        comission = sales * percentage;
        if (comission != 0) {
            System.out.printf("%.2f", comission);
        }
    }
}
