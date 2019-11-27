package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist1 {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter no:");
	    int n=s.nextInt();//
	    int i;
	    LinkedList list=new LinkedList();
	    for(i=0;i<n;i++)
	    {
	    	System.out.println("Enter name:");
	    	String name=s.next();
	    	System.out.println("Enter Address:");
	    	String address=s.next();
	    	System.out.println("Enter Age:");
	    	int age=s.nextInt();
	    	list.add(name);
	    	list.add(address);
	    	list.add(age);
	    	
	    }
	    //String str1=s.next();
	    System.out.println("Size of List "+list.size());
	    System.out.println("List is "+list.isEmpty());
	    
	    
	  }
}
