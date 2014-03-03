package chapter5.first_last_link;

//firstLastList.java
//demonstrates list with first and last references
//to run this program: C>java FirstLastApp
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
