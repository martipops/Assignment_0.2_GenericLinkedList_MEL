/**
 * A generic linked list.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 0.2 - Generic Linked List
 * Fall/2023
 *
 * @param <T> The type of data stored in the LinkedList.
 */
public class LinkedList<T> {

    Node<T> head;
    int length;
    Node<T> tail;

    /**
     * Creates a new empty LinkedList.
     */
    public LinkedList() {
        head = null;
        length = 0;
        tail = head;
    }

    /**
     * Checks whether the linked list is empty or not.
     *
     * @return True if empty, otherwise false.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Retrieves the head node.
     *
     * @return The head node.
     */
    public Node<T> getList() {
        return head;
    }

    /**
     * Adds a new node to the end.
     *
     * @param aNode The node to add.
     */
    public void addNode(Node<T> aNode) {
        if (isEmpty()) {
            head = aNode;
            tail = head;
            return;
        }
        tail.nextNode = aNode;
        tail = tail.nextNode;
        tail.nextNode = null;
        length++;
    }

    
}
