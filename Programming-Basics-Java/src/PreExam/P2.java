package PreExam;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());
        int countLoveLetters = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int keyholder = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int luck = Integer.parseInt(scanner.nextLine());

        double priceLoveLetters = countLoveLetters * 0.60;
        double priceRoses = countRoses * 7.20;
        double priceKey = keyholder * 3.60;
        double priceCaricatures = caricatures * 18.20;
        double priceLuck = luck * 22;

        double sum = priceLoveLetters + priceRoses + priceKey + priceCaricatures + priceLuck;
        int countArticles = countLoveLetters + countRoses + keyholder + caricatures + luck;

        if (countArticles >= 25) {
            sum = sum - (sum * 0.35);
        }

        double finalSum = sum * 0.90;

        if (finalSum >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", finalSum - priceParty);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - finalSum);
        }

    }
}
