package SortedStackPackage.src;
/**
 * The Main class serves as the entry point for the program.
 * It initializes the input handler and stack, then
 * collects user input to store in the sorted stack.
 */
public class Main {
    /**
     * The main method that serves as the entry point of the program.
     * 
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler(); // instantiate InputHandler 
        SortedStack sortedStack = new SortedStack(); // instantiate SortedStack

        inputHandler.collectInput(sortedStack); // call method to store values in the sorted stack
        System.out.println("Final sorted list: " + sortedStack); // print the current stack
    }
}
