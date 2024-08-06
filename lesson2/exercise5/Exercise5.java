package lesson2.exercise5;

// Using the Scanner class to read input from the keyboard
import java.util.Scanner;

public class Exercise5 {
    static void main(String[] args) {

        // Declare variables
        String name;

        // Initialize the Scanner object for reading input from the keyboard
        Scanner myScanner = new Scanner(System.in);
        
        // Prompt the user to enter their name using the NextLine method of the Scanner object
        System.out.print("Enter your name: ");
        name = myScanner.nextLine();

        // Display the user's name
        System.out.println("Hello " + name + "!");

        // Close the Scanner object (not require but recommended)
        myScanner.close();
    }
}
