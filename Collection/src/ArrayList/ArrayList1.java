package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    ArrayList list=new ArrayList();
	    int first=s.nextInt();
	    int second=s.nextInt();
	    int third=s.nextInt();
	    int random=s.nextInt();
	    list.add(first);
	     list.add(second);
	     list.add(third);
	     list.add(random);
	    ArrayList list1=new ArrayList();
	    int one=s.nextInt();
	    int two=s.nextInt();
	    list1.add(one);
	    list1.add(two);
	    Iterator itr=list.iterator();
	    //System.out.printf("[");
	    //while(itr.hasNext())
	    {
	     //System.out.printf("%d ",itr.next()); 
	    }
	    //System.out.printf("]");
	    list.addAll(list1);
	    System.out.printf("[");
	    while(itr.hasNext())
	    {
	     System.out.printf("%d ",itr.next()); 
	    }
	    System.out.printf("]");
	  }
}
