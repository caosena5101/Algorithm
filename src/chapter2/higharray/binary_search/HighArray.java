package chapter2.higharray.binary_search;

import java.util.ArrayList;




//highArray.java
//demonstrates array class with high-level interface
//to run this program: C>java HighArrayApp
// for I/O
////////////////////////////////////////////////////////////////
class HighArray
{
	private double[] a; // ref to array a
	private int nElems; // number of data items
	//----------------------------------------------------------

	public HighArray(int max) // constructor
	{
		a = new double[max]; // create the array
		nElems = 0; // no items yet
	}
	
	
	
	public int getNElems() {
		return nElems;
	}



	public void setNElems(int elems) {
		nElems = elems;
	}
	
	public double[] sort(){
		int len=nElems;
		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(a[i]>a[j]){
					double tem=a[i];
					a[i]=a[j];
					a[j]=tem;
				}
			}
		}
		return a;
	}



	//----------------------------------------------------------
	public int find(double searchKey){
		this.sort();
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		while(true){
			curIn = (lowerBound + upperBound ) / 2;
			if(a[curIn]==searchKey)
				return curIn; // found it
			else if(lowerBound > upperBound)
				return nElems; // can't find it
			else // divide range
			{
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1; // it's in upper half
				else
					upperBound = curIn - 1; // it's in lower half
			} // end else divide range
		} // end while
	} // end find()
	
	//----------------------------------------------------------
	public void insert(double value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}
	
	//----------------------------------------------------------
	public boolean delete(double value)
	{
		int j;
		for(j=0; j<nElems; j++) // look for it
			if( value == a[j] )
				break;
		if(j==nElems) // can't find it
			return false;
		else // found it
		{
			for(int k=j; k<nElems; k++) // move higher ones down
				a[k] = a[k+1];
			nElems--; // decrement size
			return true;
		}
	} // end delete()
	
	public void display() // displays array contents
	{
		for(int j=0; j<nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}
	//----------------------------------------------------------
} // end class HighArray