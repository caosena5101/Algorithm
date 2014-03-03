package chapter5.link_stack;

class LinkStack {
	private LinkList theList;

	// -------------------------------------------------------------
	public LinkStack() // constructor
	{
		theList = new LinkList();
	}

	// -------------------------------------------------------------
	public void push(double j) // put item on top of stack
	{
		theList.insertFirst(j);
	}

	// -------------------------------------------------------------
	public double pop() // take item from top of stack
	{
		return theList.deleteFirst();
	}

	// -------------------------------------------------------------
	public boolean isEmpty() // true if stack is empty
	{
		return (theList.isEmpty());
	}

	// -------------------------------------------------------------
	public void displayStack() {
		System.out.print("Stack (top-->bottom): ");
		theList.displayList();
	}
	// -------------------------------------------------------------
} // end class LinkStack