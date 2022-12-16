package List;
import java.util.*;
public class Arraylist {
public static void main(String[] args)
{
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20.56);
	l1.add("hello");
	l1.add('A');
	l1.add(null);
	ArrayList l2=new ArrayList();
	l2.add('A');
	l2.add('B');
	l2.add('c');
	System.out.println(l1);
	System.out.println("*****add(int index,object obj)****");
	l1.add(3, true);
	System.out.println(l1);
	System.out.println("*****addAll(collection c) and Addll(int index, collection c)****");
	l1.add(l2);
	
	System.out.println(l1);
	l1.add(2,l2);
	System.out.println(l1);
	System.out.println("*****removeall(collection c)****");
	l1.removeAll(l2);//remove duplicate
	System.out.println(l1);
	System.out.println(l1);
	System.out.println("*****retainAll(collection c)****");
	l1.retainAll(l2);//fetch duplicate value
	System.out.println(l1);
	System.out.println(l1);
	System.out.println("****boolean content(collection)****");
	if(l1.contains("hello"))
	{
		System.out.println("hello is present");
	}
	else{
		System.out.println("hello is not present");
	}
	System.out.println(l1.toString());
	System.out.println(l1.size());
	for(int i=0;i<l1.size();i++)
	{
		System.out.println(l1.get(i));
	}
	}
}
