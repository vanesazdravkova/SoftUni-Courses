package PreExam;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberK = Integer.parseInt(scanner.nextLine());
        int numberL = Integer.parseInt(scanner.nextLine());
        int numberM = Integer.parseInt(scanner.nextLine());
        int numberN = Integer.parseInt(scanner.nextLine());

        String firstDigit = "";
        String secondDigit = "";
        String thirdDigit = "";
        String fourthDigit = "";
        String firstNum = "";
        String secondNum = "";

        int counter = 0;


        for (int i = numberK; i <= 8; i++) {
            for (int j = 9; j >= numberL; j--) {
                for (int k = numberM; k <= 8; k++) {
                    for (int l = 9; l >= numberN; l--) {

                        if (counter < 6) {

                            if (i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0) {

                                firstDigit = Integer.toString(i);
                                secondDigit = Integer.toString(j);
                                thirdDigit = Integer.toString(k);
                                fourthDigit = Integer.toString(l);

                                firstNum = firstDigit + secondDigit;
                                secondNum = thirdDigit + fourthDigit;

                                if (!firstNum.equals(secondNum)) {
                                    counter++;
                                    System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                } else {
                                    System.out.println("Cannot change the same player.");
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
