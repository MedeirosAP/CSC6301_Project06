package LinkedListPackage.src;

import java.util.LinkedList;

/**
 * The SortedLinkedList class that maintains a list of integers in sorted order.
 */
public class SortedLinkedList {
    private LinkedList<Integer> list; // Attribute: list

    /**
     * Constructs an empty SortedLinkedList.
     */
    public SortedLinkedList() {
        list = new LinkedList<>(); // create a new linked list
    }

    /**
     * Inserts a number into the list, maintaining sorted order.
     * 
     * @param number The number to be inserted.
     */
    public void insertInOrder(int number) {
        int i = 0;
        while (i < list.size() && list.get(i) < number) { // while index is contained within the list, and the value at the index is less than the number
            i++; // increment
        }
        list.add(i, number); // add the number to the list at index i
    }

    /**
     * Returns a string representation of the list.
     * 
     * @return A string representation of the list.
     */
    @Override
    public String toString() {
        return list.toString(); // prints the list for the user as a string
    }
}
