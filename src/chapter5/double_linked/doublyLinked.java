package chapter5.double_linked;

//doublyLinked.java
//demonstrates a doubly-linked list
//to run this program: C>java DoublyLinkedApp
////////////////////////////////////////////////////////////////
class Link {
	public double dData; // data item
	public Link next; // next link in list
	public Link previous; // previous link in list
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