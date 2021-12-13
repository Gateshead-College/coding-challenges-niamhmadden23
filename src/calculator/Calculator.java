package calculator;

import java.util.Scanner;

public class Calculator {

    Scanner myScanner = new Scanner(System.in);
    // variables
    double firstNumber;
    double secondNumber;
    String operand;
    double resultOfCalc;
    double memoryOfCalc;

    // main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.getFirstNum();
    }

    private void getFirstNum() {
        System.out.println("Please enter your first number...");
        String input = myScanner.nextLine();
        if (input.equalsIgnoreCase("mr")){
            firstNumber = memoryOfCalc;
        }
        else if (input.equalsIgnoreCase("mc")){
            memoryOfCalc = 0;
            getFirstNum();
        }
        else {
            firstNumber = Double.parseDouble(input);
        }
        getOperand();
    }

    private void getOperand() {
        System.out.println("Please enter the operand you want to use...");
        operand = myScanner.nextLine();
        if (!requiresSecond()){
            performCalc();
        }
        else {
            getSecondNum();
        }
    }
    private void getSecondNum(){
        System.out.println(firstNumber + " " + operand);
        System.out.println("Enter second number..");
        String input = myScanner.nextLine();
        if (input.equalsIgnoreCase("mr")){
            secondNumber = memoryOfCalc;
        }
        else {
            secondNumber = Double.parseDouble(input);
        }
        performCalc();
    }
    private void performCalc(){

        if(requiresSecond()){

            System.out.println(firstNumber + " " + operand + " " + secondNumber);
        }
        else {

            System.out.println(operand + " of " + firstNumber);
        }

        switch(operand){

            case "+":
                resultOfCalc = firstNumber + secondNumber;
                System.out.println(resultOfCalc);
                break;

            case "-":

                resultOfCalc = firstNumber - secondNumber;
                System.out.println(resultOfCalc);
                break;

            case "/":

                resultOfCalc = firstNumber / secondNumber;
                System.out.println(resultOfCalc);
                break;

            case "*":

                resultOfCalc = firstNumber * secondNumber;
                System.out.println(resultOfCalc);
                break;

            case "pow":

                resultOfCalc = Math.pow(firstNumber, secondNumber);
                System.out.println(resultOfCalc);
                break;

            case "sqrt":

                resultOfCalc = Math.sqrt(firstNumber);
                System.out.println(resultOfCalc);
                break;

            case "sq":

                resultOfCalc = firstNumber * firstNumber;
                System.out.println(resultOfCalc);
                break;

            case "rec":

                resultOfCalc = 1 / firstNumber;
                System.out.println(resultOfCalc);
                break;

            case "m+":

                memoryOfCalc += firstNumber;
                getOperand();
                break;

            case "m-":

                memoryOfCalc -= firstNumber;
                getOperand();
                break;

            case "mc":

                memoryOfCalc = 0.0;
                System.out.println(resultOfCalc);
                break;


        }

        System.out.println("Do you want to perform another calculation on this result?");

        if(myScanner.nextLine().equalsIgnoreCase("y")){

            firstNumber = resultOfCalc;

            getOperand();
        }
        else {

            getFirstNum();
        }
    }


    private boolean requiresSecond(){

        switch(operand){
            case "sqrt":
            case "sq":
            case "rec":
            case "m+":
            case "m-":
                return false;
        }

        return true;
    }

}
