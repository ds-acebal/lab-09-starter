
package es.uniovi.ds.lab.main.basic;

import es.uniovi.ds.lab.collections.*;
import es.uniovi.ds.lab.output.*;

public class Exercise3 {

	public static void main(String[] args) throws Exception {

		Printer printer = new Printer();
		Disk disk = new Disk();

		var vector = Collections.vectorOf("Víctor", "Valentín", "Vidal");
		var linkedList = Collections.linkedListOf("Lucas", "Leandro", "Lorenzo");

		/*
		   We want to create a copy of "vector" in another vector, "vector2",
		   so that we can modify it independently.
		 */
		// Vector vector2 = ...;
		// printer.print... vector2...

		/*
		   Now we want to copy the elements from "vector2" into a doubly linked list, "doubleList2".
		 */
		// DoublyLinkedList doubleList2 = ...;
		// printer.print... doubleList2...

		/*
		   Next, we want to copy the elements from "doubleList2" into a vector, "vector3".
		 */
		// Vector vector3 = ...;
		// printer.print... vector3...

		/*
		   We also want to create a copy of "linkedList" in another linked list,
		   "linkedList2", so that we can modify it independently.
		 */
		// LinkedList linkedList2 = ...;
		// printer.print... linkedList2...

		/*
		   Finally, we want to load the lines from "file.txt" into a doubly
		   linked list, "doubleList3".
		 */
		// DoublyLinkedList doubleList3 = ...;
		// printer.print... doubleList3...
	}
}
