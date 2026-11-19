
package es.uniovi.ds.lab.main.extended;

import es.uniovi.ds.lab.collections.*;
import es.uniovi.ds.lab.output.*;

public class Exercise7 {

    public static void main(String[] args) throws Exception {

        Disk disk = new Disk();
        Printer printer = new Printer();

        // Starting players for both teams
        Vector homeStarters = Collections.vectorOf("Bartholomew", "Milhouse", "Harry");
        Vector awayStarters = Collections.vectorOf("Johansson", "Peter", "Bill");

        /*
           1. Save the starting players from both teams in a single file named
              "Both teams starters.txt".
         */
        // disk.save... "Both teams starters.txt"... homeStarters... awayStarters...

        /*
           2. Create a file named "All home team players.txt" containing the home
              team's starting players followed by its substitutes, which are stored
              in "Home team substitutes.txt".
         */
        // disk.save... "All home team players.txt"... homeStarters... "Home team substitutes.txt"...

        /*
           3. Find the first away team player whose name starts with 'A'.
              Search the starting players first, then the substitutes stored in
              "Away team substitutes.txt", stopping as soon as a match is found.
         */
        // String startsWithA = ... awayStarters... "Away team substitutes.txt"...
        // System.out.println("\n\nFirst away team player whose name starts with 'A': " + startsWithA + "\n");

        /*
           4. Send the names of the starting players from both teams to the printer
              in uppercase, with the away team first.
         */
        // printer.print... awayStarters... homeStarters...
    }
}

/*
Expected output:
------------------------------------------------
Creating file 'Both teams starters.txt'
Bartholomew
Milhouse
Harry
Johansson
Peter
Bill
[Closing file]
------------------------------------------------
Creating file 'All home team players.txt'
Bartholomew
Milhouse
Harry
Homer
Hank
Henry
[Closing file]


First away team player whose name starts with 'A': Arnold

------------------------------------------------
Loading sheet...
Printing line: JOHANSSON
Printing line: PETER
Printing line: BILL
Printing line: BARTHOLOMEW
Printing line: MILHOUSE
Printing line: HARRY
Ejecting page
*/
