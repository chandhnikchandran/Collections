package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import ArrayList.Customer;

public class CaseStudyBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		 HashSet set=new HashSet();
		 
		 Booking[] bo=new Booking[20];
		int n;
		int a=0,b=0,c=0,d=0,e=0;
		int total=0;
		int i=0,j=1;
		do
		{
			System.out.println("Menu");
			System.out.println("1.Book\n2.Check Status\n3.Exit");
			n=s.nextInt();
			if(n==1)
			{
				System.out.println("Booking");
				System.out.println("Please choose the service required");
				System.out.println("AC/NonAC(AC/nAC)");
				String ac=s.next();
				if(ac.contentEquals("AC")==true) {a=1500;}
				else {a=700;}
				System.out.println("Cot(Single/Double)");
				String cot=s.next();
				if(cot.contentEquals("Single")==true) {b=50;}
				else {b=100;}
				System.out.println("With Cabel connection/without cabel connection(C/nC)");
				String nc=s.next();
				if(nc.contentEquals("C")==true) {c=50;}
				else {c=0;}

				System.out.println("Wifi Connection(w/nw)");
				String wifi=s.next();
				if(wifi.contentEquals("W")==true) {d=200;}
				else {d=0;}
				System.out.println("Laundry needed or not(L/nL)");
				String nl=s.next();
				if(nl.contentEquals("L")==true) {e=100;}
				else {e=0;}
				
				total=a+b+c+d+e;
				System.out.println("Total Charge is:"+total);
				System.out.println("Do you want to proceed(yes/no):");
				String str=s.next();
				if(str.equals("yes"))
				{
					System.out.println("Thank you for booking. your room no. is "+j);
					
					
					j++;
					Iterator<Booking> itr=list.iterator();
					//while(itr.hasNext())
					{
						
						//System.out.println(itr.next());
						
					}
				}
				else
				{
					System.out.println("Your room is not booked");
				}
				bo[i].setAc(ac);
				
				Iterator itr1=list.iterator();
				//while(itr1.hasNext())
				{
					//list.add(ac);
					list.add(cot);
					list.add(nc);
					list.add(wifi);
					list.add(nl);
					
				}
				
			}
			if(n==2)
			{
				System.out.println("Check Status");
				System.out.println("Enter Room number:");
				int room=s.nextInt();
				if(room==j)
				{
					System.out.printf("\nRoom Number %d is Booked",i);
				}
				else
				{
					System.out.println("Is Not Booked");
				}
			}
			if(n==3)
			{
				return;
			}
			if(n>3)
			{
				System.out.println("Invalid Input");
			}
			
		}while(n!=0);
		
	}
}
