package es.uniovi.ds.lab.output;

import java.io.*;
import java.util.Scanner;

import es.uniovi.ds.lab.collections.*;

public class Disk {

    public void save(String fileName, Vector vector) {
        System.out.println("------------------------------------------------");
        System.out.println("Creating file '" + fileName + "'");

        for (int i = 0; i < vector.size(); i++)
            System.out.println("Writing line: " + vector.get(i));

        System.out.println("[Closing file]");
    }

    public Vector load(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader(fileName));
        Vector vector = new Vector();
        
        while (scanner.hasNextLine()) {
            vector.add(scanner.nextLine());
        }

        scanner.close();
        return vector;
    }
}
