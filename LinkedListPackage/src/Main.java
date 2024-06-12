package LinkedListPackage.src;
/**
 * The Main class serves as the entry point for the program.
 * It initializes the input handler and sorted linked list, then
 * collects user input to store in the sorted linked list.
 */
public class Main {
    /**
     * The main method that serves as the entry point of the program.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler(); // instantiate InputHandler 
        SortedLinkedList sortedList = new SortedLinkedList(); // instantiate SortedLinkedList 

        inputHandler.collectInput(sortedList); // call method to store values in the linked list
        System.out.println("Final sorted list: " + sortedList); // print the current list
    }
}
