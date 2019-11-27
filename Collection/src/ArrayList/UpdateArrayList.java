package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpdateArrayList {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    ArrayList list=new ArrayList();//create ArrayList Object list
	    list.add("11");//add the values for the list
	    list.add("12");//add the values for the list
	    list.add("4");//add the values for the list
	    Iterator itr=list.iterator();//create object itr 
	    System.out.println("The List values:");
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());// print the list values
	    }
	    System.out.println("Update values:");
	    list.set(2,"34");
	    Iterator itr1=list.iterator();//create object itr 
	    System.out.println("The List values:");
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());// print the list values
	    }
	  }
}
