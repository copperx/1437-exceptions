import java.util.Scanner;
public class Crash
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        try {
            int age = Integer.parseInt(in.nextLine());
            System.out.println("Next year you'll be " + (age+1));
        } catch(NumberFormatException e) {
            System.out.println("That's not a whole number. Try again.");
        }
    }
}