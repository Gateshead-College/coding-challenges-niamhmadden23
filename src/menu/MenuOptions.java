package menu;

import java.util.Scanner;

public class MenuOptions {
    Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        MenuOptions menu = new MenuOptions();
        menu.displayMenu();
    }
        // menu options
        private void displayMenu() {
            System.out.println("Please select an option from our menu...");
            System.out.println("1 - Paella...");
            System.out.println("2 - Jerk Chicken with rice n peas...");
            System.out.println("3 - Steak and chips...");
            System.out.println("4 - Exit...");

            // get user choice
            int userChoice = Integer.parseInt(myScanner.nextLine());

            // output after choice
            switch (userChoice) {
                case 1:
                    System.out.println("You chose Paella..");
                    displayMenu();
                case 2:
                    System.out.println("You chose a Jamaican classic");
                    displayMenu();
                case 3:
                    System.out.println("Gotta get that protein...and carbs...");
                    displayMenu();
                case 4:
                    System.out.println("Not hungry?...");
                    System.exit(4);
                    // break;
                default:
                    System.out.println("Pick something between 1 and 4...");
            }
        }

    }
