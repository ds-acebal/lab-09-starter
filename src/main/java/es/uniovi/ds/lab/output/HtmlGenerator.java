package es.uniovi.ds.lab.output;

import es.uniovi.ds.lab.collections.LinkedList;

public class HtmlGenerator {
    
    public void write(LinkedList list) {
        
        System.out.println("------------------------------------------------");
        System.out.println("<html>");
        System.out.println("  <body>");
        System.out.println("    <ul>");

        for (int i = 0; i < list.size(); i++)
            System.out.println("      <li>" + list.get(i) + "</li>");

        System.out.println("    </ul>");
        System.out.println("  </body>");
        System.out.println("</html>");
    }
}
