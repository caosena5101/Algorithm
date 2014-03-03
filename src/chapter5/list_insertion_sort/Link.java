package chapter5.list_insertion_sort;

//listInsertionSort.java
//demonstrates sorted list used for sorting
//to run this program: C>java ListInsertionSortApp
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
} // end class Link