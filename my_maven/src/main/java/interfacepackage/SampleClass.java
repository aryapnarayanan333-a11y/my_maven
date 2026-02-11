package interfacepackage;

public class SampleClass implements InterfaceSample{
	
	public void print()
	{
		System.out.println("Method of class");
	}

	
	public void display()
	{
		System.out.println("Method in Interface");
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SampleClass ob=new SampleClass();
		ob.print();
		ob.display();
		ob.add();
		System.out.println(ob.a);
		
		InterfaceSample obj=new SampleClass();
		//obj.print();// we cannot use class method in interface objects.
		obj.display();
		obj.add();
		System.out.println(obj.b);
	}

}
