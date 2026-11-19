package es.uniovi.ds.lab.main.basic;

import es.uniovi.ds.lab.collections.*;
import es.uniovi.ds.lab.output.*;

public class Exercise1 {

    public static void main(String[] args) throws Exception {

        Disk disk = new Disk();
        HtmlGenerator html = new HtmlGenerator();
        Printer printer = new Printer();

        var vector = Collections.vectorOf("Víctor", "Valentín", "Vidal", "Viviana");
        disk.save("vector.txt", vector);

        var linkedList = Collections.linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");
        html.write(linkedList);

        var doublyLinkedList = Collections.doublyLinkedListOf("Daniel", "Diego", "Damián", "Domingo");
        printer.print(doublyLinkedList);

        /*
           Now we want to generate HTML from the vector
         */        
        // html.write... vector...

        /*
           Now we want to print the linked list on the printer
         */        
        // printer.print... linkedList...

        /*
           Now we want to save the doubly linked list to the file "double.txt"
         */
        // disk.save..."double.txt"...doublyLinkedList...

        /*
         * Now we want to print the contents of the file "file.txt" on the printer
         */
        var fileVector = disk.load("file.txt");
        // printer.print... fileVector...
    }
}

/*
Expected output (the order doesn't matter):

------------------------------------------------
Creating file 'vector.txt'
Writing line: Víctor
Writing line: Valentín
Writing line: Vidal
Writing line: Viviana
[Closing file]
------------------------------------------------
<html>
  <body>
    <ul>
      <li>Lucas</li>
      <li>Leandro</li>
      <li>Lorenzo</li>
      <li>Luis</li>
    </ul>
  </body>
</html>
------------------------------------------------
Loading sheet...
Printing line: Daniel
Printing line: Diego
Printing line: Damián
Printing line: Domingo
Ejecting page
------------------------------------------------
<html>
  <body>
    <ul>
      <li>Víctor</li>
      <li>Valentín</li>
      <li>Vidal</li>
      <li>Viviana</li>
    </ul>
  </body>
</html>
------------------------------------------------
Loading sheet...
Printing line: Lucas
Printing line: Leandro
Printing line: Lorenzo
Printing line: Luis
Ejecting page
------------------------------------------------
Creating file 'doble.txt'
Writing line: Daniel
Writing line: Diego
Writing line: Damián
Writing line: Domingo
[Closing file]
------------------------------------------------
Loading sheet...
Printing line: Federico
Printing line: Fulgencio
Printing line: Fernando
Printing line: Fulvia
Ejecting page
*/
