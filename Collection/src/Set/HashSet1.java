package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSet1 {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    HashSet<String> set=new HashSet<String>();
	    set.add("Shyam");
	    set.add("Sasi");
	    set.add("Arun");
	    set.add("Vishnu");
	    set.add("Vimal");
	    set.add("Dhanush");
	    set.add("Yusuf");
	    set.add("Sasi");
	    set.add("Vimal");
	    //Traversing  elements
	    Iterator<String> itr=set.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	  }
}
