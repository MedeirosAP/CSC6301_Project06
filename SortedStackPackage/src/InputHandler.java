package SortedStackPackage.src;

import java.util.Scanner;

/**
 * The InputHandler class is responsible for collecting user input and
 * inserting it into the SortedStack.
 */
public class InputHandler {
    private Scanner scanner; // Attribute: scanner

    /**
     * Constructs an InputHandler and initializes the Scanner.
     */
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Collects user input and inserts the input numbers into the provided sorted stack.
     *
     * @param sortedList the sorted linked list to which numbers are to be added
     */
    public void collectInput(SortedStack sortedStack) {
        System.out.println("Enter numbers to add to the sorted stack. Type 'exit' to finish.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) { // if user inputs ' exit' break the loop
                break;
            }

            try { // otherwise store the user input value 
                int number = Integer.parseInt(input);
                sortedStack.insertInOrder(number);
                System.out.println("Current list: " + sortedStack);
            } catch (NumberFormatException e) { // catch exceptions
                System.out.println("Please enter a valid number or type 'exit' to finish.");
            }
        }

        scanner.close(); 
    }
}
