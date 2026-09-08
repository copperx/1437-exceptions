import java.util.Scanner;

// Instructions: Make this program loop until the user
// enters a valid integer, then print the result.

public class Loop {
    Scanner in = new Scanner(System.in);
    int age = 0;
    boolean valid = false;   // <-- hint: you might want to use this for the loop
    while(!valid) {
        System.out.print("How old are you? ");
        try {
            age = Integer.parseInt(in.nextLine());
            valid = true;
            
        } catch (NumberFormatException e) {
            System.out.println("That's not a whole number. Try again.");
        }
    }

    System.out.println("Next year you'll be " + (age+1));
}
