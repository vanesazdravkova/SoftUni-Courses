package ForLoop.exercises;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                n1++;
            }else if (number <= 399) {
                n2++;
            }else if (number <= 599) {
                n3++;
            }else if (number <= 799) {
                n4++;
            }else {
                n5++;
            }
        }

        double p1 = n1 / n * 100;
        double p2 = n2 / n * 100;
        double p3 = n3 / n * 100;
        double p4 = n4 / n * 100;
        double p5 = n5 / n * 100;

        System.out.printf("%.2f%%%n", p1);
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);
        System.out.printf("%.2f%%%n", p5);
    }
}
