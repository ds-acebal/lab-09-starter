package es.uniovi.ds.lab.collections;

public class DoublyLinkedList {

    private Node head;
    private int size;

    public DoublyLinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        head = new Node(value, null, head);
        if (head.next != null)
            head.next.previous = head;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);

        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;

        return current.value;
    }

    // * Doubly linked list node ------------------------------------

    private static class Node {

        String value;
        Node previous;
        Node next;

        public Node(String value, Node previous, Node next) {
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
