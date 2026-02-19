package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterfaceSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List obj=new ArrayList();
		obj.add("Hi");
		obj.add("Vamika");
		obj.add("GoodAfternoon");
		obj.add("List");
		System.out.println(obj);
		
		
		List obj1=new ArrayList();
		obj1.add("I");
		obj1.add("am");
		obj1.add("Learning");
		obj1.add("CollectionInterface");
		System.out.println(obj1);
		obj1.remove(1); // to remove elements from index
		System.out.println(obj1);
		
		obj.addAll(obj1);  // to add elements from obj1 to obj
		System.out.println(obj);
		
		obj1.removeAll(obj1); // to remove all elements from obj1
		System.out.println(obj1);
		
		
		System.out.println(obj.get(1)); // to get that index element get method is used
		
		System.out.println(obj.size());
		
		
		boolean b= obj.contains("List");
		System.out.println(b);
		
		boolean b1=obj.contains("Red");
		System.out.println(b1);
		
		
		Iterator it=obj.iterator();
		while(it.hasNext()) // to iterate and print one by one
		{
			System.out.println(it.next());
		}
		it.remove(); // to remove last elements
		System.out.println(obj);
		

	}

}
