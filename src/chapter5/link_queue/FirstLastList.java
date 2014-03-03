package chapter5.link_queue;

class FirstLastList {
	private Link first; // ref to first item
	private Link last; // ref to last item
	// ------------------------------------------------------------

	public FirstLastList() // constructor
	{
		first = null; // no items on list yet
		last = null;
	}

	// ------------------------------------------------------------
	public boolean isEmpty() // true if no links
	{
		return first == null;
	}

	// ------------------------------------------------------------
	public void insertLast(double dd) // insert at end of list
	{
		Link newLink = new Link(dd); // make new link
		if (isEmpty()) // if empty list,
			first = newLink; // first --> newLink
		else
			last.next = newLink; // old last --> newLink
		last = newLink; // newLink <-- last
	}

	// ----------------------------------1------------------------
	public double deleteFirst() // delete first link
	{ // (assumes non-empty list)
		double temp = first.dData;
		if (first.next == null) // if only one item
			last = null; // null <-- last
		first = first.next; // first --> old next
		return temp;
	}

	// ------------------------------------------------------------
	public void displayList() {
		Link current = first; // start at beginning
		while (current != null) // until end of list,
		{
			current.displayLink(); // print data
			current = current.next; // move to next link
		}
		System.out.println("");
	}
	// ------------------------------------------------------------
} // end class FirstLastList