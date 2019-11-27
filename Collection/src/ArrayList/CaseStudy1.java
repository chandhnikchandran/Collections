package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//import Arraylist.Customer;

public class CaseStudy1 {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    ArrayList list=new ArrayList();//create ArrayList Object list
	    //list.add("11");//add the values for the list
	    System.out.println("Enter no:");
	    int n=s.nextInt();
	    Customer[] cust=new Customer[n];
	    int j=1;
	    String  yn;
		
			int i;
			for(i=0;i<n;i++)
			{
		System.out.println("Enter Name:");
	    String name=s.next();
	    cust[i]=new Customer();
		cust[i].setName(name);
		//add the name to list
	    System.out.println("Enter Your Address:");
	    String address=s.next();
	    //cust[i]=new Customer();
		cust[i].setAddress(address);
		//add address to the list
	    System.out.println("Contact Number:");
	    int cno=s.nextInt();
	    cust[i].setCno(cno);
		//add contactnumber to the list
	    System.out.println("Email Id:");
	    String email=s.next();
	    cust[i].setEmail(email);
		//add email to the list
	    System.out.println("Proof Type:");
	    String prooftype=s.next();
	    cust[i].setProoftype(prooftype);
		//add prooftype to the list
	    System.out.println("Enter proof id:");
	    String proofid=s.next();
	    cust[i].setProofid(proofid);
		//add proofid to the list
	    System.out.printf("Thank you for registering. Your id is %d...",j);
	    j++;
	    //System.out.printf("Do you want to continue registration (y/n)?");
	    //yn=s.next();
	    
	    System.out.println("Do you want to update the email id?(yes/no)");
	    String upemail=s.next();
	    String x=upemail.toUpperCase();
	    if(x.equals("Y"))
	    {
	    	System.out.println("Update Email");
	    	System.out.println("Enter New Email Id");
	    	String email1=s.next();
	    	
	    	cust[i].setName(name);
	    	cust[i].setAddress(address);
	    	cust[i].setCno(cno);
	    	cust[i].setEmail(email1);
	    	cust[i].setProoftype(prooftype);
	    	cust[i].setProofid(proofid);
	    }
	    else
	    {
	    	cust[i].setName(name);
	    	cust[i].setAddress(address);
	    	cust[i].setCno(cno);
	    	cust[i].setEmail(email);
	    	cust[i].setProoftype(prooftype);
	    	cust[i].setProofid(proofid);

	    }
	    list.add(cust[i]);
	    
			}
	    
							
	    
	    Iterator<Customer> itr=list.iterator();//it is used for traverse elements one by one 
	    
		for(i=0;itr.hasNext();i++)
		{
			Customer c=itr.next();
			System.out.println();
			int d=i;
			d++;
			System.out.println("Details for Customer"+d);
			System.out.println();
			System.out.println("Name: "+c.getName());
			System.out.println("Address: "+c.getAddress());
			System.out.println("Contact Number: "+c.getCno());
			System.out.println("Email id: "+c.getEmail());
			System.out.println("Proof Id: "+c.getProoftype());
			System.out.println("Proof Id: "+c.getProofid());//print values
			
		}
		System.out.printf("\nDetails for Customers:");
		System.out.printf("\n-----------------------");
		System.out.printf("\nId\tName");
		System.out.printf("\n-----------------------");
		for(i=0;i<n;i++)
		{
		
		System.out.println("\n"+i+"\t"+cust[i].name);
		
		}
		System.out.println("\nDo you want to delete :");
		String del=s.next();
		System.out.println("Enter index:");
	    int m=s.nextInt();
	    String xd=del.toUpperCase();
	    
	    if(xd.equals("Y"))
	    {
	    	list.remove(m);
	    	System.out.printf("index %d is Removed",m);
	    	System.out.printf("Display details after Removing...");
	    	Iterator<Customer> itr1=list.iterator();
	    	for(i=0;itr1.hasNext();i++)
			{
	    		int d=i;
	    		d++;
				Customer c=itr1.next();
				System.out.println();
				System.out.printf("Details for Customer"+d);
				System.out.println();
				System.out.println("Name: "+c.getName());
				System.out.println("Address: "+c.getAddress());
				System.out.println("Contact Number: "+c.getCno());
				System.out.println("Email id: "+c.getEmail());
				System.out.println("Proof Id: "+c.getProoftype());
				System.out.println("Proof Id: "+c.getProofid());//print values
				
			}

	    }
	    

	  }
}
