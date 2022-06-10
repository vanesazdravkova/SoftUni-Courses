package Exam;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalCPU = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int totalHours = employees * workingDays * 8;
        int madeCPU = (int)Math.floor(totalHours / 3);




        if (madeCPU >= goalCPU) {
            System.out.printf("Profit: -> %.2f BGN", (madeCPU - goalCPU) * 110.10);
        } else {
            System.out.printf("Losses: -> %.2f BGN", (goalCPU - madeCPU) * 110.10);
        }

    }
}
