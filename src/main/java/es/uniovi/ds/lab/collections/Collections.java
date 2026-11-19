package es.uniovi.ds.lab.collections;

// This class provides utility methods for creating and initialising collections.

public class Collections {

    public static Vector vectorOf(String... elements) {
        Vector vector = new Vector();
        for (String element : elements)
            vector.add(element);
        return vector;
    }

    public static LinkedList linkedListOf(String... elements) {
        LinkedList list = new LinkedList();
        // Add elements in reverse order to maintain the input order
        for (int i = elements.length - 1; i >= 0; i--)
            list.add(elements[i]);
        return list;
    }

    public static DoublyLinkedList doublyLinkedListOf(String... elements) {
        DoublyLinkedList list = new DoublyLinkedList();
        // Add elements in reverse order to maintain the input order
        for (int i = elements.length - 1; i >= 0; i--)
            list.add(elements[i]);
        return list;
    }
}
