package es.uniovi.ds.lab.main.basic;

import es.uniovi.ds.lab.output.*;

public class Exercise2 {

    public static void main(String[] args) throws Exception {

        Disk disk = new Disk();
        HtmlGenerator html = new HtmlGenerator();
        Printer printer = new Printer();

        var fileVector = disk.load("file.txt");
        disk.save("newFile.txt", fileVector);

        /*
           The previous solution loads the entire file into memory, which could be a
           problem if the file is very large. How could we copy it line by line without
           loading the entire file into memory?
         */        
        // disk.save... "newFile.txt"... "file.txt"...

        /*
           How could we generate HTML from "file.txt" without loading the entire file into memory?
         */        
        // html.write... "file.txt"...

        /*
           How could we send the contents of "file.txt" to the printer without loading the entire file into memory?
         */       
        // printer.print... "file.txt"...
    }
}