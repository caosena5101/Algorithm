package chapter5.link_queue;

class LinkQueue {
	private FirstLastList theList;

	// -------------------------------------------------------------
	public LinkQueue() // constructor
	{
		theList = new FirstLastList(); // make a 2-ended list
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if queue is empty
	{
		return theList.isEmpty();
	}

	// -------------------------------------------------------------
	public void insert(double j) // insert, rear of queue
	{
		theList.insertLast(j);
	}

	// -------------------------------------------------------------
	public double remove() // remove, front of queue
	{
		return theList.deleteFirst();
	}

	// -------------------------------------------------------------
	public void displayQueue() {
		System.out.print("Queue (front-->rear): ");
		theList.displayList();
	}
	// -------------------------------------------------------------
} // end class LinkQueue