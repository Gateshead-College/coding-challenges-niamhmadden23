package menu;

import java.util.Scanner;

public class MenuOptions {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // menu options
        System.out.println("Please select an option from our menu...");
        System.out.println("1 - Paella...");
        System.out.println("2 - Jerk Chicken with rice n peas...");
        System.out.println("3 - Steak and chips...");
        System.out.println("4 - Exit...");

        // get user choice
        int userChoice = myScanner.nextInt();

        // output after choice
        switch (userChoice){
            case 1:
                System.out.println("You chose Paella..");
                break;
            case 2:
                System.out.println("You chose a Jamaican classic");
                break;
            case 3:
                System.out.println("Gotta get that protein...and carbs...");
                break;
            case 4:
                System.out.println("Not hungry?...");
                // System.exit(0);
                break;
            default:
                System.out.println("Pick something between 1 and 4...");
        }
    }


}
