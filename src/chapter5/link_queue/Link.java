package chapter5.link_queue;

//linkQueue.java
//demonstrates queue implemented as double-ended list
//to run this program: C>java LinkQueueApp
import java.io.*; // for I/O
////////////////////////////////////////////////////////////////

class Link {
	public double dData; // data item
	public Link next; // next link in list
	// ------------------------------------------------------------

	public Link(double d) // constructor
	{
		dData = d;
	}

	// ------------------------------------------------------------
	public void displayLink() // display this link
	{
		System.out.print(dData + " ");
	}
	// ------------------------------------------------------------
} // end class Link