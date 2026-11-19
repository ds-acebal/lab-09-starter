package es.uniovi.ds.lab.collections;

public class Vector {

    private String[] elements;
    private int size;

    public Vector() {
        elements = new String[20];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(String value) {
        if (size == elements.length)
            throw new IllegalStateException("The element cannot be added: the vector is full.");
        elements[size] = value;
        size++;
    }

    public String get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", size: " + size);

        return elements[index];
    }
}