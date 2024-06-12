package SortedStackPackage.src;

import java.util.Stack;

/**
 * The SortedStack class that maintains a stack of integers in sorted order.
 */
public class SortedStack {
    private Stack<Integer> stack; // Attribute: stack

    /**
     * Constructs an empty SortedStack.
     */
    public SortedStack() {
        stack = new Stack<>(); // create a new stack
    }

    /**
     * Inserts a number into the stack, maintaining sorted order.
     * 
     * @param number The number to be inserted.
     */
    public void insertInOrder(int number) {
        Stack<Integer> tempStack = new Stack<>(); // create a temporary stack

        // Move elements to the temporary stack until the correct position is found
        while (!stack.isEmpty() && stack.peek() > number) {
            tempStack.push(stack.pop()); // pop from the original stack and push to the temporary stack
        }

        // Insert the number
        stack.push(number);

        // Move elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop()); // pop from the temporary stack and push to the original stack
        }
    }

    /**
     * Returns a string representation of the stack.
     * 
     * @return A string representation of the stack.
     */
    @Override
    public String toString() {
        return stack.toString(); // prints the stack for the user as a string
    }
}
