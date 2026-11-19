
package es.uniovi.ds.lab.main.extended;

import es.uniovi.ds.lab.collections.*;
import es.uniovi.ds.lab.output.*;

public class Exercise6 {

    public static void main(String[] args) {

        Printer printer = new Printer();
        HtmlGenerator html = new HtmlGenerator();

        var vector = Collections.vectorOf("Víctor", "Valentín", "Vidal", "Viviana");
        var linkedList = Collections.linkedListOf("Lucas", "Leandro", "Lorenzo", "Luis");

        // * Section A ------------------------------------------------

        System.out.println("\n\n## Section A");

        /*
           1. Print the names in the vector in uppercase.
         */

        // Approach 1: Create an auxiliary vector to store the uppercase names before printing.

        var upperCaseVector = new Vector();
        for (int i = 0; i < vector.size(); i++)
            upperCaseVector.add(vector.get(i).toUpperCase());
        // printer.print... upperCaseVector...

        // ? Can you think of a better approach that avoids creating another vector?

        /*
           2. Generate HTML using only the first four characters of each name in the linked list
              (name.substring(0, 4)). For example, "Lucas" should become "Luca".
         */
        // html.write...

        /*
           3. Print the names in the vector preceded by "Mr. " (for example, "Mr. Víctor").
         */
        // printer.print...

        // ? Can you find a way to implement all three transformations without creating a
        // ? separate class for each one?

        // * Section B ------------------------------------------------

        System.out.println("\n\n## Section B");

        /*
           4. Print only the names in the vector that have exactly five characters (name.length() == 5).
         */
        // printer.print...

        /*
           5. Print only the names in the linked list that contain 'u' in either of their first
              two characters (name.substring(0, 2).contains("u")).
         */
        // printer.print...

        // * Section C ------------------------------------------------

        System.out.println("\n\n## Section C");

        /*
           6. Print only the names in the linked list that have seven characters (name.length() == 7),
              preceded by "Mr. ".
         */
        // printer.print...
    }
}

/*
Expected output:

## Section A
------------------------------------------------
Loading sheet...
Printing line: VÍCTOR
Printing line: VALENTÍN
Printing line: VIDAL
Printing line: VIVIANA
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: VÍCTOR
Printing line: VALENTÍN
Printing line: VIDAL
Printing line: VIVIANA
Ejecting page
------------------------------------------------
<html>
  <body>
    <ul>
      <li>Luca</li>
      <li>Lean</li>
      <li>Lore</li>
      <li>Luis</li>
    </ul>
  </body>
</html>
------------------------------------------------
Loading sheet...
Printing line: Mr. Víctor
Printing line: Mr. Valentín
Printing line: Mr. Vidal
Printing line: Mr. Viviana
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: VÍCTOR
Printing line: VALENTÍN
Printing line: VIDAL
Printing line: VIVIANA
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Luca
Printing line: Lean
Printing line: Lore
Printing line: Luis
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Mr. Víctor
Printing line: Mr. Valentín
Printing line: Mr. Vidal
Printing line: Mr. Viviana
Ejecting page


## Section B
------------------------------------------------
Loading sheet...
Printing line: Vidal
Ejecting page
------------------------------------------------
Loading sheet...
Printing line: Lucas
Printing line: Luis
Ejecting page


## Section C
------------------------------------------------
Loading sheet...
Printing line: Mr. Leandro
Printing line: Mr. Lorenzo
Ejecting page
*/
