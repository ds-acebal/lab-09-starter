package es.uniovi.ds.lab.output;

import es.uniovi.ds.lab.collections.*;

public class Printer {
    
    public void print(DoublyLinkedList list) {
        
        System.out.println("------------------------------------------------");
        System.out.println("Loading sheet...");

        for (int i = 0; i < list.size(); i++)
            System.out.println("Printing line: " + list.get(i));

        System.out.println("Ejecting page");
    }
}
