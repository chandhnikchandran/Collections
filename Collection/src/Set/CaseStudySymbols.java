package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CaseStudySymbols {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    String symbol;
	    int num,count=0;
	   // HashSet<String> set=new HashSet<String>();
	    Set<NewCard> obj=new TreeSet<NewCard>(new Symbol());
	    NewCard[] c=new NewCard[40];
	    System.out.println("Enter No.of Symbols:");
	    int n=s.nextInt();
	    int i;
	    while(obj.size()<n)
	    {
	    	symbol=s.next();
	    	num=s.nextInt();
	    	c[count]=new NewCard();
	    	c[count].setSymbol(symbol);
	    	c[count].setNum(num);
	    	obj.add(c[count]);
	    	count++;
	    }
	    System.out.println(n+"Symbol gathered in "+count+"Cards");
	    System.out.println("Cards are");
	    Iterator<NewCard> itr=obj.iterator();
	    while(itr.hasNext())
	    {
	    	NewCard ca=(NewCard)itr.next();
	    	System.out.println(ca.getSymbol()+""+ca.getNum());
	    }
	    
	  }

}
