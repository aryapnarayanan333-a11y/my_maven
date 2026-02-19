package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ob=new ArrayList(); //non-generic ArrayList
		ob.add("Hello"); //to insert elements to objects add method is used
		ob.add('A');
		ob.add(4);
		ob.add(8.5);
		System.out.println(ob);
		
		
		ArrayList <String> ob1=new ArrayList(); //generic ArrayList
		ob1.add("World");
		ob1.add("Arya");
		ob1.add("Morning");
	System.out.println(ob1);
	
	ArrayList <String> ob2=new ArrayList();
	ob2.add("Night");
	ob2.add("Evening");
	ob2.add("Morning");
	System.out.println(ob2);
	ob2.remove(1); // to remove index elements
	System.out.println(ob2);

	ob1.addAll(ob2); // to add ob2 array list to ob1 arraylist
	System.out.println(ob1);

	ob1.removeAll(ob1); // to remove all elemnts from arraylist
	System.out.println(ob1);



	System.out.println(ob2.get(1)); // to get that index element get method is used
	
	System.out.println(ob2.size()); // to get index size
	
	boolean a= ob2.contains("Morning");
	System.out.println(a);
	
	boolean a1=ob2.contains("Green");
	System.out.println(a1);
	
	Iterator it=ob2.iterator();
	while(it.hasNext()) // to iteratre and print one by one
	{
		System.out.println(it.next());
	}
	it.remove(); // to remove last elements
	System.out.println(ob2);


		

	}

}
