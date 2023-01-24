package Metods;

import java.util.Scanner;

public class V11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double secondNum = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f",operations(firstNum,operator,secondNum));
    }

    private static double operations(double first, String operator, double second) {
        double result = 0;
        switch (operator) {
            case "/" -> result = first / second;
            case "*" -> result = first * second;
            case "-" -> result = first - second;
            case "+" -> result = first + second;
        }
        return result;
    }

}
