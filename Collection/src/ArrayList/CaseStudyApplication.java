package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CaseStudyApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,f=0; 
		int count=0;
		int i=0;
		int index=1;
		ArrayList list=new ArrayList();
		do
		{
			System.out.println("1.Display installed applications\n2.Install an application\n3.Uninstall an application\n4.Quit");
			n=s.nextInt();
		
		Application[] app=new Application[20];
		
		if(n==1)
		{
			boolean tf=list.isEmpty();
			if(tf==true)
			{
				System.out.println("There is no Application Installed\n");
			}
			else
			{
				Iterator itr=list.iterator();
				while(itr.hasNext())
				{
					
					System.out.println(itr.next());
					
				}
			}
		}
		if(n==2)
		{
			System.out.println("Enter Application Name:");
			String str=s.next();
			Iterator itr1=list.iterator();
			while(itr1.hasNext())
			{
				String st=(String)itr1.next();
			
			if(st.equals(str))
			{
				f=1;
				break;
			}
			//list.add(app);
			}
			if(f==1)
			{
				System.out.println("Already Installed...");
			}
			else
			{
				list.add(str);
				System.out.println("Application Successfully Installed...");
			}
		}
		if(n==3)
		{
			boolean tf=list.isEmpty();
			if(tf==true)
			{
				System.out.println("There is no Application Installed\n");
			}
			else
			{
			Iterator itr2=list.iterator();
			for(i=0;itr2.hasNext();i++)
			{
				System.out.println(i+" "+itr2.next());
			}
				System.out.println("Enter the index no. to be deleted...");
				index=s.nextInt();
				list.remove(index);
				System.out.println("Application uninstalled successfully...");
			}
		}
		if(n==4)
		{
			System.out.println("Successfully Exit");
			return;
		}
		if(n>4)
		{
			System.out.println("Invalid Input");
		}
		}while(n!=0); 
		
		
	}

}
