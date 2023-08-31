/**
 * Tests the linked list.
 * 
 * @author Marti Lonnemann
 * @version 1.0
 * Assignment 0.2 - Generic Linked List
 * Fall/2023
 *
 * @param <T> The type of data stored in the LinkedList.
 */

public class Application {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();

        Node<Integer> aNode = new Node<>();
        aNode.setData(1);
        myList.addNode(aNode);

        aNode = new Node<>();
        aNode.setData(2);
        myList.addNode(aNode);

        Node<Integer> tempNode = myList.getList();
        while (tempNode != null) {
            System.out.println(tempNode.data);
            tempNode = tempNode.nextNode;
        }
    }
}
