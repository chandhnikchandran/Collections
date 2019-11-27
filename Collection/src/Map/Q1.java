package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1 {
	public static void main(String args[])
	  {
	    Scanner s=new Scanner(System.in);
	    int age,i;
	    String name;
	    int n=s.nextInt();
	    Map<Integer,Employee> map=new HashMap<Integer,Employee>();
	    Employee[] emp=new Employee[n];
	    for(i=0;i<n;i++)
	    {
	    	name=s.next();
	    	age=s.nextInt();
	    	emp[i]=new Employee();
	    	emp[i].setAge(age);
	    	emp[i].setName(name);
	    	map.put(i,emp[i]);	
	    }
	    for(Map.Entry<Integer, Employee> en:map.entrySet())
	    {
	    	int key=en.getKey();
	    	Employee e=en.getValue();
	    	System.out.println(key+"\t"+e.getName()+"\t"+e.getAge());
	    }
	  }
}
