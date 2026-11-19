package es.uniovi.ds.lab.collections;

public class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        head = new Node(value, head);
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

    // * Linked list node -------------------------------------------

    private static class Node {

        String value;
        Node next;

        public Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}