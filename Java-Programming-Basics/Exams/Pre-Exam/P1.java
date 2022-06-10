package PreExam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceCPUDolars = Double.parseDouble(scanner.nextLine());
        double priceVideoDolars = Double.parseDouble(scanner.nextLine());
        double priceRAMDolars = Double.parseDouble(scanner.nextLine());
        int countRAM = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double priceCPUleva = priceCPUDolars * 1.57;
        double priceVideoLeva = priceVideoDolars * 1.57;
        double priceRAMleva = priceRAMDolars * 1.57;

        double totalRAMleva = priceRAMleva * countRAM;
        double finalCPUleva = priceCPUleva - (priceCPUleva * percent);
        double finalVideoleva = priceVideoLeva - (priceVideoLeva * percent);

        double total = totalRAMleva + finalCPUleva + finalVideoleva;

        System.out.printf("Money needed - %.2f leva.", total);

    }
}
