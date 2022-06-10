package MoreExercises.WhileLoops;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean commandC = false;
        boolean commandO = false;
        boolean commandN = false;
        String currentResult = "";
        String result = "";

        while (!input.equals("End")) {

            char currentSymbol = input.charAt(0);

            if (currentSymbol >= 65 && currentSymbol <= 90 || currentSymbol >= 97 && currentSymbol <= 98
                || currentSymbol >= 100 && currentSymbol <= 109 || currentSymbol >= 112 && currentSymbol <= 122) {
                currentResult += currentSymbol;
            } else if (currentSymbol == 99) {
                if (commandC == false) {
                    commandC = true;
                } else {
                    currentResult += currentSymbol;
                }
            } else if (currentSymbol == 111) {
                if (commandO == false) {
                    commandO = true;
                } else {
                    currentResult += currentSymbol;
                }
            } else if (currentSymbol == 110) {
                if (commandN == false) {
                    commandN = true;
                } else {
                    currentResult += currentSymbol;
                }
            }

            if (commandC && commandO && commandN) {
                result += currentResult + " ";
                currentResult = "";
                commandC = false;
                commandO = false;
                commandN = false;
            }

            input = scanner.nextLine();
        }
        System.out.println(result);
    }
}
