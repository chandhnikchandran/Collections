package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Clone {
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
	    ArrayList list1=(ArrayList)list.clone();//copy the values
	    
	    Iterator itr1=list1.iterator();//create object itr1 
	    System.out.println("The Clone values:");
	    while(itr1.hasNext())
	    {
	    	System.out.println(itr1.next());// print the list values
	    }
	  }
}
