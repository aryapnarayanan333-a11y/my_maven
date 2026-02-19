package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob=new LinkedList();
		ob.add("Hi");
		ob.add("Aryaa");
		ob.add("GoodMorning");
		ob.add("LinkedList");
		System.out.println(ob);
		
		
		LinkedList ob1=new LinkedList();
		ob1.add("I");
		ob1.add("am");
		ob1.add("Learning");
		ob1.add("collectionClass");
		System.out.println(ob1);
		ob1.remove(1); // to remove elements from index
		System.out.println(ob1);
		
		ob.addAll(ob1);  // to add elements from ob1 to ob
		System.out.println(ob);
		
		ob1.removeAll(ob1); // to remove all elements from ob1
		System.out.println(ob1);
		
		
		System.out.println(ob.get(1)); // to get that index element get method is used
		
		System.out.println(ob.size());
		
		
		boolean b= ob.contains("Aryaa");
		System.out.println(b);
		
		boolean b1=ob.contains("Green");
		System.out.println(b1);
		
		
		Iterator it=ob.iterator();
		while(it.hasNext()) // to iterate and print one by one
		{
			System.out.println(it.next());
		}
		it.remove(); // to remove last elements
		System.out.println(ob);
		
		
		

	}

}
