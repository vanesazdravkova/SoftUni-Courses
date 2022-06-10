package PreExam;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());

        int earnedMoney = 0;

        while (earnedMoney < goal) {
            String type1 = scanner.nextLine();

            if (type1.equals("closed")) {
                break;
            }

           String type2 = scanner.nextLine();

            if (type2.equals("closed")) {
                break;
            }

            switch (type1) {
                case "haircut":
                    if (type2.equals("mens")){
                        earnedMoney += 15;
                    }else if (type2.equals("ladies")) {
                        earnedMoney += 20;
                    }else if (type2.equals("kids")) {
                        earnedMoney += 10;
                    }
                    break;
                case "color":
                    if (type2.equals("touch up")) {
                        earnedMoney += 20;
                    }else if (type2.equals("full color")) {
                        earnedMoney += 30;
                    }
                    break;
            }

        }
        if (earnedMoney >= goal) {
            System.out.println("You have reached your target for the day!");
        } else {
            System.out.printf("Target not reached! You need %dlv. more.%n", goal - earnedMoney);
        }
        System.out.printf("Earned money: %dlv.", earnedMoney);
    }
}