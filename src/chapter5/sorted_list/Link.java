package chapter5.sorted_list;

//sortedList.java
//demonstrates sorted list
//to run this program: C>java SortedListApp
import java.io.*; // for I/O
////////////////////////////////////////////////////////////////

class Link {
	public double dData; // data item
	public Link next; // next link in list
	// ------------------------------------------------------------

	public Link(double dd) // constructor
	{
		dData = dd;
	}

	// ------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(dData + " ");
	}
} // end class Link