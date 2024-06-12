package LinkedListPackage.src;

import java.util.Scanner;

/**
 * The InputHandler class is responsible for collecting user input and
 * inserting it into the SortedLinkedList.
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
     * Collects user input and inserts the input numbers into the provided sorted linked list.
     *
     * @param sortedList the sorted linked list to which numbers are to be added
     */
    public void collectInput(SortedLinkedList sortedList) {
        System.out.println("Enter numbers to add to the sorted list. Type 'exit' to finish.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) { // if user inputs ' exit' break the loop
                break;
            }

            try { // otherwise store the user input value 
                int number = Integer.parseInt(input);
                sortedList.insertInOrder(number);
                System.out.println("Current list: " + sortedList);
            } catch (NumberFormatException e) { // catch exceptions
                System.out.println("Please enter a valid number or type 'exit' to finish.");
            }
        }

        scanner.close(); 
    }
}
