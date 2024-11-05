import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        
        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Set the range of the random number (for example, between 1 and 100)
        int lowerBound = 1;
        int upperBound = 100;
        
        // Generate a random number between lowerBound and upperBound
        Random random = new Random();
        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        // Variable to store the number of attempts
        int attempts = 0;
        int userGuess = -1;  // Initialize with an invalid number
        
        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I have selected a number between " + lowerBound + " and " + upperBound + ".");
        System.out.println("Can you guess it?");
        
        // Loop to allow the user to guess until they get it correct
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            
            // Read user input
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                attempts++;
                
                // Check if the guess is correct, too high, or too low
                if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                    System.out.println("It took you " + attempts + " attempts.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        }
        
        // Close the scanner
        scanner.close();
    }