package List;

import java.util.*;

public class Linkedhashset {
	public static void main(String[] args)
	{
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add(20);
		l1.add(20);
		LinkedHashSet l2=new LinkedHashSet();
		l2.add(40);
		System.out.println("add(int index,object obj)" +l1.add(30));
		System.out.println(l1);
		System.out.println("add(int index,object obj)" +l1.add(l2));
		System.out.println(l1);
		System.out.println("removeall(collecton c)" +l1.removeAll(l2));
		System.out.println(l1);
		System.out.println("retainall(collection c)" +l1.retainAll(l2));
		System.out.println(l1);
		System.out.println("boolen contains(collection c)");
		System.out.println(l1);
		if(l1.contains("hello"))
		{
			System.out.println("hello is present");
		}
		else{
			System.out.println("hello is not present");
		}
		System.out.println("size(collection c)");
		System.out.println(l1);
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++)
		{
		//	System.out.println(l1.get(i));
		}
	}
	
}
