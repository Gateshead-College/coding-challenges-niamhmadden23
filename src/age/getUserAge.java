package age;

import java.util.Scanner;

public class getUserAge {

    public static void main(String[] args) {
        int userAge;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old are you?");
        userAge = myScanner.nextInt();

        if (userAge < 16){
            System.out.println("You're a spring chicken!");
        } else if (userAge > 16 && userAge < 20){
            System.out.println("You're in your prime");
        } else if (userAge > 20 && userAge < 25) {
            System.out.println("I think it's time to get your act together!");
        }  else if (userAge > 25 && userAge< 60) {
            System.out.println("All work and no play makes Jack a dull boy...");
        } else if (userAge > 60 && userAge < 100){
            System.out.println("Time to start acting like a child again..");
        }
    }
}
