import java.io.*;
import java.util.*;
public class iterator
{
 public static void main(String args[])
{
	ArrayList a1 = new ArrayList();
	a1.add("C");
	a1.add("A");
	a1.add("E");
	a1.add("B");
	a1.add("D");
	a1.add("F");
	System.out.println("original contents of a1:");
	Iterator itr = a1.iterator();
	while(itr.hasNext())
	{
		Object element = itr.next();
		System.out.println(""+element);
	}
	System.out.println();
	ListIterator litr = a1.listIterator();
	while(litr.hasNext())
	{
		Object element = litr.next();
		litr.set(element+"+");
	}
	System.out.println("modified contents of a1:");
	itr = a1.iterator();
	while(itr.hasNext())
	{
		Object element = itr.next();
		System.out.println(""+element);
	}
	System.out.println();
	System.out.println("modified list backwards");
	while(litr.hasPrevious())
	{
		Object element = litr.previous();
		System.out.print(""+element);
	}
	System.out.println();
}
}