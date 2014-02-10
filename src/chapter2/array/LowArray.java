package chapter2.array;

//lowArray.java
//demonstrates array class with low-level interface
//to run this program: C>java LowArrayApp

import java.io.*; // for I/O
////////////////////////////////////////////////////////////////

class LowArray{
	private double[] a; // ref to array a
	
	public LowArray(int size) // constructor
	{
		a = new double[size];
	}
	
	//put element into array
	public void	setElem(int index, double value)
	{
		a[index] = value;
	}
	
	public double getElem(int index) // get element from array
	{
		return a[index];
	}
} // end class LowArray


