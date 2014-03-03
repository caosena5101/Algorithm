package chapter5.link_stack;

//linkStack.java
//demonstrates a stack implemented as a list
//to run this program: C>java LinkStackApp
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
	public void displayLink() // display ourself
	{
		System.out.print(dData + " ");
	}
} // end class Link