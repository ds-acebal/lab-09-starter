
package es.uniovi.ds.lab.main.basic;

import es.uniovi.ds.lab.collections.*;
import es.uniovi.ds.lab.model.*;

public class Exercise4 {

    public static void main(String[] args) throws Exception {

        var homeTeam = new Team("Lucareños", Collections.linkedListOf("Homer", "Hank", "Harry"));
        var awayTeam = new Team("Negreira Boys", Collections.linkedListOf("Arnold", "Aaron", "Albert"));

        var match = new Match(homeTeam, awayTeam);
        match.play();

        /*
           Follow these steps:
        
           1. Read the Team and Match classes.
        
           2. Modify Team so that it stores its players in a vector instead of a linked list.
              - Considering the changes required, do you think the original design was
                adequate? Why or why not?
              - Improve the design if you consider it necessary.
        
           3. Modify Team again so that its players are stored in a doubly linked list
              instead of a vector.
              - Did you need to modify Match as well?
        
           4. Finally, modify the code at the beginning of this method to load the player names
              from "Home team substitutes.txt" and "Away team substitutes.txt", respectively.
        
              Team homeTeam = new Team("Lucareños", ... "Home team substitutes.txt" ...);
              Team awayTeam = new Team("Negreira Boys", ... "Away team substitutes.txt" ...);
         */
    }
}
