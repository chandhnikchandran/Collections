package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ClearArrayList {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    ArrayList list=new ArrayList();
	    list.add("11");//add the values for the list
	    list.add("12");//add the values for the list
	    list.add("4");//add the values for the list
	    Iterator itr=list.iterator();//create object itr 
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());// print the list values
	    }
	    System.out.println("List Cleared..");
	    list.clear();//clear all the elements in the list
	    
	    
	    
	  }
	
}
