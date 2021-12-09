package simple_calculator;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        String operand;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your first number...");
        firstNumber = myScanner.nextInt();
        System.out.println("Please enter your operand...");
        operand = myScanner.next();
        System.out.println("Please enter your second number");
        secondNumber = myScanner.nextInt();

        if (operand.equals("+")){
            System.out.println("The answer: " + (firstNumber + secondNumber));
        }
        if (operand.equals("-")) {
            System.out.println("The answer: " + (firstNumber - secondNumber));
        }
        if (operand.equals("/")) {
            System.out.println("The answer: " + (firstNumber / secondNumber));
        }
        if (operand.equals("*")){
            System.out.println("The answer: " + (firstNumber * secondNumber));
        }
    }
}
